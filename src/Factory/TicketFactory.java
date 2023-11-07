package Factory;
import Tickets.BusinessTicket;
import Tickets.EconomyTicket;
import Tickets.Ticket;

public abstract class TicketFactory {
    public abstract Ticket createTicket();
}
