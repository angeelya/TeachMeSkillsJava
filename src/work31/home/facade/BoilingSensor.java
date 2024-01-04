package work31.home.facade;

import java.util.Random;

public class BoilingSensor {
    private Integer actualTemperature, setTemperature;

    public BoilingSensor(Integer setTemperature) {
        this.actualTemperature = getActualTemperature();
        this.setTemperature = setTemperature;
        System.out.println("Actual temperature: " + actualTemperature + "\nSet temperature: " + setTemperature);
    }

    private Integer getActualTemperature() {
        Random random = new Random();
        return random.nextInt(101);
    }

    public void increaseTemperature() {
        actualTemperature++;
    }

    public boolean compareActualAndSetTemperature() {
        if (actualTemperature <= setTemperature) return true;
        else return false;
    }

    public boolean checkTemperature() {
        if (actualTemperature == setTemperature) return true;
        else return false;
    }
}
