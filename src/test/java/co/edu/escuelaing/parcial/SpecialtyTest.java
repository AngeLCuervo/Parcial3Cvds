package co.edu.escuelaing.parcial.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SpecialtyTest {

    @Test
    public void testGettersAndSetters() {
        Specialty specialty = new Specialty();

        specialty.setName("Psicología");
        specialty.setImageUrl("http://example.com/image.jpg");
        specialty.setDescription("Especialidad en salud mental");
        specialty.setDoctor("Dra. Gómez");
        specialty.setLocation("Consultorio 101");

        assertEquals("Psicología", specialty.getName());
        assertEquals("http://example.com/image.jpg", specialty.getImageUrl());
        assertEquals("Especialidad en salud mental", specialty.getDescription());
        assertEquals("Dra. Gómez", specialty.getDoctor());
        assertEquals("Consultorio 101", specialty.getLocation());
    }
}
