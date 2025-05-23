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
    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getEmail() {
        return email;
    }


    public String getSpecialty() {
        return specialty;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
