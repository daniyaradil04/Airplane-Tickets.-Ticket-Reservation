import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.getConnection();
        String query = "SELECT * FROM tickets";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                int ticketID = resultSet.getInt("TicketID");
                String ticketType = resultSet.getString("TicketType");
                int reservationID = resultSet.getInt("ReservationID");
                int flightID = resultSet.getInt("FlightID");

                System.out.println("Ticket ID" + ticketID);
                System.out.println("Ticket type" + ticketType);
                System.out.println("Reservation ID" + reservationID);
                System.out.println("Flight ID" + flightID);
                System.out.println("********************************");

            }
            resultSet.close();
            statement.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
            System.err.println("An error has occured while working with database" + e.getMessage());
        }
    }
}