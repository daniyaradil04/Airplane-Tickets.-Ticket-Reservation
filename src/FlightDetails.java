import java.time.LocalDateTime;
public interface FlightDetails {
    String getFlightNumber();
    String getDeparture();
    String getArrival();
    LocalDateTime getDepTime();
    LocalDateTime getArrTime();
}
