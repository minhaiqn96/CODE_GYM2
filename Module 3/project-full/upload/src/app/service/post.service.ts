import { Injectable, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { IPost } from './post.interface';

@Injectable({
  providedIn: 'root'
})
export class PostService implements OnInit{
private URL="http://localhost:3000"
constructor( private http: HttpClient) { }
ngOnInit(){
}
getPosts(): Observable<IPost[]> {
return this.http.get<IPost[]>(`${this.URL}/posts`)
}

createPost(post: Partial<IPost>): Observable<IPost> {
return this.http.post<IPost>(`${this.URL}/posts`, post);
}

getPostById(id: number): Observable<IPost> {
    return this.http.get<IPost>(`${this.URL}/posts/${1}`);
}

deletePost(id: number): Observable<any> {
  return this.http.delete(`${this.URL}/posts/${id}`);
}

updatePost(mypost: IPost): Observable<IPost> {
  return this.http.patch<IPost>(`${this.URL}/posts/${mypost.id}`, mypost);
}


}
