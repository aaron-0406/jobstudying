package com.example.backend.services.impl;

import com.example.backend.model.ExperienciaLaboral;
import com.example.backend.repositories.ExperienciaLaboralRepository;
import com.example.backend.services.ExperienciaLaboralService;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralServiceImpl implements ExperienciaLaboralService {

    //CREANDO OBJETO QUE HEREDA
    ExperienciaLaboralRepository experienciaLaboralRepository;


    public ExperienciaLaboralServiceImpl(ExperienciaLaboralRepository experienciaLaboralRepository) {
        //INICIALIZANDO OBJETO
        this.experienciaLaboralRepository = experienciaLaboralRepository;
    }

    @Override
    public ExperienciaLaboral createExperienciaLaboral(ExperienciaLaboral experienciaLaboral) {
        return experienciaLaboralRepository.save(experienciaLaboral);
    }

    @Override
    public ExperienciaLaboral updateExperienciaLaboral(ExperienciaLaboral experienciaLaboral) {
        return experienciaLaboralRepository.save(experienciaLaboral);
    }
}
