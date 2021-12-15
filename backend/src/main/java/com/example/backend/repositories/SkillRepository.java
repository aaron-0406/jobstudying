package com.example.backend.repositories;

import com.example.backend.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository <Skill, Integer>{
}
