import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, AbstractControl } from '@angular/forms'
@Component({
  selector: 'app-form-register',
  templateUrl: './form-register.component.html',
  styleUrls: ['./form-register.component.css']
})
export class FormRegisterComponent implements OnInit {

  profileForm: FormGroup;

  // private userNames = [
  //   'hai',
  //   'minhhai'
  // ]
  // private passWords = [
  //   ''
  // ]
  constructor() { }

  ngOnInit() {
    this.profileForm = new FormGroup({
      email: new FormControl('', [Validators.email, Validators.required]),
      username: new FormControl('', [Validators.required, this.forUsernameBidden]),
      check: new FormControl(true),

      passwordGroup: new FormGroup({
        password: new FormControl(''),
        confirmPassword: new FormControl('')
      },this.comparePassword)
    });
  }

  onSubmitForm() {
    alert(JSON.stringify(this.profileForm.value));
    console.log(this.profileForm);
    // alert(this.profileForm);
  }

  forUsernameBidden(control: AbstractControl): any {
    if (control.value == 'hai') {
      return {
        usernameBidden: true
      };
    }
    return null;
  }


  comparePassword(control: AbstractControl): any {
    let passwordControl = control.value.password;
    let confirmPasswordControl = control.value.confirmPassword;
    if(passwordControl != confirmPasswordControl){
      return {
        passwordNotMatch: true
      }
    }
  }

  get email() {
    return this.profileForm.get('email');
  }
  get username() {
    return this.profileForm.get('username');
  }
  get passwordGroup() {
    return this.profileForm.get('passwordGroup');
  }
  // get check() { return this.profileForm.get('check') }
  // get passwordGroup() { return this.profileForm.get('passwordGroup') }
}
