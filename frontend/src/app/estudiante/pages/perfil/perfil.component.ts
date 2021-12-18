import { Component, OnInit } from '@angular/core';

//models
import { Usuario } from 'src/app/models/usuario';
import { FormacionAcademica } from 'src/app/models/formacion-academica';
<<<<<<< HEAD
import { ExperienciaLaboral } from 'src/app/models/experiencia-laboral';
=======
>>>>>>> ebe2ad5adafbfd52ad2434c6d07e2ed014bb4c9f

//services
import { AuthService } from 'src/app/services/auth.service';
import { FormacionAcademicaService } from 'src/app/services/formacion-academica.service';
<<<<<<< HEAD
import { ExperienciaLaboralService } from 'src/app/services/experiencia-laboral.service';
=======
>>>>>>> ebe2ad5adafbfd52ad2434c6d07e2ed014bb4c9f

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
<<<<<<< HEAD
  experiencia_laboral: ExperienciaLaboral[] = [];
=======
>>>>>>> ebe2ad5adafbfd52ad2434c6d07e2ed014bb4c9f

  //Formación académica
  showModal: boolean = false;
  accion: boolean = true;
  oneFormacion: FormacionAcademica = {
    idFormacion: 0,
    institucion: '',
    fechaInicio: new Date(),
    fechaFin: new Date(),
  };

<<<<<<< HEAD
  //Experiencia Laboral
  showModalE: boolean = false;
  accionE: boolean = true;
  oneExperiencia: ExperienciaLaboral = {
    idExperiencia: 0,
    empresa: '',
    description: '',
    cargo: '',
    incioExperiencia: new Date(),
    finExperiencia: new Date(),
  };

  constructor(
    private auth: AuthService,
    private formacionAcademicaService: FormacionAcademicaService,
    private experienciaLaboralService: ExperienciaLaboralService
=======
  constructor(
    private auth: AuthService,
    private formacionAcademicaService: FormacionAcademicaService
>>>>>>> ebe2ad5adafbfd52ad2434c6d07e2ed014bb4c9f
  ) {}

  ngOnInit(): void {
    this.auth.getDataProfile();
    this.auth.usuarioGlobal$.subscribe((user) => {
      this.usuario = user;
    });

    this.formacionAcademicaService.getAll().subscribe((data) => {
      this.formacion_academica = data;
    });
<<<<<<< HEAD

    this.experienciaLaboralService.getAll().subscribe((data) => {
      this.experiencia_laboral = data;
    });
=======
>>>>>>> ebe2ad5adafbfd52ad2434c6d07e2ed014bb4c9f
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

<<<<<<< HEAD
  onShowModalE() {
    this.showModalE = !this.showModalE;
    this.accionE = false;

    this.oneExperiencia = {
      idExperiencia: 0,
      empresa: '',
      description: '',
      cargo: '',
      incioExperiencia: new Date(),
      finExperiencia: new Date(),
    };
  }

=======
>>>>>>> ebe2ad5adafbfd52ad2434c6d07e2ed014bb4c9f
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

<<<<<<< HEAD
  onModificarModalE(id: number) {
    this.showModalE = !this.showModalE;
    this.accionE = true;

    console.log(id);
    this.experiencia_laboral.map((item) => {
      if (id === item.idExperiencia) {
        this.oneExperiencia = {
          idExperiencia: item.idExperiencia,
          empresa: item.empresa,
          description: item.description,
          cargo: item.cargo,
          incioExperiencia: item.incioExperiencia,
          finExperiencia: item.finExperiencia,
        };
      }
    });
  }

=======
>>>>>>> ebe2ad5adafbfd52ad2434c6d07e2ed014bb4c9f
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

<<<<<<< HEAD
  onEliminarFormacionE(id: number, posicion: number) {
    this.experienciaLaboralService.delete(id).subscribe((data) => {
      if (data === null) {
        this.experiencia_laboral.splice(posicion, 1);
        console.log(this.experiencia_laboral);
      }
    });
  }

=======
>>>>>>> ebe2ad5adafbfd52ad2434c6d07e2ed014bb4c9f
  onResponseModal(show: boolean) {
    this.showModal = show;
  }

<<<<<<< HEAD
  onResponseModalE(show: boolean) {
    this.showModalE = show;
  }

=======
>>>>>>> ebe2ad5adafbfd52ad2434c6d07e2ed014bb4c9f
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
<<<<<<< HEAD
  }

  actualizarListaFAE(experiencia: ExperienciaLaboral) {
    if (this.accionE) {
      this.experiencia_laboral.map((experienciaNex, i) => {
        if (experienciaNex.idExperiencia === experiencia.idExperiencia) {
          this.experiencia_laboral[i].empresa = experiencia.empresa;
          this.experiencia_laboral[i].description = experiencia.description;
          this.experiencia_laboral[i].cargo = experiencia.cargo;
          this.experiencia_laboral[i].incioExperiencia =
            experiencia.incioExperiencia;
          this.experiencia_laboral[i].finExperiencia =
            experiencia.finExperiencia;
        }
      });
    }
    if (!this.accionE) {
      this.experiencia_laboral.push(experiencia);
    }
=======
>>>>>>> ebe2ad5adafbfd52ad2434c6d07e2ed014bb4c9f
  }
}
