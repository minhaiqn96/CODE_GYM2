import { Component, OnInit, Injectable } from '@angular/core';
import { UserService } from 'src/app/service/user.service';
import { map } from 'rxjs/operators';
import { Router } from '@angular/router';
import { IUser } from 'src/app/service/user.interface';
import { Observable } from 'rxjs';
@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
@Injectable({
  providedIn: 'root'
})
export class UserLoginComponent implements OnInit {
  username: string;
  myUser: any;
  password: string;

  constructor(private userService: UserService, private router: Router) { }

  ngOnInit() {
    this.myUser = this.userService.user;
  }

  login() {
    this.userService.getUsers().pipe(map(a => a.filter(t => t.username === this.username && t.password === this.password))).
      subscribe(next => { (this.myUser = next); if (this.myUser.length) { this.userService.user = this.myUser } });
  }

  logout() {
    this.userService.user = null;
  }

  register() {
    this.router.navigate(['/register']);
  }
}
