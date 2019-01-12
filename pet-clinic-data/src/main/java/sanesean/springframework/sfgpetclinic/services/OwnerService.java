package sanesean.springframework.sfgpetclinic.services;

import sanesean.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
