public class Main {
    public static void main(String[] args) {
        ReservationNotifier reservationNotifier = new ReservationNotifier();

        Ticket ticket = new EconomyTicket();
        ticket = new MealDecorator(ticket);
        ticket = new SeatDecorator(ticket);

        reservationNotifier.addObserver(new ReservationLogger());
        reservationNotifier.notifyObservers(ticket);

        ExternalTicketService externalService = new ExternalTicketServiceImpl();
        ExternalTicketServiceAdapter adapter = new ExternalTicketServiceAdapter(externalService);
        Ticket externalTicket = adapter.getExternalTicket();
    }
}