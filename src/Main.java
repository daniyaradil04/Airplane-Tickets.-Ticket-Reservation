import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.getConnection();

        displayTicketInfo(connection, 2);
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("*************************");

        ReservationNotifier reservationNotifier = new ReservationNotifier();

        Ticket ticket = new EconomyTicket();
        ticket = new MealDecorator(ticket);
        ticket = new SeatDecorator(ticket);

        reservationNotifier.addObserver(new ReservationLogger());
        reservationNotifier.notifyObservers(ticket);

        ExternalTicketService externalService = new ExternalTicketServiceImpl();
        ExternalTicketServiceAdapter adapter = new ExternalTicketServiceAdapter(externalService);
        Ticket externalTicket = adapter.getExternalTicket();
        System.out.println("External ticket is booked " + externalTicket);

    }

    private static void displayTicketInfo(Connection connection, int ticketID){

        String query = "SELECT T.TicketID, T.TicketType, R.CustomerName, R.TotalPrice, " +
                "F.DepartureCity, F.ArrivalCity, F.DepartureTime, F.ArrivalTime " +
                "FROM Tickets T " +
                "JOIN Reservations R ON T.ReservationID = R.ReservationID " +
                "JOIN Flights F ON T.FlightID = F.FlightID " +
                "WHERE T.TicketID = " + ticketID;

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query);){
            if(resultSet.next()){
                int ticketId = resultSet.getInt("TicketID");
                String ticketType = resultSet.getString("TicketType");
                String customerName = resultSet.getString("CustomerName");
                double totalPrice = resultSet.getDouble("TotalPrice");
                String departureCity = resultSet.getString("DepartureCity");
                String arrivalCity = resultSet.getString("ArrivalCity");
                String departureTime = resultSet.getString("DepartureTime");
                String arrivalTime = resultSet.getString("ArrivalTime");

                System.out.println("Ticket ID: " + ticketID);
                System.out.println("Ticket type: " + ticketType);
                System.out.println("Customer Name: " + customerName);
                System.out.println("Total price: " + totalPrice);
                System.out.println("Departure city: " + departureCity);
                System.out.println("Arrival city: " + arrivalCity);
                System.out.println("Departure time: " + departureTime);
                System.out.println("Arrival time: " + arrivalTime);
            }
            else{
                System.out.println("Ticket with id " + ticketID + "is not found");
            }
        }catch (SQLException e){
            e.printStackTrace();
            System.err.println("An error has occured while working with database" + e.getMessage());
        }
    }
}