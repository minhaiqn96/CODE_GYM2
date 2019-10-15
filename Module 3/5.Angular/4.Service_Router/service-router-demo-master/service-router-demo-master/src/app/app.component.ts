import { Component, OnInit } from '@angular/core';
import { AuthencationService } from './services/authencation.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  
  admin: boolean = false;
  title = 'service-router-demo';

  constructor(private authenticationService: AuthencationService){};


  ngOnInit(): void {
    this.admin = this.authenticationService.isAdmin();
  }

}
