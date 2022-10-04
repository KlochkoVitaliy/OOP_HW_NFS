import NeedForSpeed.*;

public class Driver <A extends Transport>{

    private String fullNameDriver;
    private boolean driverLicense;
    private int experience;

    public Driver(String fullNameDriver, boolean driverLicense, int experience) {
        this.fullNameDriver = fullNameDriver;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public void startMoving(A transport) {
        System.out.println("Водитель " + fullNameDriver + " управляет транспортным средством " + transport.getBrand() + " и будет участвовать в заезде.");
    }

    public void finishMoving() {

    }

    public void refuelTheCar() {

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
