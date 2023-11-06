public class TicketFactory {
    public static Ticket createTicket(String type){
        if (type.equalsIgnoreCase("Economy")){
            return new EconomyTicket();
        }
        else if (type.equalsIgnoreCase("Business")){
            return new BusinessTicket();
        }
        else {
            throw new IllegalArgumentException("Invalid ticket type");
        }
    }
}
