import { Injectable } from '@angular/core';
import { IWord } from '../models/IWord';

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {

  private words: IWord[] = [
    { key: 'one', meaning: 'mot' },
    { key: 'two', meaning: 'hai' },
    { key: 'three', meaning: 'ba' },
    { key: 'four', meaning: 'bon' },
    { key: 'five', meaning: 'nam' },
  ];

  constructor() { }

  search(word: string): string {
    const foundWord = this.words.find(item => item.key === word.toLowerCase());
    return foundWord ? foundWord.meaning : 'Not found';
  }

  getAll(): IWord[] {
    return this.words;
  }
}