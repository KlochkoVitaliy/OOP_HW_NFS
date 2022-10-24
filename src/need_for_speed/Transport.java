package need_for_speed;

import java.util.*;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;

    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Mechanics<?>> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null && brand.isEmpty()) {
            this.brand = "No data";
        } else {
            this.brand = brand;
        }
        if (model == null && model.isEmpty()) {
            this.model = "No data";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 0;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Mechanics<?>> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void startMoving();

    public abstract void finishTheMovement();

    public abstract void printTypeAuto();

    public abstract boolean checkDiagnostic();

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanics<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public abstract void repairCar ();
}
