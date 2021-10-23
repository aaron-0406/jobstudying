package com.example.backend.services;

import com.example.backend.model.FormacionAcademica;

public interface FormacionAcademicaService {
    FormacionAcademica updateFormacionAcademica(FormacionAcademica formacionAcademica);
    void deleteFormacionAcademica(Integer id);

}
