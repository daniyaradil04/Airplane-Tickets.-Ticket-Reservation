public class ExternalTicketServiceAdapter implements ExternalTicketService{
    private ExternalTicketService externalService;

    public ExternalTicketServiceAdapter(ExternalTicketService externalService){
        this.externalService = externalService;
    }

    @Override
    public Ticket getExternalTicket(){
        return new EconomyTicket();
    }
}
