public class MealDecorator extends TicketDecorator{
    public MealDecorator(Ticket decoratedTicket){
        super(decoratedTicket);
    }
    @Override
    public double getCost(){
        return super.getCost() + 5000.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "with Meal ";
    }
}
