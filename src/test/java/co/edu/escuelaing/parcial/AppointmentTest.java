package co.edu.escuelaing.parcial;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import co.edu.escuelaing.parcial.models.Appoitment;
import org.junit.jupiter.api.Test;

public class AppointmentTest {

    @Test
    public void testGettersAndSetters() {
        Appoitment appointment = new Appoitment();

        appointment.setId("123");
        appointment.setFullName("Juan Perez");
        appointment.setIdNumber("987654321");
        appointment.setEmail("juan.perez@example.com");
        appointment.setDate(LocalDate.of(2025, 5, 23));
        appointment.setSpecialty("Medicina General");
        appointment.setDoctor("Dr. Martinez");
        appointment.setLocation("Clínica Central");
        appointment.setStatus("Confirmada");

        assertEquals("123", appointment.getId());
        assertEquals("Juan Perez", appointment.getFullName());
        assertEquals("987654321", appointment.getIdNumber());
        assertEquals("juan.perez@example.com", appointment.getEmail());
        assertEquals(LocalDate.of(2025, 5, 23), appointment.getDate());
        assertEquals("Medicina General", appointment.getSpecialty());
        assertEquals("Dr. Martinez", appointment.getDoctor());
        assertEquals("Clínica Central", appointment.getLocation());
        assertEquals("Confirmada", appointment.getStatus());

        // Test método setStatus con valor diferente
        appointment.setStatus("Rechazada");
        assertEquals("Rechazada", appointment.getStatus());
    }
}
