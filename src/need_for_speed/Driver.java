package need_for_speed;


abstract public class Driver<T extends Transport & Competing> {

    final private String fullNameDriver;
    final private Character driverLicense;
    private double experience;
    private T car;

    private String category;

    public Driver(String fullNameDriver, Character driverLicense, double experience, String category, T car) {
        if (fullNameDriver == null || fullNameDriver.isEmpty()) {
            throw new NullPointerException("Укажите имя водителя");
        } else {
            this.fullNameDriver = fullNameDriver;
        }
        if (driverLicense != 'B' && driverLicense != 'C' && driverLicense != 'D') {
            throw new NullPointerException("Иди учись в автошколу!");
        } else {
            this.driverLicense = driverLicense;
        }
        if (car != null) {
            this.car = car;
        }
        setExperience(experience);
        setCategory(category);
    }


    public void startMoving() {
        System.out.println(fullNameDriver + " заводит " + car.getBrand() + " " + car.getModel());
    }

    public void finishMoving() {
        System.out.println(fullNameDriver + " останавливает " + car.getBrand() + " " + car.getModel());
    }

    public void refuelTheCar() {
        System.out.println(fullNameDriver + " заправляет " + car.getBrand() + " " + car.getModel());
    }

    public String getFullNameDriver() {
        return fullNameDriver;
    }

    public Character getDriverLicense() {
        return driverLicense;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        if (experience <= 0) {
            throw new NullPointerException("Иди учись водить!");
        } else {
            this.experience = experience;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав!");
        }
        this.category = category;
    }

    public void diverInfo(Transport transport) {
        System.out.println("водитель " + fullNameDriver + " управляет " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде.");
        transport.printTypeAuto();
    }

    @Override
    public String toString() {
        return fullNameDriver + " ,категория прав: " + driverLicense + ",опыт вождения: " + experience + " лет.";
    }
}
