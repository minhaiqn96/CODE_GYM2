import { TestBed } from '@angular/core/testing';

import { UserPasswordService } from './user-password.service';

describe('UserPasswordService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: UserPasswordService = TestBed.get(UserPasswordService);
    expect(service).toBeTruthy();
  });
});
