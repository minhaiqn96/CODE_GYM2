import { Component, OnInit } from '@angular/core';
import { PostService } from 'src/app/service/post.service';
import { IPost } from 'src/app/service/post.interface';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { Subscription } from 'rxjs';
import { map } from 'rxjs/operators';
import { Observable } from 'rxjs';
import { FormGroup, Validators, AbstractControl, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-post-edit',
  templateUrl: './post-edit.component.html',
  styleUrls: ['./post-edit.component.css']
})
export class PostEditComponent implements OnInit {
  postForm: FormGroup;
  myPost: any;
  sub: Subscription;
  constructor(private postService: PostService, private activatedRoute: ActivatedRoute, private formBuilder: FormBuilder, private router: Router) { }

  ngOnInit() {
    // this.sub = this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
    //   const myid = parseInt(paramMap.get('id'));
    //   this.myPost = this.postService.getPosts().pipe(map(a => a.filter(t => t.id === myid)));
    // }
    // );
    this.postForm = this.formBuilder.group({
      id: [''],
      title: ['', [Validators.required, Validators.minLength(6)]],
      description: ['', [Validators.required]],
      content: ['', [Validators.required, Validators.minLength(10)]],
    });

    const id = +this.activatedRoute.snapshot.paramMap.get('id');
    this.postService.getPostById(id).subscribe(
        next => {
            this.myPost = next;
            this.postForm.patchValue(this.myPost);
        },
        error => {
            console.log(error);
            this.myPost = null;
        }
    );

  }

  get title(): AbstractControl {
    return this.postForm.get('title');
  }

  get description(): AbstractControl {
    return this.postForm.get('description');
  }

  get content(): AbstractControl {
    return this.postForm.get('content');
  }
  updateForm() {
    if (this.postForm.valid) {
        const { value } = this.postForm;
        const data = {
            ...value,
            
        };
        this.postService.updatePost(data).subscribe(
            next => {
                this.router.navigate(['/book']);
            },
            error => console.log(error)
        );
    }
}
}

