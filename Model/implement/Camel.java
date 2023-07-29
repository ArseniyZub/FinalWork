package FinalWork.Model.implement;

import java.time.LocalDate;

import FinalWork.Model.AbstractPackAnimal;
import FinalWork.Model.AnimalGenius;

public class Camel extends AbstractPackAnimal {
    public Camel(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.CAMEL);
    }
}