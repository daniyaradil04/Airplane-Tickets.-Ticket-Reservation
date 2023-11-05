public class Ticket {
    private String reservationNumber;
    private String passangerName;
    private FlightDetails flightDetails;

    public Ticket(String reserveTicket){
        this.reservationNumber = reserveTicket;
    }

    public String getReservationNumber(){
        return reservationNumber;
    }

    public String getPassangerName(){
        return passangerName;
    }

    public void setPassangerName(String passangerName){
        this.passangerName = passangerName;
    }

    public FlightDetails getFlightDetails() {
        return flightDetails;
    }

    public void setFlightDetails(FlightDetails flightDetails){
        this.flightDetails = flightDetails;
    }
}
