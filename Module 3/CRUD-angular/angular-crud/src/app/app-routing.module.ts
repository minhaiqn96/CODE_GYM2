import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ShowhomeComponent } from './components/showhome/showhome.component';
import { CreateComponent } from './components/create/create.component';
import { ShowParentComponent } from './components/show-parent/show-parent.component';
import { EditComponent } from './components/edit/edit.component';


const routes: Routes = [
  {
    path: '',
    redirectTo: 'awesome',
    pathMatch: 'full',
  },
  {
    path: 'awesome',
    component: ShowParentComponent,
    children: [
      {
        path: '',
        component: ShowhomeComponent
      },
      {
        path: 'create',
        component: CreateComponent
      },
      {
        path: ':id',
        component: EditComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
