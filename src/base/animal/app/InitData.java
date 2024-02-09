package base.animal.app;

import base.animal.data.Animal;

public class InitData {
    private AnimalController controller;
    public void initTestData() {
        controller.createAnimal(new Animal("Fuzzy the cutest dog", 7));
        controller.createAnimal(new Animal("Scrappy the lamest cat", 4, true, false));
        controller.createAnimal(new Animal("Killian the fastest horse", 14, true, true));
        controller.createAnimal(new Animal("Marky the slimmest cat", 2));
        controller.createAnimal(new Animal("Spot the smartest dog", 6, false, true));
    }

    public InitData(AnimalController controller) {
        this.controller = controller;
    }
}
