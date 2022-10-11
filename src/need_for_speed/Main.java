package need_for_speed;

public class Main {
    public static void main(String[] args) {

        PassengerСar vesta = new PassengerСar("Lada", "Vesta", 1.8, TypeOfBody.SEDAN);
        PassengerСar granta = new PassengerСar("Lada", "Granta", 1.6, TypeOfBody.HATCHBACK);
        PassengerСar lada = new PassengerСar("Lada", "2112", 1.5, TypeOfBody.SEDAN);
        PassengerСar samara = new PassengerСar("Lada", "Samara", 1.3, TypeOfBody.SEDAN);

        Cargo kamaz = new Cargo("Kamaz", "3100", 5, LoadCapacity.N2);
        Cargo maz = new Cargo("Maz", "1500", 3.5, LoadCapacity.N3);
        Cargo yaz = new Cargo("YAZ", "Hunter", 2.5, LoadCapacity.N1);
        Cargo yural = new Cargo("Yural", "Sibir", 4.5, LoadCapacity.N1);

        Bus luaz = new Bus("Luaz", "AZ", 4, Capacity.BIG);
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

        DriverB vasia = new DriverB("Васька", 'B', 10,"B", vesta);
        DriverC alex = new DriverC("Леха", 'C', 15, "C",kamaz);
        DriverD petia = new DriverD("Петро", 'D', 25,"D", raf);

        System.out.println(alex);
        System.out.println(vasia);
        System.out.println(petia);

        System.out.println();

        alex.diverInfo(kamaz);
        vasia.diverInfo(granta);
        petia.diverInfo(raf);

        System.out.println();
        checkDiagnostic(
                vesta, granta, lada, samara,
                kamaz, maz, yaz, yural,
                luaz, paz, daaz, raf
        );


    }

    private static void checkDiagnostic(Transport... transports) {
        for (Transport transport: transports) {
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
