import { TestBed } from '@angular/core/testing';

import { FormacionAcademicaService } from './formacion-academica.service';

describe('FormacionAcademicaService', () => {
  let service: FormacionAcademicaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FormacionAcademicaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
