package FinalWork.Model.implement;

import java.time.LocalDate;

import FinalWork.Model.AbstractPet;
import FinalWork.Model.AnimalGenius;

public class Cat extends AbstractPet {
    public Cat(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.CAT);
    }
}
