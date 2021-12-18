import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

//models
import { FormacionAcademica } from 'src/app/models/formacion-academica';

//services
import { FormacionAcademicaService } from 'src/app/services/formacion-academica.service';

@Component({
  selector: 'app-modal-academico',
  templateUrl: './modal-academico.component.html',
  styleUrls: ['./modal-academico.component.css'],
})
export class ModalAcademicoComponent implements OnInit {
  @Input() showModal: boolean = false;
  @Input() accion: boolean = true;
  @Output() ocultarModal = new EventEmitter<boolean>();
  @Output() agregarFormacion = new EventEmitter<FormacionAcademica>();

  @Input() formacionAcademica: FormacionAcademica = {
    idFormacion: 0,
    institucion: '',
    fechaInicio: new Date(),
    fechaFin: new Date(),
  };

  constructor(private formacionAcademicaService: FormacionAcademicaService) {}

  ngOnInit(): void {}

  onShowModal() {
    this.showModal = !this.showModal;
    this.ocultarModal.emit(false);
  }

  onSubmit() {
    if (this.accion) {
      this.formacionAcademica.idFormacion;
      this.formacionAcademicaService
        .update(this.formacionAcademica)
        .subscribe((data) => {
          this.agregarFormacion.emit(data);
        });
    }
    if (!this.accion) {
      this.formacionAcademicaService
        .create(this.formacionAcademica)
        .subscribe((data) => {
          this.agregarFormacion.emit(data);
        });
    }

    this.onShowModal();
  }
}
