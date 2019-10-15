import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { FormGroup, Validators, AbstractControl, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { BookService } from 'src/app/service/book.service';

@Component({
  selector: 'app-book-add',
  templateUrl: './book-add.component.html',
  styleUrls: ['./book-add.component.css']
})
export class BookAddComponent implements OnInit {

  bookForm: FormGroup;

  constructor(private bookService: BookService, private activatedRoute: ActivatedRoute, private formBuilder: FormBuilder, private router: Router) { }

  ngOnInit() {
      this.bookForm = this.formBuilder.group({
      id: [''],
      title: ['', [Validators.required, Validators.minLength(6)]],
      author: ['', [Validators.required]],
    });
  }

  get title(): AbstractControl {
    return this.bookForm.get('title');
  }

  get author(): AbstractControl {
    return this.bookForm.get('author');
  }

  // get content(): AbstractControl {
  //   return this.bookForm.get('content');
  // }
  createForm() {
    console.log(this.bookForm);
    if (this.bookForm.valid) {
        const { value } = this.bookForm;
        const data = {
            ...value,id:null,completed: false
            
        };
        this.bookService.createBook(data).subscribe(
            next => {
                this.router.navigate(['/book']);
            },
            error => console.log(error)
        );
    }
}


}

