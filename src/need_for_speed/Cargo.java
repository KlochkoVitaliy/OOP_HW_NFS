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
    public boolean checkDiagnostic() {
        return Math.random()>0.75;
    }

    @Override
    public void getPitStop() {
        System.out.println( "Остановка на перекур");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость");
    }

    @Override
    public String toString() {
        return "грузовик" + super.toString();
    }
}
