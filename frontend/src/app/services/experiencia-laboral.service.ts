import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

//models
import {
  ExperienciaLaboral,
  CreateExperienciaLaboralDTO,
  UpdateExperienciaLaboralDTO,
} from '../models/experiencia-laboral';

@Injectable({
  providedIn: 'root',
})
export class ExperienciaLaboralService {
  private apiUrl = `${environment.API}/experiencialaboral`;

  constructor(private http: HttpClient) {}

  getAll() {
    return this.http.get<ExperienciaLaboral[]>(`${this.apiUrl}`);
  }

  create(dto: CreateExperienciaLaboralDTO) {
    return this.http.post<ExperienciaLaboral>(`${this.apiUrl}`, dto);
  }

  update(dto: UpdateExperienciaLaboralDTO) {
    return this.http.put<ExperienciaLaboral>(`${this.apiUrl}`, dto);
  }

  delete(id: number) {
    return this.http.delete<string>(`${this.apiUrl}/${id}`);
  }
}
