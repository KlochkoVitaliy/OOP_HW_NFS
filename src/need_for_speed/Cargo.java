package need_for_speed;

public class Cargo extends Transport implements Competing{

    public Cargo(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
