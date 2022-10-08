package need_for_speed;

public class Bus extends Transport implements Competing {

    public void DetermineTheTypeOfCar (Capacity capacity) {
        switch (capacity) {
            case ESP_SMALL:
                System.out.println("Автомобиль " +getBrand()+" до 10 мест");
                break;
            case SMALL:
                System.out.println("Автомобиль " +getBrand()+" до 25 мест");
                break;
            case AVERAGE:
                System.out.println("Автомобиль " +getBrand()+" 40–50 мест");
                break;
                case BIG:
                System.out.println("Автомобиль " +getBrand()+" 60–80 мест");
                break;
                case ESP_BIG:
                System.out.println("Автомобиль " +getBrand()+" 100–120 мест");
                break;
            default:
                System.out.println(" Данных по авто недостаточно!!!");
        }
    }
    public enum Capacity {
        ESP_SMALL(10), SMALL(25), AVERAGE(40-50), BIG(60-80), ESP_BIG(100-120);
    private int numberOfSeats;

    Capacity (int numberOfSeats){
        this.numberOfSeats=numberOfSeats;
    }

        public int getNumberOfSeats() {
            return numberOfSeats;
        }

        public void setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
        }
    }
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
