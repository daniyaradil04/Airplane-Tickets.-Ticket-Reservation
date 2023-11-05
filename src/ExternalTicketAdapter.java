public class ExternalTicketAdapter implements ExternalTicketService{
    private ExternalService externalService;

    public ExternalTicketAdapter(ExternalService externalService){
        this.externalService = externalService;
    }
    @Override
    public Ticket bookExternalTicket(){
        String reservationNumber = externalService.reserveTicket();
        return new Ticket(reservationNumber);
    }
}
