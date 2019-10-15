import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { FormGroup, Validators, AbstractControl, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { BookService } from 'src/app/service/book.service';

@Component({
  selector: 'app-book-edit',
  templateUrl: './book-edit.component.html',
  styleUrls: ['./book-edit.component.css']
})
export class BookEditComponent implements OnInit {
  bookForm: FormGroup;
  myBook: any;
  constructor(private bookService: BookService, private activatedRoute: ActivatedRoute, private formBuilder: FormBuilder, private router: Router) { }

  ngOnInit() {
    this.bookForm = this.formBuilder.group({
      id: [''],
      title: ['', [Validators.required, Validators.minLength(6)]],
      author: ['', [Validators.required]],
      completed: [''],
    });

    const id = +this.activatedRoute.snapshot.paramMap.get('id');
    this.bookService.getBookById(id).subscribe(
      next => {
        this.myBook = next;
        this.bookForm.patchValue(this.myBook);
      },
      error => {
        console.log(error);
        this.myBook = null;
      }
    );
  }
  get title(): AbstractControl {
    return this.bookForm.get('title');
  }

  get author(): AbstractControl {
    return this.bookForm.get('author');
  }
  updateForm() {
    if (this.bookForm.valid) {
      const { value } = this.bookForm;
      const data = {
        ...value,

      };
      this.bookService.updateBook(data).subscribe(
        next => {
          this.router.navigate(['/book']);
        },
        error => console.log(error)
      );
    }
  }

}
