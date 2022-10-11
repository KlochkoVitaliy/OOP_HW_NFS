package need_for_speed;

public class PassengerСar extends Transport implements Competing{

    final private TypeOfBody typeOfBody;

    public PassengerСar(String brand, String model, double engineVolume,TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody=typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
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
    public String toString() {
        return "машина: " + super.toString();
    }

    @Override
    public void printTypeAuto() {
if(typeOfBody==null){
    System.out.println("Данных по авто недостаточно!");
}else {
    System.out.println("Тип куова авто -  " + typeOfBody);
}
    }

    @Override
    public boolean checkDiagnostic() {
        return Math.random()>0.7;
    }

    @Override
    public void getPitStop() {
        System.out.println("заехать на Пит-Стоп!!");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость");
    }
}
