import { Component, OnInit } from '@angular/core';
import { awesomeForm } from 'src/app/models/listAwesome.model';
import { Subscription } from 'rxjs';
import { AwesomeServiceService } from 'src/app/services/awesome-service.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {

  private newAwesome: awesomeForm;
  private sub: Subscription;

  constructor(
    private awesomeService: AwesomeServiceService,
    private routerService: Router) { }

  ngOnInit() {
    this.newAwesome = new awesomeForm();
  }

  onAddAwesome() {
    this.sub = this.awesomeService.createAwesome(this.newAwesome).subscribe((data: awesomeForm) => {
      this.routerService.navigate(['/awesome']);
    }
    )
  }
}
