package co.edu.escuelaing.parcial.repositories;

import co.edu.escuelaing.parcial.models.Specialty;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepository extends MongoRepository<Specialty, String> {
}
