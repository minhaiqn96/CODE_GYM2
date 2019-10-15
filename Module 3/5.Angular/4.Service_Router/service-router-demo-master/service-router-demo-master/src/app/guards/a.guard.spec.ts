import { TestBed, async, inject } from '@angular/core/testing';

import { AGuard } from './a.guard';

describe('AGuard', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AGuard]
    });
  });

  it('should ...', inject([AGuard], (guard: AGuard) => {
    expect(guard).toBeTruthy();
  }));
});
