package sanesean.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sanesean.springframework.sfgpetclinic.model.Owner;
import sanesean.springframework.sfgpetclinic.model.Pet;
import sanesean.springframework.sfgpetclinic.model.PetType;
import sanesean.springframework.sfgpetclinic.model.Vet;
import sanesean.springframework.sfgpetclinic.services.OwnerService;
import sanesean.springframework.sfgpetclinic.services.PetTypeService;
import sanesean.springframework.sfgpetclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("3025 Royal St");
        owner1.setCity("Los Angeles");
        owner1.setTelephone("3233489021");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("WangWang");
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("Mountain View");
        owner2.setCity("San Francisco");
        owner2.setTelephone("3233567890");


        Pet FionasCat = new Pet();
        FionasCat.setPetType(savedCatPetType);
        FionasCat.setOwner(owner2);
        FionasCat.setBirthDate(LocalDate.now());
        FionasCat.setName("MiaoMiao");
        owner2.getPets().add(FionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");


    }
}
