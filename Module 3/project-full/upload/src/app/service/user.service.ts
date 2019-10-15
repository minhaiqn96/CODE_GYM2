import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { IUser } from './user.interface';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})

export class UserService {
  user: any;

  isOkay(): boolean {
    return !!this.user;
  }

  listUser: IUser[];

  private url = "http://localhost:3000"

  constructor(private http: HttpClient) { }

  getUsers(): Observable<IUser[]> {
    return this.http.get<IUser[]>(`${this.url}/users`)
  }

  createUser(post: Partial<IUser>): Observable<IUser> {
    return this.http.post<IUser>(`${this.url}/users`, post);
  }

}
