package com.consultorio.controller;

import com.consultorio.model.Paciente;
import com.consultorio.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping
    public List<Paciente> obtenerPacientes() {
        return pacienteRepository.findAll();
    }

    @PostMapping
    public Paciente agregarPaciente(@RequestBody Paciente paciente) {
        return pacienteRepository.save(paciente);
    }
}
