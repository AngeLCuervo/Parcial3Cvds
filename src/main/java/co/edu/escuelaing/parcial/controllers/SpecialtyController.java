package co.edu.escuelaing.parcial.controllers;

import co.edu.escuelaing.parcial.models.Specialty;
import co.edu.escuelaing.parcial.services.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/specialties")
public class SpecialtyController {
    @Autowired
    private SpecialityService service;

    @GetMapping
    public List<Specialty> getAll() {
        return service.findAll();
    }

    @GetMapping("/{name}")
    public Specialty getByName(@PathVariable String name) {
        return service.findById(name);
    }
}
