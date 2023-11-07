package Tickets;

import Tickets.Ticket;

public class EconomyTicket implements Ticket {
    @Override
    public double getCost(){
        return 40000.0;
    }

    @Override
    public String getDescription() {
        return "Economy class flight ";
    }
}
