package co.edu.escuelaing.parcial.controllers;

import co.edu.escuelaing.parcial.models.Appoitment;
import co.edu.escuelaing.parcial.services.AppoimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {
    @Autowired
    private AppoimentService service;

    @PostMapping
    public Appoitment schedule(@RequestBody Appoitment a) {
        return service.schedule(a);
    }

    @GetMapping("/history")
    public List<Appoitment> getByEmail(@RequestParam String email) {
        return service.getByEmail(email);
    }

    @GetMapping("/filter")
    public List<Appoitment> filterByStatus(@RequestParam String email, @RequestParam String status) {
        return service.filterByStatus(email, status);
    }

    @PutMapping("/cancel/{id}")
    public Appoitment cancel(@PathVariable String id) {
        return service.cancel(id);
    }
}
