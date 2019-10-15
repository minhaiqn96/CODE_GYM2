import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListNameComponent } from './list-name/list-name.component';
import { TestParentChildComponent } from './test-parent-child/test-parent-child.component';

@NgModule({
  declarations: [
    AppComponent,
    ListNameComponent,
    TestParentChildComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
