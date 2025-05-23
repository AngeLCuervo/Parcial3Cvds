// Specialty.java
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "specialties")
@Getter
@Setter
public class Specialty {
    @Id
    private String name; // medicina general, psicología, etc.
    private String imageUrl;
    private String description;
    private String doctor;
    private String location;

    // Getters y Setters
}
