import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
import { IBook } from 'src/app/service/book.interface';
import { BookService } from 'src/app/service/book.service';

@Component({
  selector: 'app-list-books',
  templateUrl: './list-books.component.html',
  styleUrls: ['./list-books.component.css']
})
export class ListBooksComponent implements OnInit {

  listBook: IBook[];

  constructor(
    private bookService: BookService, 
    private router: Router,) { }

  ngOnInit() {
    this.bookService.getBooks().
      subscribe(next => (this.listBook = next));
  }

  addBook() {
    this.router.navigate(['/book/addbook'])
  }

  toggleBook(i) {
    const data = {
      id: this.listBook[i].id,
      title: this.listBook[i].title,
      author: this.listBook[i].author,
      completed: !this.listBook[i].completed
    };
    
    this.bookService.updateBook(data).subscribe(
      
      next => {
        console.log(data)
        this.listBook[i].completed = !this.listBook[i].completed;
        this.router.navigate(['/book']);
      },
      error => console.log(error)
      
    );
  }

  deleteBook(i) {
    const book = this.listBook[i];
    this.bookService.deleteBook(book.id).subscribe(() => {
      this.listBook = this.listBook.filter(t => t.id !== book.id);
    });
  }
}
