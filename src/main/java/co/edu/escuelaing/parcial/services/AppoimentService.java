import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository repository;

    public Appointment schedule(Appointment a) {
        if (a.getDate().isBefore(LocalDate.now())) {
            a.setStatus("Rechazada");
        } else {
            a.setStatus("Confirmada");
        }
        return repository.save(a);
    }

    public List<Appointment> getByEmail(String email) {
        return repository.findByEmail(email);
    }

    public List<Appointment> filterByStatus(String email, String status) {
        return repository.findByEmailAndStatus(email, status);
    }

    public Appointment cancel(String id) {
        Appointment a = repository.findById(id).orElse(null);
        if (a != null) {
            a.setStatus("Cancelada");
            return repository.save(a);
        }
        return null;
    }
}
