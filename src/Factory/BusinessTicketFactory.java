package Factory;

import Tickets.BusinessTicket;

public class BusinessTicketFactory extends TicketFactory{
    @Override
    public BusinessTicket createTicket(){
        return new BusinessTicket();
    }
}
