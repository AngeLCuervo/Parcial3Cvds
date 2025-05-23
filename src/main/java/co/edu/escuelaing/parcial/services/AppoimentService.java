package co.edu.escuelaing.parcial.services;

import co.edu.escuelaing.parcial.models.Appoitment;
import co.edu.escuelaing.parcial.repositories.AppoimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class AppoimentService {
    @Autowired
    private AppoimentRepository repository;

    public Appoitment schedule(Appoitment a) {
        if (a.getDate().isBefore(LocalDate.now())) {
            a.setStatus("Rechazada");
        } else {
            a.setStatus("Confirmada");
        }
        return repository.save(a);
    }

    public List<Appoitment> getByEmail(String email) {
        return repository.findByEmail(email);
    }

    public List<Appoitment> filterByStatus(String email, String status) {
        return repository.findByEmailAndStatus(email, status);
    }

    public Appoitment cancel(String id) {
        Appoitment a = repository.findById(id).orElse(null);
        if (a != null) {
            a.setStatus("Cancelada");
            return repository.save(a);
        }
        return null;
    }
}
