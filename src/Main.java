import animal.Animal;
import animal.Elephant;
import erbivor.Herbivore;

public class Main {
    public static void main(String[] args) {
        Animal elephant1 = new Elephant("Elephant1", "proboscidean mammals");
        System.out.println(elephant1.getAnimalName());
        System.out.println(elephant1.getAnimalType());
        System.out.println(elephant1.returnAnimalLimbsNumber());
        Animal.makaNoise();

        Herbivore elephant2 = new Elephant("Elephant2", "mammals");
        elephant2.adaptToSeasons();
        elephant2.eatDifferentTypesOfPlants();
        elephant2.maintainTerritory();
    }
}