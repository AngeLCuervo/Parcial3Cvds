import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SpecialtyService {
    @Autowired
    private SpecialtyRepository repository;

    public List<Specialty> findAll() {
        return repository.findAll();
    }

    public Specialty findById(String name) {
        return repository.findById(name).orElse(null);
    }
}
