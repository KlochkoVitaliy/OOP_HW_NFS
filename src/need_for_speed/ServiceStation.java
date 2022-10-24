package need_for_speed;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    private String name;
    private Queue<Transport> queue = new LinkedList<>();

    private void addAutoQueue(Transport transport) {
        queue.offer(transport);
    }
    public void addCarQueue(PassengerСar passengerСar) {
        addAutoQueue(passengerСar);
    }
    public void addCargoQueue(Cargo cargo) {
        addAutoQueue(cargo);
    }

public void goTechnicalInspection(){
    Transport transport = queue.poll();
    if(transport!=null){
        System.out.println("Проведен техъосмотр авто " + transport.getBrand()+ " " + transport.getModel());
        goTechnicalInspection();
    }else {
        System.out.println("В очереди больше никого нет!");
    }
}

    public ServiceStation(String name) {
        this.name = name;
    }
}
