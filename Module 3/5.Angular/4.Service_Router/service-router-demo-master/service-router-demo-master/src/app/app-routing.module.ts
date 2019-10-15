import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DictionaryPageComponent } from './components/dictionary-page/dictionary-page.component';
import { DictionaryDetailComponent } from './components/dictionary-detail/dictionary-detail.component';
import { DictionaryAdminGuard } from './guards/dictionary-admin.guard';
import { DictionaryDetailAdminGuard } from './guards/dictionary-detail-admin.guard';


const routes: Routes = [{
  path: 'dictionary',
  component: DictionaryPageComponent,
  canActivate: [DictionaryAdminGuard],
  canActivateChild: [DictionaryDetailAdminGuard],
  canDeactivate: [DictionaryDetailAdminGuard],
  children: [
    {
      path: ':key',
      component: DictionaryDetailComponent,
    }
  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
