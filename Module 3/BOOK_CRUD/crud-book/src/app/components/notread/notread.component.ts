import { Component, OnInit } from '@angular/core';
import { BookServiceService } from 'src/app/services/book-service.service';
import { IBook } from 'src/app/models/Book.model';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-notread',
  templateUrl: './notread.component.html',
  styleUrls: ['./notread.component.css']
})
export class NotreadComponent implements OnInit {

  private listBookNotRead: IBook[];

  constructor(
    private bookService: BookServiceService,
    private activatedRoute: ActivatedRoute,
    private routerService: Router,
  ) { }

  ngOnInit() {
    this.viewListNotRead();
  }

  viewListNotRead() {
    this.bookService.getAllBooks().subscribe(data => {
      return this.listBookNotRead = data;
    })
  }

  OnChange(i: number) {
    this.listBookNotRead[i].read = true;
    const data = {
      id: this.listBookNotRead[i].id,
      name: this.listBookNotRead[i].name,
      read: this.listBookNotRead[i].read,
    }

    this.bookService.editBook(data).subscribe(data => {
      this.listBookNotRead[i].read = !this.listBookNotRead[i].read;
      this.routerService.navigate(['/books']);
    })
  }
}