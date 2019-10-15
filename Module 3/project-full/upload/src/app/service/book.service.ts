import { Injectable, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IBook } from './book.interface';



@Injectable({
  providedIn: 'root'
})
export class BookService {
  private URL="http://localhost:3000"
  constructor( private http: HttpClient) { }
  
  getBooks(): Observable<IBook[]> {
  return this.http.get<IBook[]>(`${this.URL}/books`)
  }
  
  createBook(post: Partial<IBook>): Observable<IBook> {
  return this.http.post<IBook>(`${this.URL}/books`, post);
  }
  
  getBookById(id: number): Observable<IBook> {
      return this.http.get<IBook>(`${this.URL}/books/${id}`);
  }
  
  deleteBook(id: number): Observable<any> {
    return this.http.delete(`${this.URL}/books/${id}`);
  }
  
  updateBook(mypost: IBook): Observable<IBook> {
    return this.http.patch<IBook>(`${this.URL}/books/${mypost.id}`, mypost);
  }
  
  
  }
