import { TestBed } from '@angular/core/testing';

import { AwesomeServiceService } from './awesome-service.service';

describe('AwesomeServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AwesomeServiceService = TestBed.get(AwesomeServiceService);
    expect(service).toBeTruthy();
  });
});
