import { Component, OnInit } from '@angular/core';
import { BookServiceService } from 'src/app/services/book-service.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Subscription } from 'rxjs';
import { IBook } from 'src/app/models/Book.model';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  private detailOneBook: IBook;
  private subGetId: Subscription;
  private sub: Subscription;

  constructor(
    public bookService: BookServiceService,
    public activatedRoute: ActivatedRoute,
    private routerService: Router,
  ) { }

  ngOnInit() {
    this.detailOneBook = new IBook();
    this.loadOneBook();
  }

  loadOneBook() {
    this.activatedRoute.params.subscribe(ID => {
      console.log(ID);
      let id = ID.id;
      console.log(id);
      this.bookService.getOneBook(id).subscribe(data => {
        console.log(id);
        this.detailOneBook = data;
        console.log(this.detailOneBook);
      })
    })
  }

  updateThisBook() {
    this.sub = this.bookService.editBook(this.detailOneBook).subscribe(data => {
      console.log(data);
      // this.routerService.navigate(['/books',readed]);
      this.routerService.navigate(['/books']);
    })
  }

  deleteThisBook() {
    this.subGetId = this.activatedRoute.params.subscribe(ID => {
      let id = ID.id;
      this.bookService.deleteBook(id).subscribe(data => {
        this.routerService.navigate(['/books']);
      })
    })
  }
}
