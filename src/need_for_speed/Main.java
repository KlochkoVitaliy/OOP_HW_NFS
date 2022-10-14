package need_for_speed;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Mechanics<PassengerСar> fedia = new Mechanics<>("Федя", "Пупкин", "Гаечка ООО");
        Mechanics<Transport> lenia = new Mechanics<>("Леня", "Болтиков", "Победа ЗАО");

        Sponsor manol = new Sponsor("Манол", 1_000_000);
        Sponsor castrol = new Sponsor("Кастрол", 10_000_000);

        PassengerСar vesta = new PassengerСar("Lada", "Vesta", 1.8, TypeOfBody.SEDAN);
        vesta.addDriver(new DriverB("Васька", 'B', 10, "B", vesta));
        vesta.addMechanic(fedia);
        vesta.addSponsor(manol, castrol);

        PassengerСar granta = new PassengerСar("Lada", "Granta", 1.6, TypeOfBody.HATCHBACK);
        PassengerСar lada = new PassengerСar("Lada", "2112", 1.5, TypeOfBody.SEDAN);
        PassengerСar samara = new PassengerСar("Lada", "Samara", 1.3, TypeOfBody.SEDAN);

        Cargo kamaz = new Cargo("Kamaz", "3100", 5, LoadCapacity.N2);
        kamaz.addDriver(new DriverC("Леха", 'C', 15, "C", kamaz));
        kamaz.addMechanic(lenia);
        kamaz.addSponsor(castrol);

        Cargo maz = new Cargo("Maz", "1500", 3.5, LoadCapacity.N3);
        Cargo yaz = new Cargo("YAZ", "Hunter", 2.5, LoadCapacity.N1);
        Cargo yural = new Cargo("Yural", "Sibir", 4.5, LoadCapacity.N1);

        Bus luaz = new Bus("Luaz", "AZ", 4, Capacity.BIG);
        luaz.addDriver(new DriverD("Петро", 'D', 25, "D", luaz));
        luaz.addMechanic(lenia);
        luaz.addSponsor(manol);

        Bus paz = new Bus("Paz", "1505", 2.5, Capacity.AVERAGE);
        Bus daaz = new Bus("Daaz", "5502", 4, Capacity.SMALL);
        Bus raf = new Bus("Raf", "3002", 2, Capacity.ESP_SMALL);

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

//        DriverB vasia = new DriverB("Васька", 'B', 10, "B", vesta);
//        DriverC alex = new DriverC("Леха", 'C', 15, "C", kamaz);
//        DriverD petia = new DriverD("Петро", 'D', 25, "D", raf);

//        System.out.println(alex);
//        System.out.println(vasia);
//        System.out.println(petia);
//
//        System.out.println();
//
//        alex.diverInfo(kamaz);
//        vasia.diverInfo(granta);
//        petia.diverInfo(raf);

        System.out.println();
        checkDiagnostic(
                vesta, granta, lada, samara,
                kamaz, maz, yaz, yural,
                luaz, paz, daaz, raf
        );

        System.out.println("List");

        List<Transport> transpors = List.of(vesta, kamaz, luaz);
        for (Transport transport : transpors) {
            printInfo(transport);
        }

        System.out.println("Queue");

        ServiceStation<PassengerСar> lutic = new ServiceStation<>("Лютик");
        lutic.addAutoQueue(vesta);
        lutic.addAutoQueue(granta);
        lutic.addAutoQueue(lada);
        lutic.addAutoQueue(samara);

        lutic.goTechnicalInspection();
    }

    public static void printInfo(Transport transport) {
        System.out.println("Информация по авто: " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Информация по водителю: " + transport.getDrivers());
        System.out.println("Информация по спонсорам: " + transport.getSponsors());
        System.out.println("Информация по механику: " + transport.getMechanics());
        System.out.println();
    }

    private static void checkDiagnostic(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }


    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.checkDiagnostic()) {
                throw new RuntimeException("Автомобиль" + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику!");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
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
