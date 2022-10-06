import need_for_speed.*;

public class Main {
    public static void main(String[] args) {

        PassengerСar vesta = new PassengerСar("Lada", "Vesta", 1.8);
        PassengerСar granta = new PassengerСar("Lada", "Granta", 1.6);
        PassengerСar lada = new PassengerСar("Lada", "2112", 1.5);
        PassengerСar samara = new PassengerСar("Lada", "Samara", 1.3);

        Cargo kamaz = new Cargo("Kamaz", "3100", 5);
        Cargo maz = new Cargo("Maz", "1500", 3.5);
        Cargo yaz = new Cargo("YAZ", "Hunter", 2.5);
        Cargo yural = new Cargo("Yural", "Sibir", 4.5);

        Bus luaz = new Bus("Luaz", "AZ", 4);
        Bus paz = new Bus("Paz", "1505", 2.5);
        Bus daaz = new Bus("Daaz", "5502", 4);
        Bus raf = new Bus("Far", "3002", 2);

        printInfoPassengerCar(vesta);
        printInfoPassengerCar(granta);
        printInfoPassengerCar(lada);
        printInfoPassengerCar(samara);
        System.out.println();
        printInfoCargo(kamaz);
        printInfoCargo(maz);
        printInfoCargo(yaz);
        printInfoCargo(yural);
        System.out.println();
        printInfoBus(luaz);
        printInfoBus(paz);
        printInfoBus(daaz);
        printInfoBus(raf);

        System.out.println();

Driver<Transport> vasia = new Driver<>("Vasia");
vasia.startMoving(vesta);

Driver<Transport> petia = new Driver<>("Petia",true,15);
petia.startMoving(kamaz);

Driver<Transport> sasha = new Driver<>("Sasha",true,30);
sasha.startMoving(raf);
    }

    public static void printInfoPassengerCar(PassengerСar passengerCar) {
        System.out.println(passengerCar.getBrand() + " " + passengerCar.getModel() + ", обьем двигателя " + passengerCar.getEngineVolume());
    }
    public static void printInfoCargo(Cargo cargo) {
        System.out.println(cargo.getBrand() + " " + cargo.getModel() + ", обьем двигателя " + cargo.getEngineVolume());
    }
    public static void printInfoBus(Bus bus) {
        System.out.println(bus.getBrand() + " " + bus.getModel() + ", обьем двигателя " + bus.getEngineVolume());
    }
}
