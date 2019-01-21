package sanesean.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sanesean.springframework.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
