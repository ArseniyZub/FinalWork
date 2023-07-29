package FinalWork.Model.implement;

import java.time.LocalDate;

import FinalWork.Model.AbstractPackAnimal;
import FinalWork.Model.AnimalGenius;

public class Horse extends AbstractPackAnimal {
    public Horse(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.HORSE);
    }
}