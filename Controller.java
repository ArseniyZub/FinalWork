package FinalWork;

import FinalWork.Model.*;
import FinalWork.Model.implement.*;
import FinalWork.storage.Storage;

import java.time.LocalDate;
import java.util.List;

public class Controller {

    private Storage storage;

    public Controller(Storage storag) {
        this.storage = storag;
    }

    public List<AbstractAnimal> getAnimals() {
        return storage.getAllAnimals();
    }

    public boolean createAnimal(String name, LocalDate birthDay, AnimalGenius animalGenius) {
        AbstractAnimal animal = switch (animalGenius) {
            case CAT -> new Cat(name, birthDay);
            case DOG -> new Dog(name, birthDay);
            case HAMSTER -> new Hamster(name, birthDay);
            case HORSE -> new Horse(name, birthDay);
            case CAMEL -> new Camel(name, birthDay);
            case DONKEY -> new Donkey(name, birthDay);
        };

        return storage.addAnimal(animal);
    }

    public int removeAnimal(AbstractAnimal animal) {
        if (animal == null) return -1;
        return storage.removeAnimal(animal);
    }
}