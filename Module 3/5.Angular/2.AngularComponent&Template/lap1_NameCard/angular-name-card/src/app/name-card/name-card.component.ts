import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-name-card',
  templateUrl: './name-card.component.html',
  styleUrls: ['./name-card.component.css']
})
export class NameCardComponent implements OnInit {

  // @Input() cardName: string;
  // @Input() email:string;
  // @Input() phone: string;

  // arrayName = [];
  public arrayName: Array<string> = [];

  addName(value:string) {
    this.arrayName.push(value);
  }

  constructor() { }

  ngOnInit() {
  }

}
