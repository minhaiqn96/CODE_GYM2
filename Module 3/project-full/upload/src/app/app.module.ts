import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserComponent } from './component/user/user.component';
import { PostComponent } from './component/post/post.component';
import { UserLoginComponent } from './component/user/user-login/user-login.component';
import { UserRegisterComponent } from './component/user/user-register/user-register.component';
import { PostEditComponent } from './component/post/post-edit/post-edit.component';
import { PostViewComponent } from './component/post/post-view/post-view.component';
import { PostAddComponent } from './component/post/post-add/post-add.component';
import { BooksComponent } from './component/books/books.component';
import { BookDoneComponent } from './component/books/book-done/book-done.component';
import { BookNoneComponent } from './component/books/book-none/book-none.component';
import { ListBooksComponent } from './component/books/list-books/list-books.component';
import { BookEditComponent } from './component/books/book-edit/book-edit.component';
import { BookAddComponent } from './component/books/book-add/book-add.component';

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    PostComponent,
    UserLoginComponent,
    UserRegisterComponent,
    PostEditComponent,
    PostViewComponent,
    PostAddComponent,
    BooksComponent,
    BookDoneComponent,
    BookNoneComponent,
    ListBooksComponent,
    BookEditComponent,
    BookAddComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
