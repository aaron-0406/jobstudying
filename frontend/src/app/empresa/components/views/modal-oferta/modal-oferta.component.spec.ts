import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModalOfertaComponent } from './modal-oferta.component';

describe('ModalOfertaComponent', () => {
  let component: ModalOfertaComponent;
  let fixture: ComponentFixture<ModalOfertaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModalOfertaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ModalOfertaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
