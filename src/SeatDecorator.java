public class SeatDecorator extends TicketDecorator {
    public SeatDecorator(Ticket decoratedTicket){
        super(decoratedTicket);
    }
    @Override
    public double getCost(){
        return super.getCost() + 4000.0;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + "with Seat option";
    }
}
