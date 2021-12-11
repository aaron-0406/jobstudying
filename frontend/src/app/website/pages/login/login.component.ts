import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

//models
import { Usuario } from '../../../models/usuario';

//services
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  //Datos de login
  email: string = '';
  password: string = '';

  //Mostrar error
  showError: boolean = false;
  messageError: string = '';

  private profile: Usuario | null = null;

  constructor(private auth: AuthService, private router: Router) {}

  ngOnInit(): void {}

  onLogin() {
    if (this.email && this.password) {
      this.showError = false;
      this.auth.loginAngGet(this.email, this.password).subscribe((user) => {
        this.profile = user;
        if (this.profile.tipoUsuario === 'Estudiante') {
          this.router.navigate(['estudiante/perfil']);
        }
        if (this.profile.tipoUsuario === 'Empresa') {
          this.router.navigate(['empresa/perfil']);
        }

        console.log(this.profile);
      });
    } else {
      this.messageError = 'Complete todas las casillas';
      this.showError = true;
    }
  }
}
