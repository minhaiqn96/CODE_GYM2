import { Component, OnInit } from '@angular/core';
import { awesomeForm } from 'src/app/models/listAwesome.model';
import { Subscription } from 'rxjs';
import { AwesomeServiceService } from 'src/app/services/awesome-service.service';

@Component({
  selector: 'app-showhome',
  templateUrl: './showhome.component.html',
  styleUrls: ['./showhome.component.css']
})
export class ShowhomeComponent implements OnInit {

  private awesomes: any;
  private sub: Subscription;

  constructor(private awesomeService: AwesomeServiceService) { }

  ngOnInit() {
    this.viewList();
  }

  viewList() {
    this.awesomeService.getAllLists().subscribe(data => {
      console.log(data);
      return this.awesomes = data;
    })
  }

  ngOnDestroy() {
    if (this.sub) {
      return this.sub.unsubscribe();
    }
  }

}
