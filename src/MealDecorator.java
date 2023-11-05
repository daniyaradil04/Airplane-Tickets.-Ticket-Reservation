public class MealDecorator extends TicketDecorator{
    public MealDecorator(TicketType decoratedTicket){
        super(decoratedTicket);
    }

    @Override
    public double calculatePrice(){
        return super.calculatePrice() + 5000.0;
    }
}
