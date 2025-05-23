package co.edu.escuelaing.parcial.models;// Appointment.java
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.time.LocalDate;

@Document(collection = "appointments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Appoitment {
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

    public LocalDate getDate() {
        return date;
    }

    public void setStatus(String rechazada) {
        this.status = rechazada;
    }

    // Getters y Setters
}
