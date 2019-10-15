import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { IPost } from 'src/app/service/post.interface';
import { PostService } from 'src/app/service/post.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {
listPost: IPost[];
  constructor( private postService:PostService, private router: Router) { }

  ngOnInit() {
        this.postService.getPosts().
  subscribe(next => (this.listPost = next), error => (this.listPost = null));
  }
  addPost(){
    this.router.navigate(['/home/addpost'])
  }
  deletePost(i) {
    const post = this.listPost[i];
    this.postService.deletePost(post.id).subscribe(() => {
        this.listPost = this.listPost.filter(t => t.id !== post.id);
    });
}
}
