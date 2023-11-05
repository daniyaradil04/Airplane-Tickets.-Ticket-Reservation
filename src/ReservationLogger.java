public class ReservationLogger implements ReservationObserver{
    @Override
    public void update(Ticket ticket){
        System.out.println("Reservation is created for: " + ticket.getDescription());
    }
}
