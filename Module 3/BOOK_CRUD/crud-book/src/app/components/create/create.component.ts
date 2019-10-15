import { Component, OnInit } from '@angular/core';
import { IBook } from 'src/app/models/Book.model';
import { BookServiceService } from 'src/app/services/book-service.service';
import { Router } from '@angular/router';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {

  private newBook: IBook;
  private sub: Subscription;

  constructor(
    private bookService: BookServiceService,
    private routerService: Router,
  ) { }

  ngOnInit() {
    this.newBook = new IBook();
  }

  addBook() {
    this.sub = this.bookService.createBook(this.newBook).subscribe(data => {
      console.log(data);
      return this.routerService.navigate(['/books']);
    })
  }
}
