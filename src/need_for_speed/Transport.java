package need_for_speed;

public abstract class Transport implements Competing{
    private String brand;
    private String model;
    private double engineVolume;

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
        if (engineVolume == 0) {
            this.engineVolume = 000;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null && brand.isEmpty()) {
            this.brand = "No data";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null && model.isEmpty()) {
            this.model = "No data";
        } else {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }


    public abstract void startMoving();

    public abstract void finishTheMovement();

    public abstract void printTypeAuto();
   }
