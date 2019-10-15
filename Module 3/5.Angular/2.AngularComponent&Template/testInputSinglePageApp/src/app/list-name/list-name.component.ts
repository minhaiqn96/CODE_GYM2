import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-list-name',
  templateUrl: './list-name.component.html',
  styleUrls: ['./list-name.component.css']
})
export class ListNameComponent implements OnInit {

  @Input()
  arrayCon: Array<string> = ["2", "3", "4", "5"];
  
  constructor() { }

  ngOnInit() {
  }

}
