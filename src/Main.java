import NeedForSpeed.*;

public class Main {
    public static void main(String[] args) {

        Passenger vesta = new Passenger("Lada", "Vesta", 1.8);
        Passenger granta = new Passenger("Lada", "Granta", 1.6);
        Passenger lada = new Passenger("Lada", "2112", 1.5);
        Passenger samara = new Passenger("Lada", "Samara", 1.3);

        Cargo kamaz = new Cargo("Kamaz", "3100", 5);
        Cargo maz = new Cargo("Maz", "1500", 3.5);
        Cargo yaz = new Cargo("YAZ", "Hunter", 2.5);
        Cargo yural = new Cargo("Yural", "Sibir", 4.5);

        Buses luaz = new Buses("Luaz", "AZ", 4);
        Buses paz = new Buses("Paz", "1505", 2.5);
        Buses daaz = new Buses("Daaz", "5502", 4);
        Buses raf = new Buses("Far", "3002", 2);

        printInfoPassenger(vesta);
        printInfoPassenger(granta);
        printInfoPassenger(lada);
        printInfoPassenger(samara);
        System.out.println();
        printInfoCargo(kamaz);
        printInfoCargo(maz);
        printInfoCargo(yaz);
        printInfoCargo(yural);
        System.out.println();
        printInfoBuses(luaz);
        printInfoBuses(paz);
        printInfoBuses(daaz);
        printInfoBuses(raf);

        System.out.println();

Driver<Passenger> vasia = new Driver<>("Vasia", true,10);
vasia.startMoving(vesta);

Driver<Cargo> petia = new Driver<>("Petia",true,15);
petia.startMoving(kamaz);

Driver<Buses> sasha = new Driver<>("Sasha",true,30);
sasha.startMoving(raf);
    }

    public static void printInfoPassenger(Passenger passenger) {
        System.out.println(passenger.getBrand() + " " + passenger.getModel() + ", обьем двигателя " + passenger.getEngineVolume());
    }
    public static void printInfoCargo(Cargo cargo) {
        System.out.println(cargo.getBrand() + " " + cargo.getModel() + ", обьем двигателя " + cargo.getEngineVolume());
    }
    public static void printInfoBuses(Buses buses) {
        System.out.println(buses.getBrand() + " " + buses.getModel() + ", обьем двигателя " + buses.getEngineVolume());
    }
}
