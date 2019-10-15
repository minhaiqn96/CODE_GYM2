import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/service/user.service';
import { IUser } from 'src/app/service/user.interface';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  userlist: Observable<IUser[]>

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.userlist = this.userService.getUsers();
  }
}
