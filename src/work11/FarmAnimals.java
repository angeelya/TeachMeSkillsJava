package work11;

import java.util.Map;

public class FarmAnimals {

    private Map<String, Integer> countOfAnimalsByType;
    private String nameFarmer, nameFarm;
    private final String MESSAGE_NO_ANIMAL = "There aren't animals of this type on the farm";


    public FarmAnimals(Map<String, Integer> countOfAnimalsByType, String nameFarmer, String nameFarm) {
        this.countOfAnimalsByType = countOfAnimalsByType;
        this.nameFarmer = nameFarmer;
        this.nameFarm = nameFarm;
    }

    public void getCountOfAnimalsByType(String typeAnimal) {
        try {
            int count = countOfAnimalsByType.get(typeAnimal);
            System.out.println("Count animals of this type");
        } catch (NullPointerException e) {
            System.out.println(MESSAGE_NO_ANIMAL);
        }
    }

    public void calculateHowMuchFoodWillOneAnimalOfThisType(double feedWeight, String typeAnimal) {
        try {
            int count = countOfAnimalsByType.get(typeAnimal);
            if (feedWeight < 1) throw new IllegalArgumentException("There's not enough food for animal here");
            System.out.println("Count food for one animal: " + feedWeight / count);
        } catch (NullPointerException e) {
            System.out.println(MESSAGE_NO_ANIMAL);
        } catch (IllegalArgumentException e) {
            System.out.println("Add food to animal");
        } catch (ArithmeticException e) {
            System.out.println("This type of animal longer exists");
        }
    }

    public void sellAnimalsOfThisType(int countAnimal, String typeAnimal) {
        try {
            if (countAnimal < 1) throw new IllegalArgumentException("Sale isn't valid");
            int countRemaining = countOfAnimalsByType.get(typeAnimal) - countAnimal;
            if (countRemaining < 0)
                new UnsupportedOperationException("There's not enough animals on the farm");
            countOfAnimalsByType.put(typeAnimal, countRemaining);
            System.out.println("Sold " + typeAnimal + " in count of: " + countAnimal + " " + typeAnimal + " left: " + countOfAnimalsByType.get(typeAnimal));
        } catch (IllegalArgumentException | NullPointerException | UnsupportedOperationException e) {
            System.out.println(switch (e.getClass().getSimpleName()) {
                case "IllegalArgumentException", "UnsupportedOperationException" -> e.getMessage();
                case "NullPointerException" -> MESSAGE_NO_ANIMAL;
                default -> "";
            });
        }
    }

    public void addAnimalOfThisType(int countAnimal, String typeAnimal) {
        try {
            if (countAnimal < 1) throw new IllegalArgumentException("Addition isn't valid");
            countOfAnimalsByType.put(typeAnimal, countOfAnimalsByType.get(typeAnimal) + countAnimal);
            System.out.println("Count of type: " + typeAnimal + " has become: " + countOfAnimalsByType.get(typeAnimal));
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println(switch (e.getClass().getSimpleName()) {
                case "IllegalArgumentException" -> e.getMessage();
                case "NullPointerException" -> MESSAGE_NO_ANIMAL;
                default -> "";
            });
        } finally {
            System.out.println("Thanks. Sincerely,farmer " + nameFarmer + ", farm " + nameFarm);
        }
    }

}
