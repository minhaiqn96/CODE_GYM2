import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, CanActivateChild } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthencationService } from '../services/authencation.service';

@Injectable({
  providedIn: 'root'
})
export class DictionaryDetailAdminGuard implements CanActivateChild {

  constructor(private authenticationService: AuthencationService) {}

  canActivateChild(
    next: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
      console.log("DictionaryDetailAdminGuard-canActivateChild is invoked");
    return this.authenticationService.isAdmin();
  }
  
}
