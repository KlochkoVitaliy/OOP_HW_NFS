package need_for_speed;

public class Cargo extends Transport implements Competing {

    private LoadCapacity loadCapacity;


    public Cargo(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("start Cargo");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("finish Cargo");
    }

    @Override
    public void printTypeAuto() {
        if (loadCapacity == null) {
            System.out.println("Данных по авто недостаточно!");
        } else {
            String from = loadCapacity.getFrom() == null ? "" : "от " + loadCapacity.getFrom() + "т. ";
            String to = loadCapacity.getTo() == null ? "" : "до " + loadCapacity.getTo()+"т. ";
            System.out.println("Грузоподьемность авто -  " + from + to);
        }
    }

    @Override
    public String getPitStop() {
        return "Остановка на перекур";
    }

    @Override
    public double bestLapTime() {
        return 1.4;
    }

    @Override
    public int maxSpeed() {
        return 120;
    }
}
