package need_for_speed;

public class Cargo extends Transport implements Competing {


    public void DetermineTheTypeOfCar (LoadCapacity loadCapacity) {
        switch (loadCapacity) {
            case N1:
                System.out.println("Автомобиль " +getBrand()+ " с полной массой до 3,5 тонн");
                break;
            case N2:
                System.out.println("Автомобиль " +getBrand()+" с полной массой свыше 3,5 до 12 тонн");
                break;
            case N3:
                System.out.println("Автомобиль " +getBrand()+" с полной массой свыше 12 тонн");
                break;
            default:
                System.out.println(" Данных по авто недостаточно!!!");
        }
    }
    public enum LoadCapacity {

        N1(3.5), N2(3.5 - 12), N3(12);
        private double fullWeight;

        LoadCapacity(double fullWeight) {
            this.fullWeight = fullWeight;
        }


        public double getFullWeight() {
//            if (fullWeight <= 3.5) {
//                this.fullWeight = LoadCapacity.N1.fullWeight;
//            } else if (fullWeight >= 3.5 && fullWeight <= 12) {
//                this.fullWeight = LoadCapacity.N2.fullWeight;
//            } else if (fullWeight > 12) {
//                this.fullWeight = LoadCapacity.N3.fullWeight;
//            } else {
//                System.out.println("Нет значений");
//            }
//            return 0;
            return fullWeight;
        }

        public void setFullWeight(double fullWeight) {
            this.fullWeight = fullWeight;
        }
    }

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
