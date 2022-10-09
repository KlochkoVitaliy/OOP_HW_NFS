package need_for_speed;

public class PassengerСar extends Transport implements Competing{

    private TypeOfBody typeOfBody;

    public PassengerСar(String brand, String model, double engineVolume,TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody=typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
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
    public void printTypeAuto() {
if(typeOfBody==null){
    System.out.println("Данных по авто недостаточно!");
}else {
    System.out.println("Тип куова авто -  " + typeOfBody);
}
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
