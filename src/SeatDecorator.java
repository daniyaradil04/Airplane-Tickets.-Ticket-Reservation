public class SeatDecorator extends TicketDecorator {
    public SeatDecorator(TicketType decoratedTicket){
        super(decoratedTicket);
    }

    @Override
    public double calculatePrice(){
        return super.calculatePrice() + 4000.0;
    }
}
