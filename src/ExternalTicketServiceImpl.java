public class ExternalTicketServiceImpl implements ExternalTicketService{
    @Override
    public Ticket getExternalTicket(){
        String externalData = fetchTicketFromExternalService();
        Ticket ticket = parseExternalData(externalData);
        return ticket;
    }

    private String fetchTicketFromExternalService(){
        return "data from external service {\"type\": \"Economy\"}";
    }
    private Ticket parseExternalData(String externalData){

    }
}
