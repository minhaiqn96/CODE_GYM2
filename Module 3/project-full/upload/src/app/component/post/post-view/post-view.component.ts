import { Component, OnInit } from '@angular/core';
import { PostService } from 'src/app/service/post.service';
import { IPost } from 'src/app/service/post.interface';
import { ActivatedRoute, ParamMap  } from '@angular/router';
import { Subscription } from 'rxjs';
import { map } from 'rxjs/operators';
import { Observable } from 'rxjs';
@Component({
  selector: 'app-post-view',
  templateUrl: './post-view.component.html',
  styleUrls: ['./post-view.component.css']
})
export class PostViewComponent implements OnInit {
myPost: any;
myPostcheck: Observable<IPost[]>;
sub: Subscription;
  constructor(private postService:PostService, private activatedRoute: ActivatedRoute) { }

  ngOnInit() {

//     const id = +this.activatedRoute.snapshot.paramMap.get('id');
// this.postService.getPostById(id).subscribe(
//   next => (this.myPost = next),
//   error => {
//       console.log(error);
//       this.myPost = null;
//   }
// );

this.sub = this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
const myid = parseInt(paramMap.get('id'));
this.myPost = this.postService.getPosts().pipe(map(a => a.filter(t => t.id === myid)));
}
)
  }
}
