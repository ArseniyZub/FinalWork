package FinalWork.storage;

import java.util.List;

import FinalWork.Model.AbstractAnimal;

public interface interfaceStorage {
   
    List<AbstractAnimal> getAllAnimals();

    AbstractAnimal getAnimalById(int animalId);

    boolean addAnimal(AbstractAnimal animal);

    int removeAnimal(AbstractAnimal animal);
}