package work31.home.facade;

public class Kettle {
    HeatingElement heatingElement;
    BoilingSensor boilingSensor;

    public Kettle(int setTemperature) {
        this.heatingElement = new HeatingElement();
        this.boilingSensor = new BoilingSensor(setTemperature);
    }

    public void turnOn() {
        if (boilingSensor.compareActualAndSetTemperature()) {
            heatingElement.turnOn();
            heat();
            turnOff();
        } else {
            System.out.println("Set temperature is less than actual one");
            turnOff();
        }
    }

    private void heat() {
        while (!boilingSensor.checkTemperature()) {
            boilingSensor.increaseTemperature();
        }
    }

    public void turnOff() {
        heatingElement.turnOff();
    }
}
