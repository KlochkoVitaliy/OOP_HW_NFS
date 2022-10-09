package need_for_speed;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;

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


    public abstract void startMoving();

    public abstract void finishTheMovement();

    public abstract void printTypeAuto();
}
