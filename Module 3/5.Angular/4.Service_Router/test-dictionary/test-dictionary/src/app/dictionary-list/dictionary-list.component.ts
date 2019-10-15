import { Component, OnInit } from '@angular/core';
import { IWord } from '../models/IWord';
import { DictionaryService } from '../services/dictionary.service';

@Component({
  selector: 'app-dictionary-list',
  templateUrl: './dictionary-list.component.html',
  styleUrls: ['./dictionary-list.component.css']
})
export class DictionaryListComponent implements OnInit {

  listWord: IWord[];

  constructor(private dictionaryService: DictionaryService) { }

  ngOnInit() {
    this.listWord = this.dictionaryService.getAll();
  }

}
