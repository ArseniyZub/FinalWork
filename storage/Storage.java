package FinalWork.storage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import FinalWork.Model.*;
import FinalWork.Model.implement.*;

public class Storage implements interfaceStorage{
    Map<Integer, AbstractAnimal> Animals = new HashMap<>();

    public Storage() {
        init();
    }

    private void init(){

        AbstractPet cat = new Cat("Барсик", LocalDate.of(2022, 7, 12));
        cat.learnSkill(new Skill("Принести тапки"));
        Animals.put(cat.getId(), cat);
    }

    @Override
    public List<AbstractAnimal> getAllAnimals() {
        List<AbstractAnimal> result = new ArrayList<>();
        for (AbstractAnimal animal : Animals.values()) {
            result.add(animal);
        }
        return result;
    }

    @Override
    public AbstractAnimal getAnimalById(int animalId) {
        return Animals.getOrDefault(animalId, null);
    }

    @Override
    public boolean addAnimal(AbstractAnimal animal) {
        if (Animals.containsKey(animal.getId())) return false;
        Animals.put(animal.getId(), animal);
        return true;
    }

    @Override
    public int removeAnimal(AbstractAnimal animal) {
        if (!Animals.containsKey(animal.getId())) {
            return -1;
        }
        AbstractAnimal removed = Animals.remove(animal.getId());
        return removed.getId();
    }
}