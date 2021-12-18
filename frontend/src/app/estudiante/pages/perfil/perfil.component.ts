import { Component, OnInit } from '@angular/core';

//models
import { Usuario } from 'src/app/models/usuario';
import { FormacionAcademica } from 'src/app/models/formacion-academica';

//services
import { AuthService } from 'src/app/services/auth.service';
import { FormacionAcademicaService } from 'src/app/services/formacion-academica.service';

@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.component.html',
  styleUrls: ['./perfil.component.css'],
})
export class PerfilComponent implements OnInit {
  usuario: Usuario = {
    id: '',
    nombreUsuario: '',
    apellidoUsuario: '',
    tipoUsuario: '',
    contaseniaUsuario: '',
    emailUsuario: '',
    telefonoUsuario: 0,
    generoUsuario: '',
  };

  //Listas a mostrar
  formacion_academica: FormacionAcademica[] = [];

  //Formación académica
  showModal: boolean = false;
  accion: boolean = true;
  oneFormacion: FormacionAcademica = {
    idFormacion: 0,
    institucion: '',
    fechaInicio: new Date(),
    fechaFin: new Date(),
  };

  constructor(
    private auth: AuthService,
    private formacionAcademicaService: FormacionAcademicaService
  ) {}

  ngOnInit(): void {
    this.auth.getDataProfile();
    this.auth.usuarioGlobal$.subscribe((user) => {
      this.usuario = user;
    });

    this.formacionAcademicaService.getAll().subscribe((data) => {
      this.formacion_academica = data;
    });
  }

  onShowModal() {
    this.showModal = !this.showModal;
    this.accion = false;

    this.oneFormacion = {
      idFormacion: 0,
      institucion: '',
      fechaInicio: new Date(),
      fechaFin: new Date(),
    };
  }

  onModificarModal(id: number) {
    this.showModal = !this.showModal;
    this.accion = true;

    console.log(id);
    this.formacion_academica.map((item) => {
      if (id === item.idFormacion) {
        this.oneFormacion = {
          idFormacion: item.idFormacion,
          institucion: item.institucion,
          fechaInicio: item.fechaInicio,
          fechaFin: item.fechaFin,
        };
      }
    });
  }

  onEliminarFormacion(id: number, posicion: number) {
    console.log(id);
    console.log(posicion);
    this.formacionAcademicaService.delete(id).subscribe((data) => {
      if (data === null) {
        this.formacion_academica.splice(posicion, 1);
        console.log(this.formacion_academica);
      }
    });
  }

  onResponseModal(show: boolean) {
    this.showModal = show;
  }

  actualizarListaFA(formacion: FormacionAcademica) {
    if (this.accion) {
      this.formacion_academica.map((formacionNew, i) => {
        if (formacionNew.idFormacion === formacion.idFormacion) {
          this.formacion_academica[i].institucion = formacion.institucion;
          this.formacion_academica[i].fechaInicio = formacion.fechaInicio;
          this.formacion_academica[i].fechaFin = formacion.fechaFin;
        }
      });
    }
    if (!this.accion) {
      this.formacion_academica.push(formacion);
    }
  }
}
