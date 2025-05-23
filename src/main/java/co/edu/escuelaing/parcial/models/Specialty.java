package co.edu.escuelaing.parcial.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "specialties")
public class Specialty {
    @Id
    private String name;
    private String imageUrl;
    private String description;
    private String doctor;
    private String location;


    public Specialty() {
    }


    public Specialty(String name, String imageUrl, String description, String doctor, String location) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.description = description;
        this.doctor = doctor;
        this.location = location;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getLocation() {
        return location;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
