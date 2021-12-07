import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

//models
import { CreateUsuarioDTO } from '../models/usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  private apiUrl= `${environment.API}/usuario`
  
  constructor(private http: HttpClient) { }
}
