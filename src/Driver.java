import need_for_speed.*;

public class Driver<T extends Transport> {

    private String fullNameDriver;
    private boolean driverLicense;
    private int experience;


    public Driver(String fullNameDriver, boolean driverLicense, int experience) {
        this.fullNameDriver = fullNameDriver;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public Driver(String fullNameDriver) {
        this(fullNameDriver, true, 0);
    }

    public void startMoving(T transport) {
              System.out.println("Водитель " + fullNameDriver + " управляет транспортным средством " + transport.getBrand() + " и будет участвовать в заезде.");
    }

    public void finishMoving() {
        System.out.println("Пора сделать остановку");
    }

    public void refuelTheCar() {
        System.out.println("Пора заправиться");
    }

    public String getFullNameDriver() {
        return fullNameDriver;
    }

    public void setFullNameDriver(String fullNameDriver) {
        this.fullNameDriver = fullNameDriver;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
