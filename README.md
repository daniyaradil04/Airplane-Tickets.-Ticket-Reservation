# Airplane Tickets. Ticket Reservation
## This is Software Design Pattern final project with title "Airplane Tickets.Ticket Reservation Project"

### 1. Strategy Pattern
Usage: The Strategy Pattern is used to provide different types of tickets, such as Economy Class and Business Class, with varying behaviors for calculating their costs. It enables the system to switch between different ticket types while keeping the implementation details hidden.

### 2. Decorator Pattern
Usage: The Decorator Pattern is employed to dynamically add additional features (e.g., meal and seat options) to basic tickets without altering their structure. It enhances the flexibility of creating new ticket variants.
he Strategy Pattern is applied within the Tickets.EconomyTicket and Tickets.BusinessTicket classes, allowing each ticket type to define its own cost calculation strategy.
Decorator pattern is used in the Decorator.MealDecorator and Decorator.SeatDecorator classes to add meal and seat options to existing ticket objects.

### 3. Strategy Pattern
Usage: The Adapter Pattern is utilized to make external services compatible with the reservation system. It allows the system to work with external services by providing an adapter that converts their data to a compatible format.
The Adadpter.ExternalTicketServiceAdapter acts as an adapter to work with external services. It converts the data received from external services into a format compatible with the reservation system.

### 4. Observer Pattern
Usage: The Observer Pattern is applied to notify various components of the system about ticket reservations. It ensures that multiple observers can react to reservation events.
The Observer Pattern is integrated into the Observer.ReservationNotifier and Observer.ReservationLogger classes. The Observer.ReservationLogger observes ticket reservations and logs relevant information.

### 5. Singleton Pattern
Usage: The Singleton Pattern is used to ensure that there is only one instance of the database connection throughout the application. It optimizes resource usage by creating a single, shared instance of the database connection.
The Singleton.DatabaseConnection class uses the Singleton Pattern to maintain a single database connection instance throughout the application.

### 6. Factory pattern
Usage: The Factory Pattern is implemented to create instances of different ticket types based on their category. It centralizes the creation logic, making it easier to extend the system with new ticket types.
The Factory.TicketFactory class is responsible for creating instances of Tickets.EconomyTicket and Tickets.BusinessTicket based on the provided type.

The Strategy Pattern defines the cost calculation strategy for different ticket types, allowing flexibility in pricing.
The Decorator Pattern enhances tickets with additional options like meals and seats, providing a rich set of features.
The Adapter Pattern ensures compatibility with external services, enabling the integration of tickets from external sources.
The Observer Pattern notifies components like Observer.ReservationLogger about ticket reservations, enhancing the monitoring and logging capabilities.
The Singleton Pattern provides a single, shared database connection used by various parts of the application.
The Factory Pattern simplifies the creation of different ticket types, offering a centralized mechanism for creating tickets.
These patterns collectively contribute to a well-structured, maintainable, and expandable airline ticket reservation system.

This README provides an overview of how each design pattern is employed in the project and how they work in concert to create a comprehensive and robust airline ticket reservation system.


![newnew](https://github.com/daniyaradil04/sdp_final/assets/124418726/5fc1f00f-bad2-4be0-99a0-bc6b7c2e069e)