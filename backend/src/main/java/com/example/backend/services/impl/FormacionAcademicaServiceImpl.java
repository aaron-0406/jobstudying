package com.example.backend.services.impl;

import com.example.backend.model.FormacionAcademica;
import com.example.backend.repositories.FormacionAcademicaRepository;
import com.example.backend.services.FormacionAcademicaService;
import org.springframework.stereotype.Service;

@Service
public class FormacionAcademicaServiceImpl implements FormacionAcademicaService {

    //CREANDO OBJETO QUE HEREDA TODO LO DE JPA
    FormacionAcademicaRepository formacionAcademicaRepository;

    public FormacionAcademicaServiceImpl(FormacionAcademicaRepository formacionAcademicaRepository) {
        //INICIALIZANDO OBJETO
        this.formacionAcademicaRepository = formacionAcademicaRepository;
    }

    @Override
    public FormacionAcademica updateFormacionAcademica(FormacionAcademica formacionAcademica) {
        return formacionAcademicaRepository.save(formacionAcademica);
    }

    @Override
    public void deleteFormacionAcademica(Integer id) {
        formacionAcademicaRepository.deleteById(id);
    }
}
