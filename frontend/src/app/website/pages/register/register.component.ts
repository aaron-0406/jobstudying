import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

//models
import { CreateUsuarioDTO } from '../../../models/usuario';

//services
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
})
export class RegisterComponent implements OnInit {
  registerCompany: CreateUsuarioDTO = {
    nombreUsuario: '',
    apellidoUsuario: '',
    tipoUsuario: '',
    contaseniaUsuario: '',
    emailUsuario: '',
    telefonoUsuario: 0,
    generoUsuario: '',
  };

  confirmarContasenia: string = '';

  changeOption: boolean = true;
  showError: boolean = false;
  messageError: string = '';

  constructor(private auth: AuthService, private router: Router) {}

  ngOnInit(): void {}

  onChangeOption() {
    this.changeOption = !this.changeOption;
    if (this.changeOption) {
      this.registerCompany.tipoUsuario = 'estudiante';
    }
    if (!this.changeOption) {
      this.registerCompany.tipoUsuario = 'empresa';
    }
  }

  onRegister(): void {
    if (this.changeOption) {
      if (
        this.registerCompany.nombreUsuario &&
        this.registerCompany.apellidoUsuario &&
        this.registerCompany.emailUsuario &&
        this.registerCompany.telefonoUsuario &&
        this.registerCompany.contaseniaUsuario &&
        this.confirmarContasenia
      ) {
        if (
          this.registerCompany.contaseniaUsuario === this.confirmarContasenia
        ) {
          this.showError = false;
          this.messageError = '';
          //registrarse
          this.registerCompany.tipoUsuario = 'Estudiante';
          this.registerCompany.generoUsuario = 'Desconocido';
          this.auth.register(this.registerCompany).subscribe((data) => {
            console.log(data);
            if (data) {
              this.router.navigate(['login']);
            }
          });
        } else {
          this.showError = true;
          this.messageError = 'Las contraseñas deben ser iguales';
        }
      } else {
        this.showError = true;
        this.messageError = 'Complete todas las casillas para registrarse.';
      }
    } else {
      if (
        this.registerCompany.nombreUsuario &&
        this.registerCompany.emailUsuario &&
        this.registerCompany.telefonoUsuario &&
        this.registerCompany.contaseniaUsuario &&
        this.confirmarContasenia
      ) {
        if (
          this.registerCompany.contaseniaUsuario === this.confirmarContasenia
        ) {
          this.showError = false;
          this.messageError = '';
          //registrarse
          this.registerCompany.tipoUsuario = 'Empresa';
          this.registerCompany.apellidoUsuario = 'Desconocido';
          this.registerCompany.generoUsuario = 'Desconocido';
          this.auth.register(this.registerCompany).subscribe((data) => {
            console.log(data);
            if (data) {
              this.router.navigate(['login']);
            }
          });
        } else {
          this.showError = true;
          this.messageError = 'Las contraseñas deben ser iguales';
        }
      }
    }
  }
}
