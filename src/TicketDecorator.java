public abstract class TicketDecorator implements TicketType{
    protected TicketType decoratedTicket;

    public TicketDecorator(TicketType decoratedTicket){
        this.decoratedTicket = decoratedTicket;
    }

    @Override
    public double calculatePrice(){
        return decoratedTicket.calculatePrice();
    }
}
