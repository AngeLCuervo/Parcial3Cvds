import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment, String> {
    List<Appointment> findByEmail(String email);
    List<Appointment> findByEmailAndStatus(String email, String status);
}
