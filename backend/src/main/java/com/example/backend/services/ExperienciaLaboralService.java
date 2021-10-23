package com.example.backend.services;

import com.example.backend.model.ExperienciaLaboral;

public interface ExperienciaLaboralService {

    ExperienciaLaboral createExperienciaLaboral(ExperienciaLaboral experienciaLaboral);

    ExperienciaLaboral updateExperienciaLaboral(ExperienciaLaboral experienciaLaboral);

    void deleteExperienciaLaboral (Integer id);
}
