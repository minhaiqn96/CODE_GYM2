import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, AbstractControl, FormBuilder } from '@angular/forms';
import { UserService } from 'src/app/service/user.service';
import { Router } from '@angular/router';
import { IUser } from 'src/app/service/user.interface';
function comparePassword(c: AbstractControl):any {
  const v = c.value;
    return (v.firstPassword === v.confirmPassword) ? null : {
      passwordnotmatch: true
    };
}
@Component({
  selector: 'app-user-register',
  templateUrl: './user-register.component.html',
  styleUrls: ['./user-register.component.css']
})
export class UserRegisterComponent implements OnInit {
  userForm: FormGroup;
  registerList: IUser[];
  constructor(private formBuilder: FormBuilder, private userService: UserService, private router: Router) { }

  ngOnInit() {
    this.userForm = this.formBuilder.group({
      username: ['', [Validators.required, Validators.minLength(6), this.forbiddenUsername]],
      email: ['', [Validators.required, Validators.email]],
    
      password: this.formBuilder.group({
        firstPassword: '',
        confirmPassword: ''
      }, {validator: comparePassword})
    });
  }

  forbiddenUsername(control : AbstractControl) : any {
    const controlValue = control.value;

    if (controlValue === 'codegym') {
      return {
        forbiddenUsername : true
      }
    };
    return null;
 }

//  comparePassword(control: AbstractControl): any {
//   const passwordValue = control.value.firstPassword;
//   const confirmPasswordValue = control.value.confirmPassword;
//   if (passwordValue !== confirmPasswordValue) {
//     return {
//       comparePassword: true
//     }
//   }
//   return null;
// }



 get username(): AbstractControl {
  return this.userForm.get('username');
}

get password(): AbstractControl {
  return this.userForm.get('password');
}

onSubmitForm(){
  if (this.userForm.valid){
  const myUser: Partial<IUser> = {
    username: this.userForm.value.username,
    password: this.userForm.value.password.firstPassword,
  };
  this.userService.createUser(myUser)
  .subscribe(next => {
    alert('ngon');
    this.userForm.reset({
        username: '',
        password: '',
        email: ''
    });
    this.router.navigate(['/home']);
}, error => console.log(error));
}
}
}
