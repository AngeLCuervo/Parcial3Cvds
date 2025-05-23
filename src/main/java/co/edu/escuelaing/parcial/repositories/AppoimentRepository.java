package co.edu.escuelaing.parcial.repositories;

import co.edu.escuelaing.parcial.models.Appoitment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppoimentRepository extends MongoRepository<Appoitment, String> {
    List<Appoitment> findByEmail(String email);
    List<Appoitment> findByEmailAndStatus(String email, String status);
}
