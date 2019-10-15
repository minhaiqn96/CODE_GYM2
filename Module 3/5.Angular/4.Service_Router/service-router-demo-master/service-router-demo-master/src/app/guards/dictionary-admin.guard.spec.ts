import { TestBed, async, inject } from '@angular/core/testing';

import { DictionaryAdminGuard } from './dictionary-admin.guard';

describe('DictionaryAdminGuard', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [DictionaryAdminGuard]
    });
  });

  it('should ...', inject([DictionaryAdminGuard], (guard: DictionaryAdminGuard) => {
    expect(guard).toBeTruthy();
  }));
});
