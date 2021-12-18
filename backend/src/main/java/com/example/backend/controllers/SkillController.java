package com.example.backend.controllers;

import com.example.backend.model.Skill;
import com.example.backend.services.SkillService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillController {

    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    //CREAR SKILL
    @PostMapping
    public ResponseEntity<Skill> createSkill(@Valid @RequestBody Skill skill){
        Skill skillNew = skillService.createSkill(skill);
        return new ResponseEntity<Skill>(skillNew, HttpStatus.CREATED);
    }

    //EDITAR SKILL
    @PutMapping
    public ResponseEntity<Skill> modificaSkill(@Valid @RequestBody Skill skill){
        Skill skillUpdate = skillService.updateSkill(skill);
        return new ResponseEntity<Skill>(skillUpdate, HttpStatus.OK);
    }

    //ELIMINAR SKILL
    @DeleteMapping("/{idSkill}")
    public ResponseEntity <String> deleteSkill(@PathVariable ("idSkill") Integer idSkill){
        skillService.deleteSkill(idSkill);
        return  new ResponseEntity<>("Skill eliminada", HttpStatus.OK);
    }

    //LISTAR SKILLS
    @GetMapping
    public ResponseEntity<List<Skill>> listarSkill(){
        List<Skill> listarSkill = skillService.listarSkill();
        return new ResponseEntity<>(listarSkill,HttpStatus.CREATED);
    }
}
