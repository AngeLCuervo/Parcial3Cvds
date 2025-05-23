package co.edu.escuelaing.parcial.models;// Specialty.java
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "specialties")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Specialty {
    @Id
    private String name; // medicina general, psicología, etc.
    private String imageUrl;
    private String description;
    private String doctor;
    private String location;

    // Getters y Setters
}
