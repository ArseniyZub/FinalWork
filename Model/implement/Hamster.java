package FinalWork.Model.implement;

import java.time.LocalDate;

import FinalWork.Model.AbstractPet;
import FinalWork.Model.AnimalGenius;

public class Hamster extends AbstractPet {
    public Hamster(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.HAMSTER);
    }
}
