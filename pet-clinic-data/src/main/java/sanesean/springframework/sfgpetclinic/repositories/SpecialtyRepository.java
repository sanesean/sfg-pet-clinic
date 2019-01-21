package sanesean.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sanesean.springframework.sfgpetclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
