import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'testInputSinglePageApp';

  arrayCha: Array<string> = ["a","b","c"];
  
  addName(value:string){
    this.arrayCha.push(value);
  }
}
