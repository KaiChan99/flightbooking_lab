package airline;

import java.util.ArrayList;

public class Airline {

    private String airlineName;
    private ArrayList<Flight> allFlights;

    private ArrayList<Passenger> allPassengers;

    public Airline(String airlineName) {
        this.airlineName = airlineName;
        this.allFlights = new ArrayList<>();
        this.allPassengers = new ArrayList<>();
    }

    public void addNewFlight(Flight flight) {
        this.allFlights.add(flight);
    }

    public int getAllFlightsCount() {
        return this.allFlights.size();

    }

    public void cancelFlight(Flight flight) {
        this.allFlights.remove(flight);
    }
    // Display available flights

    public void displayAvailFlights() {
        if (allFlights.isEmpty()) {
            System.out.println("no flights available");
        } else {
            for (Flight flight : allFlights) {
                System.out.println("Flight ID " + flight.getFlightID() + " | Destination: " + flight.getDestination() + " | Airline: " + getAirlineName());
            }
        }

    }

    public void displayAllPassengers() {
        if (allPassengers.isEmpty()) {
            System.out.println("no passengers in lobby");;
        } else {
            for (Passenger passenger : allPassengers) {
                System.out.println("Passenger waiting: " + passenger.getName() + " ID: " + passenger.getId());
            }
        }

    }

    public void addPassengerLobby(Passenger passenger) {
        this.allPassengers.add(passenger);
    }

    public Passenger findPassenger(int id) {
        Passenger foundPassenger = null;

        for (Passenger passenger : allPassengers) {
            if (passenger.getId() == id) {
                foundPassenger = passenger;
                break;
            }

        }return foundPassenger;
    }

    public Flight findFlight(int id) {
        Flight foundFlight = null;

        for (Flight flight : allFlights) {
            if (flight.getFlightID() == id) {
                foundFlight = flight;
                break;
            }
        }return foundFlight;
    }



    // Getters & Setters


    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }


}
