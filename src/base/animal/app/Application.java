package base.animal.app;

import base.animal.data.Animal;
import base.animal.data.AnimalAgeComparator;
import base.animal.data.AnimalNameComparator;

import java.util.Collection;
import java.util.Comparator;

public class Application {

    private AnimalController animalController;

    public Application() {
        animalController = new AnimalController();
    }

    public static void main(String[] args) {
        new Application().start();
    }

    private void start() {
        new InitData(animalController).initTestData();

        Comparator<Animal> byAge = Comparator.comparing(Animal::getAge);

        // Prints all animals.
        //Collection<Animal> animals = animalController.getAllAnimalsSorted(new AnimalAgeComparator());

        //Collection<Animal> animals = animalController.getAllAnimalsSorted(byAge);
        Collection<Animal> animals = animalController.getAllAnimalsSorted(byAge.reversed());

        for(Animal anAnimal : animals) {
            System.out.println(anAnimal);
        }
    }

}
