package need_for_speed;

public class PassengerСar extends Transport implements Competing{

    public void DetermineTheTypeOfCar (Body body) {
        switch (body) {
            case SEDAN:
                System.out.println("Автомобиль " +getBrand()+getModel()+ " Седан");
                break;
            case HATCHBACK:
                System.out.println("Автомобиль " +getBrand()+getModel()+" Хэтчбек");
                break;
            case COMPARTMENT:
                System.out.println("Автомобиль " +getBrand()+getModel()+" Купе");
                break;
                case STATION_WAGON:
                System.out.println("Автомобиль " +getBrand()+getModel()+" Универсал");
                break;
                case OFF_ROAD_VEHICELE:
                System.out.println("Автомобиль " +getBrand()+getModel()+" Внедорожник");
                break;
                case CROSSOVER:
                System.out.println("Автомобиль " +getBrand()+getModel()+" Кроссовер");
                break;
                case PICKUP:
                System.out.println("Автомобиль " +getBrand()+getModel()+" Пикап");
                break;
                case VAN:
                System.out.println("Автомобиль " +getBrand()+getModel()+" Фургон");
                break;
                case MINIVAN:
                System.out.println("Автомобиль " +getBrand()+getModel()+" Минивэн");
                break;
            default:
                System.out.println(" Данных по авто недостаточно!!!");
        }
    }
    public enum Body {


        SEDAN("Седан"),
        HATCHBACK("Хэтчбек"),
        COMPARTMENT("Купе"),
        STATION_WAGON("Универсал"),
        OFF_ROAD_VEHICELE("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
    private String nameOfBody;

        Body(String nameOfBody){
            this.nameOfBody=nameOfBody;
        }

        public String getNameOfBody(){
            return nameOfBody;
        }

        public void setNameOfBody(String nameOfBody) {
            this.nameOfBody = nameOfBody;
        }
    }

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
