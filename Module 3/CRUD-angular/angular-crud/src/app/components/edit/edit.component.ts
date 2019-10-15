import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AwesomeServiceService } from 'src/app/services/awesome-service.service';
import { Subscription } from 'rxjs';
import { awesomeForm } from 'src/app/models/listAwesome.model';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})

export class EditComponent implements OnInit {

  public awesome: any;
  public awesomes: awesomeForm[];
  public subParam: Subscription;
  public sub: Subscription;

  constructor(
    public awesomeService: AwesomeServiceService,
    public routerService: Router,
    public activatedRouterService: ActivatedRoute) { }

  ngOnInit() {
    this.awesome = new awesomeForm();
    this.loadData();
  }

  loadData() {
    this.subParam = this.activatedRouterService.params.subscribe(ID => {
      console.log(ID);
      let id = ID.id;
      console.log(id);
      this.sub = this.awesomeService.getOneAwesome(id).subscribe(data1 => {
        this.awesome = data1;
      })
    })
  }

  updateAwesome() {
    this.sub = this.awesomeService.editAwesome(this.awesome).subscribe(data => {
      // console.log(data);
      this.routerService.navigate(['/awesome']);
      // console.log(data);
    })
  }

  deleteAwesome() {
    this.subParam = this.activatedRouterService.params.subscribe(ID => {
      let id = ID.id;
      this.awesomeService.deleteAwesome(id).subscribe(() => {
        this.routerService.navigate(['awesome']);
      })
    })
  }
}
