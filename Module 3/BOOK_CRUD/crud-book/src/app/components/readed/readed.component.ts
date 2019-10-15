import { Component, OnInit } from '@angular/core';
import { BookServiceService } from 'src/app/services/book-service.service';
import { IBook } from 'src/app/models/Book.model';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-readed',
  templateUrl: './readed.component.html',
  styleUrls: ['./readed.component.css']
})
export class ReadedComponent implements OnInit {

  private listBookReaded: IBook[];

  constructor(
    private bookService: BookServiceService,
    private activatedRoute: ActivatedRoute,
    private routerService: Router,
  ) { }

  ngOnInit() {
    this.viewListReaded();
  }

  viewListReaded() {
    this.bookService.getAllBooks().subscribe(data => {
      return this.listBookReaded = data;
    })
  }

  onChange(i: number) {
    this.listBookReaded[i].read = false;
    const data = {
      id: this.listBookReaded[i].id,
      name: this.listBookReaded[i].name,
      read: this.listBookReaded[i].read,
    }

    this.bookService.editBook(data).subscribe(data => {
      this.listBookReaded[i].read = !this.listBookReaded[i].read;
      this.routerService.navigate(['/books']);
    })
  }
}
