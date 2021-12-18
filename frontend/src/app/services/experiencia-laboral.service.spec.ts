import { TestBed } from '@angular/core/testing';

import { ExperienciaLaboralService } from './experiencia-laboral.service';

describe('ExperienciaLaboralService', () => {
  let service: ExperienciaLaboralService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ExperienciaLaboralService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
