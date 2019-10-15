import { TestBed } from '@angular/core/testing';

import { AuthencationService as AuthencationService } from './authencation.service';

describe('AuthencatinService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AuthencationService = TestBed.get(AuthencationService);
    expect(service).toBeTruthy();
  });
});
