package work31.facade;

public class Computer {
    PowerSupply powerSupply;
    HDD hdd;
    DiskDrive diskDrive;
    Monitor monitor;

    public Computer() {
        this.powerSupply = new PowerSupply();
        this.hdd = new HDD();
        this.diskDrive = new DiskDrive();
        this.monitor = new Monitor();
    }

    public void turnOn()
    {
        powerSupply.turnOn();
        hdd.readData();
        diskDrive.checkDiskDrive();
        monitor.turnOn();
    }
    public void turnOff()
    {
        monitor.turnOff();
        hdd.writeData();
        powerSupply.turnOff();
    }
}
