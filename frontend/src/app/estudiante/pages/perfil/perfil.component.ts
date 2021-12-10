import { Component, OnInit } from '@angular/core';

//models
import { Usuario } from 'src/app/models/usuario';

//services
import { AuthService } from 'src/app/services/auth.service';

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

  constructor(private auth: AuthService) {}

  ngOnInit(): void {
    this.auth.usuarioGlobal$.subscribe((user) => {
      this.usuario = user;
    });
  }
}
