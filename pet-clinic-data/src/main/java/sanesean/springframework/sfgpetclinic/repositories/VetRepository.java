package sanesean.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sanesean.springframework.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
