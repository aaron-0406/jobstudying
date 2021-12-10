import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject } from 'rxjs';
import { switchMap, tap } from 'rxjs/operators';
import { environment } from 'src/environments/environment';

//models
import { Auth } from '../models/auth';
import { Usuario } from '../models/usuario';

//services
import { TokenService } from './token.service';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  private apiUrl = `${environment.API}/auth`;

  private usuarioGlobal = new BehaviorSubject<Usuario>({
    id: '',
    nombreUsuario: '',
    apellidoUsuario: '',
    tipoUsuario: '',
    contaseniaUsuario: '',
    emailUsuario: '',
    telefonoUsuario: 0,
    generoUsuario: '',
  });

  usuarioGlobal$ = this.usuarioGlobal.asObservable();

  constructor(private http: HttpClient, private tokenService: TokenService) {}

  login(username: string, password: string) {
    return this.http
      .post<Auth>(`${this.apiUrl}/authenticate`, {
        username,
        password,
      })
      .pipe(
        //Gracias al tap ejecutamos un proceso sin modificar lo que se esta obteniendo.
        //En este caso al obtener loguearnos obtenemos el token y lo guardamos
        //automáticamente sin modificar nada.
        tap((response) => {
          this.tokenService.saveToken(response.jwt);
        })
      );
  }

  getProfile() {
    return this.http.get<Usuario>(`${this.apiUrl}/profile`);
  }

  loginAngGet(email: string, password: string) {
    return this.login(email, password).pipe(
      switchMap(() => {
        this.getProfile().subscribe((data) => {
          this.usuarioGlobal.next(data);
        });
        return this.getProfile();
      })
    );
  }
}
