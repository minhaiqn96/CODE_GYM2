import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthencationService {

  constructor() { }

  isAdmin() : boolean {
    return false;
  }
}
