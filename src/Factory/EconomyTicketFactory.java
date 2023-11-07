package Factory;

import Tickets.EconomyTicket;

public class EconomyTicketFactory extends TicketFactory{
    @Override
    public EconomyTicket createTicket(){
        return new EconomyTicket();
    }
}
