import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserRegisterComponent } from './component/user/user-register/user-register.component';
import { UserLoginComponent } from './component/user/user-login/user-login.component';
import { PostViewComponent } from './component/post/post-view/post-view.component';
import { PostEditComponent } from './component/post/post-edit/post-edit.component';
import { PostAddComponent } from './component/post/post-add/post-add.component';
import { LoginGuardGuard } from './guard/login-guard.guard'
import { BooksComponent } from './component/books/books.component';
import { ListBooksComponent } from './component/books/list-books/list-books.component';
import { BookDoneComponent } from './component/books/book-done/book-done.component';
import { BookNoneComponent } from './component/books/book-none/book-none.component';
import { BookAddComponent } from './component/books/book-add/book-add.component';
import { BookEditComponent } from './component/books/book-edit/book-edit.component';


const routes: Routes = [
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full',
  },
  {
    path: 'register',
    component: UserRegisterComponent
  },

  {
    path: 'home',
    component: UserLoginComponent,
  },
  {
    path: 'book',
    component: BooksComponent,
    children: [
      {
        path: '',
        component: ListBooksComponent,
      },
      {
        path: 'done',
        component: BookDoneComponent,
      },
      {
        path: 'none',
        component: BookNoneComponent,
      },
      {
        path: 'addbook',
        component: BookAddComponent,
      },
      {
        path: 'edit/:id',
        component: BookEditComponent,
      },
    ]
  },
  {
    path: 'edit/:id',
    component: PostEditComponent,
    canActivate: [LoginGuardGuard]
  },
  {
    path: 'view/:id',
    component: PostViewComponent,
    canActivate: [LoginGuardGuard]
  },
  {
    path: 'home/addpost',
    component: PostAddComponent,
    canActivate: [LoginGuardGuard],
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
