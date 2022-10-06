package need_for_speed;

public class PassengerСar extends Transport implements Competing{

    public PassengerСar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("start PasCar");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("finish PasCar");
    }

    @Override
    public String getPitStop() {
        return "Stop the line";
    }

    @Override
    public double bestLapTime() {
        return 2.35;
    }

    @Override
    public int maxSpeed() {
        return 200;
    }
}
