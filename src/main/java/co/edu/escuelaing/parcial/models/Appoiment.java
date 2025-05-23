// Appointment.java
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document(collection = "appointments")
public class Appointment {
    @Id
    private String id;
    private String fullName;
    private String idNumber;
    private String email;
    private LocalDate date;
    private String specialty;
    private String doctor;
    private String location;
    private String status; // Confirmada, Cancelada, Rechazada

    // Getters y Setters
}
