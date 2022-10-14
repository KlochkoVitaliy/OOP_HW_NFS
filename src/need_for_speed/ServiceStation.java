package need_for_speed;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {

    private String name;
    private Queue<T> queue = new LinkedList<>();

    public void addAutoQueue(T transport) {
        queue.offer(transport);
    }

public void goTechnicalInspection(){
    T transport = queue.poll();
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
