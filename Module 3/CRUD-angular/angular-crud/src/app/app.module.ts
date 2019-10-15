import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ShowhomeComponent } from './components/showhome/showhome.component';
import { CreateComponent } from './components/create/create.component';
import { ShowParentComponent } from './components/show-parent/show-parent.component';
import { EditComponent } from './components/edit/edit.component';
import { AwesomeServiceService } from './services/awesome-service.service';
import { HttpClientModule} from "@angular/common/http";
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    ShowhomeComponent,
    CreateComponent,
    ShowParentComponent,
    EditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [AwesomeServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
