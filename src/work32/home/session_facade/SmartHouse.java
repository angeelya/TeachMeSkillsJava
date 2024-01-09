package work32.home.session_facade;

import work32.home.session_facade.Fan;
import work32.home.session_facade.Lamp;

public class SmartHouse {
    private Lamp lamp;
    private Fan fan;
    private boolean isHot;

    public SmartHouse(boolean isHot) {
        this.isHot = isHot;
        lamp = new Lamp();
        fan = new Fan();
    }

    public String turnOn() {
        String result="";
        if (isHot) {
            result=lamp.turnOn()+"\n";
           result+=fan.turnON(3)+"\n";
        } else {
            result+=lamp.turnOn()+"\n";
        }
        return result;
    }

    public String turnOff() {
        String result="";
        if (isHot)
        {
            result=lamp.turnOff()+"\n";
            result+=fan.turnOff()+"\n";
        }
        else
        {
            result+=lamp.turnOff()+"\n";
        }
        return result;
    }

}
