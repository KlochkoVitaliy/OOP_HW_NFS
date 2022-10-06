package need_for_speed;

public class Bus extends Transport implements Competing {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("start Bus");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("finish Bus");
    }

    @Override
    public String getPitStop() {
        return "Проследуйте в депо";
    }

    @Override
    public double bestLapTime() {
        return 1.0;
    }

    @Override
    public int maxSpeed() {
        return 90;
    }



}
