public class BusinessTicket implements Ticket{
    @Override
    public double getCost(){
        return 65000.0;
    }
    @Override
    public String getDescription(){
        return "Business class flight";
    }
}
