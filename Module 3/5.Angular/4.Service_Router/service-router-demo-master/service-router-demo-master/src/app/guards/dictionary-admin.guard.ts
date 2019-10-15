import { Injectable, OnInit } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthencationService } from '../services/authencation.service';

@Injectable({
  providedIn: 'root'
})
export class DictionaryAdminGuard implements CanActivate {

  constructor(private authenticationService: AuthencationService){}

  canActivate(
    next: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
      console.log("DictionaryAdminGuard - canActivate is invoked");
    return this.authenticationService.isAdmin();
  }

}
