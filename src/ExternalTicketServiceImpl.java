import org.json.JSONException;
import org.json.JSONObject;

public class ExternalTicketServiceImpl implements ExternalTicketService{
    @Override
    public Ticket getExternalTicket(){
        String externalData = fetchTicketFromExternalService();
        Ticket ticket = parseExternalData(externalData);
        return ticket;
    }

    private String fetchTicketFromExternalService(){
        return "data from external service Economy";
    }
    private Ticket parseExternalData(String externalData){
        try{
            JSONObject json = new JSONObject(externalData);
            String ticketType = json.getString("type");

            if (ticketType.equalsIgnoreCase("Economy")){
                return new EconomyTicket();
            }
            else if (ticketType.equalsIgnoreCase("Business")){
                return new BusinessTicket();
            }
            else{
                throw new IllegalArgumentException("Invalid ticket type");
            }
        }catch(JSONException e){
            e.printStackTrace();
            return null;
        }
    }
}
