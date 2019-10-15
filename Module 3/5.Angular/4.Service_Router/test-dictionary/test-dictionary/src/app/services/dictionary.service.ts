import { Injectable } from '@angular/core';
import { IWord } from '../models/IWord';

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {

  private listWord: IWord[] = [
    { key: 'apple', meaning: 'quả táo' },
    { key: 'book', meaning: 'cuốn sách' },
    { key: 'mouse', meaning: 'con chuột' }
  ];

  constructor() { }

  search(value: string): string {
    const foundWord = this.listWord.find(word => word.key == value.toLowerCase());
    return foundWord ? foundWord.meaning : "The word is not found";
  }

  getAll(): IWord[] {
    return this.listWord;
  }
}
