import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {
    @Autowired
    private AppointmentService service;

    @PostMapping
    public Appointment schedule(@RequestBody Appointment a) {
        return service.schedule(a);
    }

    @GetMapping("/history")
    public List<Appointment> getByEmail(@RequestParam String email) {
        return service.getByEmail(email);
    }

    @GetMapping("/filter")
    public List<Appointment> filterByStatus(@RequestParam String email, @RequestParam String status) {
        return service.filterByStatus(email, status);
    }

    @PutMapping("/cancel/{id}")
    public Appointment cancel(@PathVariable String id) {
        return service.cancel(id);
    }
}
