import java.util.ArrayList;
import java.util.List;
public class ReservationNotifier {
    private List<ReservationObserver> observers = new ArrayList<>();

    public void addObserver(ReservationObserver observer){
        observers.add(observer);
    }
    public void notifyObservers(Ticket ticket){
        for(ReservationObserver observer : observers){
            observer.update(ticket);
        }
    }
}
