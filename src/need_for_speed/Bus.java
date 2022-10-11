package need_for_speed;

public class Bus extends Transport implements Competing {

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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
    public void printTypeAuto() {
        if (capacity == null) {
            System.out.println("Данных по авто недостаточно!");
        } else {
            System.out.println("Вместимость  авто - от  " + capacity.getFrom() + " до " + capacity.getTo() + " чел.");
        }
    }

    @Override
    public boolean checkDiagnostic() {
        System.out.println("Автобус "+ getBrand()+" "+getModel()+" в диагностике не нуждается");
        return true;
    }

    @Override
    public void getPitStop() {
        System.out.println( "Заедь в депо");
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
        return "автобус" + super.toString();
    }
}
