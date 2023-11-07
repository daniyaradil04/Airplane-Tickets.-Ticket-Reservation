package Observer;

import Tickets.Ticket;

public interface ReservationObserver {
    void update(Ticket ticket);
}

