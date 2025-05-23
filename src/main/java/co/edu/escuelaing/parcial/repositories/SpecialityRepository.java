import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface SpecialtyRepository extends MongoRepository<Specialty, String> {
}
