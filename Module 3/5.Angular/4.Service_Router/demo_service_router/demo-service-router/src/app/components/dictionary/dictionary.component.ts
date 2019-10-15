    
import { Component, OnInit } from '@angular/core';
import { IWord } from 'src/app/models/IWord';
import { DictionaryService } from 'src/app/services/dictionary.service';

@Component({
  selector: 'app-dictionary',
  templateUrl: './dictionary.component.html',
  styleUrls: ['./dictionary.component.css']
})
export class DictionaryComponent implements OnInit {
  private word: IWord;

  constructor(private dictionaryService: DictionaryService) { }

  ngOnInit() {
  }

  search(word: string): void {
    const foundWord = this.dictionaryService.search(word);
    this.word = {
      key: word,
      meaning: foundWord,
    }
  }
}