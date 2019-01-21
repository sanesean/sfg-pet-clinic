package sanesean.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sanesean.springframework.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
