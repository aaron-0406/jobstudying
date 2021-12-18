package com.example.backend.services;

import com.example.backend.model.Skill;

import java.util.List;

public interface SkillService {

    Skill createSkill (Skill skill);
    Skill updateSkill (Skill skill);
    List<Skill> listarSkill();
    void deleteSkill (Integer idSkill);

}
