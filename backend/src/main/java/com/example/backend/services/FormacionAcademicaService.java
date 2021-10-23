package com.example.backend.services;

import com.example.backend.model.FormacionAcademica;

public interface FormacionAcademicaService {

    FormacionAcademica createFormacionAcademica(FormacionAcademica formacionAcademica);
    FormacionAcademica updateFormacionAcademica(FormacionAcademica formacionAcademica);
    void deleteFormacionAcademica(Integer id);

}
