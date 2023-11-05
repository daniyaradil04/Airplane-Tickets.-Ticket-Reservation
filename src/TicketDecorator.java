public abstract class TicketDecorator implements Ticket{
    private Ticket decoratedTicket;

    public TicketDecorator(Ticket decoratedTicket){
        this.decoratedTicket = decoratedTicket;
    }

    @Override
    public double getCost(){
        return decoratedTicket.getCost();
    }
    @Override
    public String getDescription() {
        return decoratedTicket.getDescription();
    }
}
