package airline;

public class Main {
    public static void main(String[] args) {

Flight flight1 = new Flight("Madrid",1);
Flight flight2=new Flight("London",2);
Passenger passenger1 = new Passenger("Bob", "Bob@gmail.com", 1);

Airline airline1 = new Airline("Ryanair");
Airline airline2 = new Airline("EasyJet");

// testing adding and cancelling flights
        airline1.addNewFlight(flight1);
        airline1.addNewFlight(flight2);
        System.out.println(airline1.getAllFlightsCount());
//airline1.cancelFlight(flight1);
        System.out.println(airline1.displayAvailFlights());


// testing adding passengers to flight
//flight2.bookPassenger(passenger1);
//flight2.displayPassengers();

// testing adding flight booking to a passenger
flight1.bookPassenger(passenger1);
passenger1.addFlightBooking(flight1);
        System.out.println(passenger1.getFlightBooking());


// end of code
    }
}
