import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModalAcademicoComponent } from './modal-academico.component';

describe('ModalAcademicoComponent', () => {
  let component: ModalAcademicoComponent;
  let fixture: ComponentFixture<ModalAcademicoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModalAcademicoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ModalAcademicoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
