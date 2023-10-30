package animal;

public interface Animal {
    public static final int animalLimbsNumber = 4;

    public abstract String getAnimalName();
    public abstract String getAnimalType();

    public static void makaNoise() {
        System.out.println("Animal makes noise");
    }

    public default int returnAnimalLimbsNumber() {
        return animalLimbsNumber;
    }
}
