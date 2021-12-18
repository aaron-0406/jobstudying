package com.example.backend.services.impl;

import com.example.backend.model.Skill;
import com.example.backend.repositories.SkillRepository;
import com.example.backend.services.SkillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    private SkillRepository skillRepository;

    public SkillServiceImpl(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @Override
    public Skill createSkill(Skill skill) {

        return skillRepository.save(skill);
    }

    @Override
    public Skill updateSkill(Skill skill) {

        return skillRepository.save(skill);
    }

    @Override
    public List<Skill> listarSkill() {

        return skillRepository.findAll();
    }

    @Override
    public void deleteSkill(Integer idSkill) {
        skillRepository.deleteById(idSkill);
    }
}
