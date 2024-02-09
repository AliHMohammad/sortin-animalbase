package base.animal.app;

import base.animal.data.Animal;
import base.animal.data.AnimalNameComparator;

import java.util.*;

public class AnimalController {

    private Map<Integer, Animal> animalMap;
    private int lastId;

    public AnimalController() {
        lastId = 0;
        this.animalMap = new HashMap<>();
    }

    public Animal createAnimal(Animal receivedAnimalObj) {
        Animal animal = new Animal(receivedAnimalObj);
        lastId = lastId + 1;
        animal.setId(lastId);
        animalMap.put(animal.getId(), animal);
        return animal;
    }

    public List<Animal> getAllAnimals() {
        return new ArrayList<Animal>(animalMap.values());
    }

    public Collection<Animal> getAllAnimalsSorted() {
        return new TreeSet<>(animalMap.values());
    }

    public List<Animal> getAllAnimalsSorted(Comparator<Animal> comparator) {
        List<Animal> sortedList = new ArrayList<Animal>(animalMap.values());
        sortedList.sort(comparator);
        return sortedList;
    }

}
