package FinalWork.Model.implement;

import java.time.LocalDate;

import FinalWork.Model.AbstractPet;
import FinalWork.Model.AnimalGenius;

public class Dog extends AbstractPet {
    public Dog(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.DOG);
    }
}
