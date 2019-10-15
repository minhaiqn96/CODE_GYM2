import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { IBook } from 'src/app/service/book.interface';
import { BookService } from 'src/app/service/book.service';


@Component({
  selector: 'app-book-done',
  templateUrl: './book-done.component.html',
  styleUrls: ['./book-done.component.css']
})
export class BookDoneComponent implements OnInit {
  listBook: IBook[];
  constructor( private bookService:BookService, private router: Router) { }

  ngOnInit() {
        this.bookService.getBooks().subscribe(next => { this.listBook= next;
          this.listBook = this.listBook.filter(t => t.completed === true);
      });;
  }
 
  toggleBook(i) {
         const data = {
            id: this.listBook[i].id,
            title: this.listBook[i].title,
            author: this.listBook[i].author,
            completed:!this.listBook[i].completed
            
        };
        this.bookService.updateBook(data).subscribe(
            next => {
              this.listBook[i].completed = !this.listBook[i].completed;
                this.router.navigate(['/book']);
                console.log('aaa')
            },
            error => console.log(error)
        );
  }
  addBook(){
    this.router.navigate(['/book/addbook'])
  }
  deleteBook(i) {
    const book = this.listBook[i];
    this.bookService.deleteBook(book.id).subscribe(() => {
        this.listBook = this.listBook.filter(t => t.id !== book.id);
    });
}
}
