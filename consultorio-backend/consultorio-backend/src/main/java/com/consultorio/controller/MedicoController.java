package com.consultorio.controller;

import com.consultorio.model.Medico;
import com.consultorio.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @GetMapping
    public List<Medico> obtenerMedicos() {
        return medicoRepository.findAll();
    }

    @PostMapping
    public Medico agregarMedico(@RequestBody Medico medico) {
        return medicoRepository.save(medico);
    }
}
