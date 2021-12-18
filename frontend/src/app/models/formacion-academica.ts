export interface FormacionAcademica {
  idFormacion: number;
  institucion: string;
  fechaInicio: Date;
  fechaFin: Date;
}

export interface CreateFormacionAcademicaDTO
  extends Omit<FormacionAcademica, 'idFormacion'> {}

export interface UpdateFormacionAcademicaDTO
  extends Partial<CreateFormacionAcademicaDTO> {}
