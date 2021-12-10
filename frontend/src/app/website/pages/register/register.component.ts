import { Component, OnInit } from '@angular/core';

//models
import { CreateUsuarioDTO } from '../../../models/usuario';

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
  }

  confirmarContasenia: string = '';

  changeOption: boolean = true;

  constructor() {}

  ngOnInit(): void {}
  
  onChangeOption(){
    this.changeOption = !this.changeOption;
    if (this.changeOption){
      this.registerCompany.tipoUsuario = "estudiante"; 
    }
    if (!this.changeOption){
      this.registerCompany.tipoUsuario = "empresa";
    }
  }

  onRegister(): void {
    if (this.registerCompany.contaseniaUsuario === this.confirmarContasenia){
      console.log(this.registerCompany);
    }
  }
}