import { TestBed, async, inject } from '@angular/core/testing';

import { DictionaryDetailAdminGuard } from './dictionary-detail-admin.guard';

describe('DictionaryDetailAdminGuard', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [DictionaryDetailAdminGuard]
    });
  });

  it('should ...', inject([DictionaryDetailAdminGuard], (guard: DictionaryDetailAdminGuard) => {
    expect(guard).toBeTruthy();
  }));
});
