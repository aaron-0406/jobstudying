import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

//models
import {
  FormacionAcademica,
  CreateFormacionAcademicaDTO,
  UpdateFormacionAcademicaDTO,
} from '../models/formacion-academica';

@Injectable({
  providedIn: 'root',
})
export class FormacionAcademicaService {
  private apiUrl = `${environment.API}/formacionacademica`;

  constructor(private http: HttpClient) {}

  getAll() {
    return this.http.get<FormacionAcademica[]>(`${this.apiUrl}`);
  }

  create(dto: CreateFormacionAcademicaDTO) {
    return this.http.post<FormacionAcademica>(`${this.apiUrl}`, dto);
  }

  update(dto: UpdateFormacionAcademicaDTO) {
    return this.http.put<FormacionAcademica>(`${this.apiUrl}`, dto);
  }

  delete(id: number) {
    return this.http.delete<string>(`${this.apiUrl}/${id}`);
  }
}
