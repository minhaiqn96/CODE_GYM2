import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ParentComponent } from './components/parent/parent.component';
import { ShowhomeComponent } from './components/showhome/showhome.component';
import { ReadedComponent } from './components/readed/readed.component';
import { NotreadComponent } from './components/notread/notread.component';
import { CreateComponent } from './components/create/create.component';
import { EditComponent } from './components/edit/edit.component';


const routes: Routes = [
  {
    path: '',
    redirectTo: 'books',
    pathMatch: 'full',
  },
  {
    path: 'books',
    component: ParentComponent,
    children: [
      {
        path: '',
        component: ShowhomeComponent,
      },
      {
        path: 'readed',
        component: ReadedComponent
      },
      {
        path: 'notread',
        component: NotreadComponent
      },
      {
        path: 'create',
        component: CreateComponent
      },
      {
        path: ':id',
        component: EditComponent,
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
