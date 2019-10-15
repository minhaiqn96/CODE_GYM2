import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IBook } from '../models/Book.model';

@Injectable({
  providedIn: 'root'
})
export class BookServiceService {

  public URL: string = 'http://localhost:8081/books';

  constructor(public http: HttpClient) { }

  getAllBooks(): Observable<IBook[]> {
    return this.http.get<IBook[]>(`${this.URL}`);
  }

  getOneBook(id: number): Observable<IBook> {
    return this.http.get<IBook>(`${this.URL}/${id}`)
  }

  createBook(newBook: IBook) {
    return this.http.post(this.URL, newBook);
  }

  editBook(editedBook: IBook) {
    return this.http.put(`${this.URL}`, editedBook);
  }

  deleteBook(id: number){
    return this.http.delete(`${this.URL}/${id}`);
  }
}
