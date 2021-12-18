export interface ExperienciaLaboral {
  idExperiencia: number;
  empresa: string;
  description: string;
  cargo: string;
  incioExperiencia: Date;
  finExperiencia: Date;
}

export interface CreateExperienciaLaboralDTO
  extends Omit<ExperienciaLaboral, 'idExperiencia'> {}

export interface UpdateExperienciaLaboralDTO
  extends Partial<CreateExperienciaLaboralDTO> {}
