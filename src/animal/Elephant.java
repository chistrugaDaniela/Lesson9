package animal;

import erbivor.Herbivore;

public class Elephant extends Herbivore implements Animal {

    private String animalName;
    private String animalType;

    public Elephant(String animalName, String animalType) {
        this.animalName = animalName;
        this.animalType = animalType;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }


    @Override
    public String getAnimalName() {
        return animalName;
    }

    @Override
    public String getAnimalType() {
        return animalType;
    }

    @Override
    public int returnAnimalLimbsNumber() {
        return Animal.super.returnAnimalLimbsNumber();
    }

    @Override
    public void eatDifferentTypesOfPlants() {
        System.out.println("Elephant eats palms, vines, bamboo, fruits, grass, etc.");
    }

    @Override
    public void adaptToSeasons() {
        System.out.println("Elephants are engaged in seasonal migrations.");
    }

    @Override
    public void maintainTerritory() {
        System.out.println("Elephants don't maintain the territory as other animals.");
    }
}
