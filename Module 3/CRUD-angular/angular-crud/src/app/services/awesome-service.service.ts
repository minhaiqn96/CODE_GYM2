import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { awesomeForm } from '../models/listAwesome.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AwesomeServiceService {

  public API: string = "http://localhost:3000/awesomes";

  constructor(public http: HttpClient) { }

  getAllLists(): Observable<awesomeForm[]> {
    return this.http.get<awesomeForm[]>(`${this.API}`);
  }
  // getAllLists() {
  //   return this.http.get(this.API);
  // }

  createAwesome(awesome: awesomeForm) {
    return this.http.post(this.API, awesome);
  }

  getOneAwesome(id: number) {
    return this.http.get(`${this.API}/${id}`);
  }

  editAwesome(awesome: awesomeForm) {
    return this.http.put(`${this.API}/${awesome.id}`, awesome);
  }

  // deleteAwesome(id: number){
  //   return this.http.delete(`${this.API}/${id}`);
  // }
  deleteAwesome(id: number) {
    return this.http.delete(`${this.API}/${id}`)
  }

}
