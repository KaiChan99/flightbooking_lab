package airline;

public class Main {
    public static void main(String[] args) {

Flight flight1 = new Flight("Madrid",1);
Flight flight2=new Flight("London",2);
Passenger passenger1 = new Passenger("Bob", "Bob@gmail.com", 1);

Airline airline1 = new Airline("Ryanair");
Airline airline2 = new Airline("EasyJet");

        airline1.addNewFlight(flight1);
        airline1.addNewFlight(flight2);
airline1.cancelFlight(flight1);
  airline1.displayAvailFlights();












// end of code
    }
}
