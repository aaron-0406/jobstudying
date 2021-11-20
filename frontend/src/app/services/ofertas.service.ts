import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { environment } from '../../environments/environment';

//models
import { Oferta } from '../models/Oferta.models';

@Injectable({
  providedIn: 'root',
})
export class OfertasService {
  private url: string = `${environment.API}/ofertas`;

  constructor(private http: HttpClient) {}

  //get
  getOfertas() {
    return this.http.get<Oferta[]>(this.url);
  }
}
