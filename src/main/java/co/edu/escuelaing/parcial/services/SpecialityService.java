package co.edu.escuelaing.parcial.services;

import co.edu.escuelaing.parcial.models.Specialty;
import co.edu.escuelaing.parcial.repositories.SpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SpecialityService {
    @Autowired
    private SpecialityRepository repository;

    public List<Specialty> findAll() {
        return repository.findAll();
    }

    public Specialty findById(String name) {
        return repository.findById(name).orElse(null);
    }
}
