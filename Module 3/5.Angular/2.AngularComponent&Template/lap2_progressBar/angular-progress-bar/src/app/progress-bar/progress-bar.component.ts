import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-progress-bar',
  templateUrl: './progress-bar.component.html',
  styleUrls: ['./progress-bar.component.css']
})
export class ProgressBarComponent implements OnInit {

  @Input() backgroundC = "#d9d9d9";
  @Input() progressC = "#4CAF50";
  @Input() width = 50;

  constructor() { }

  ngOnInit() {
  }

}
