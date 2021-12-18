import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

//models
import { ExperienciaLaboral } from 'src/app/models/experiencia-laboral';

//services
import { ExperienciaLaboralService } from 'src/app/services/experiencia-laboral.service';

@Component({
  selector: 'app-modal-laboral',
  templateUrl: './modal-laboral.component.html',
  styleUrls: ['./modal-laboral.component.css'],
})
export class ModalLaboralComponent implements OnInit {
  @Input() showModal: boolean = false;
  @Input() accion: boolean = true;
  @Output() ocultarModal = new EventEmitter<boolean>();
  @Output() agregarExperiencia = new EventEmitter<ExperienciaLaboral>();

  @Input() experienciaLaboral: ExperienciaLaboral = {
    idExperiencia: 0,
    empresa: '',
    description: '',
    cargo: '',
    incioExperiencia: new Date(),
    finExperiencia: new Date(),
  };

  constructor(private experienciaLaboralService: ExperienciaLaboralService) {}

  ngOnInit(): void {}

  onShowModal() {
    this.showModal = !this.showModal;
    this.ocultarModal.emit(false);
  }

  onSubmit() {
    if (this.accion) {
      this.experienciaLaboral.idExperiencia;
      this.experienciaLaboralService
        .update(this.experienciaLaboral)
        .subscribe((data) => {
          this.agregarExperiencia.emit(data);
        });
    }
    if (!this.accion) {
      console.log(this.experienciaLaboral);
      this.experienciaLaboralService
        .create(this.experienciaLaboral)
        .subscribe((data) => {
          this.agregarExperiencia.emit(data);
        });
    }

    this.onShowModal();
  }
}
