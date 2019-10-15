import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ParentComponent } from './components/parent/parent.component';
import { ShowhomeComponent } from './components/showhome/showhome.component';
import { ReadedComponent } from './components/readed/readed.component';
import { NotreadComponent } from './components/notread/notread.component';
import { HttpClientModule} from "@angular/common/http";
import { CreateComponent } from './components/create/create.component';
import { FormsModule } from '@angular/forms';
import { EditComponent } from './components/edit/edit.component';
import { BookServiceService } from './services/book-service.service';
@NgModule({
  declarations: [
    AppComponent,
    ParentComponent,
    ShowhomeComponent,
    ReadedComponent,
    NotreadComponent,
    CreateComponent,
    EditComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [BookServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
