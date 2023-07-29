package FinalWork.Model.implement;

import java.time.LocalDate;

import FinalWork.Model.AbstractPackAnimal;
import FinalWork.Model.AnimalGenius;

public class Donkey extends AbstractPackAnimal {
    public Donkey(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.DONKEY);
    }
}
