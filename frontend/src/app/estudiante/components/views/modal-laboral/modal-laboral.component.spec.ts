import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModalLaboralComponent } from './modal-laboral.component';

describe('ModalLaboralComponent', () => {
  let component: ModalLaboralComponent;
  let fixture: ComponentFixture<ModalLaboralComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModalLaboralComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ModalLaboralComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
