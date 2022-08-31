package airline;

import java.util.ArrayList;

public class Airline {

    private String airlineName;
    private ArrayList<Flight> allFlights;

    private ArrayList<Passenger> allPassengers;

    public Airline(String airlineName){
        this.airlineName = airlineName;
        this.allFlights = new ArrayList<>();
        this.allPassengers = new ArrayList<>();
    }

    public void addNewFlight(Flight flight){
        this.allFlights.add(flight);
    }
public int getAllFlightsCount(){
        return this.allFlights.size();

}

public void cancelFlight(Flight flight){
        this.allFlights.remove(flight);
}
    // Display available flights

public String displayAvailFlights(){
        if(allFlights.isEmpty()){
            return "no flights available";
        }else{
        for (Flight flight : allFlights){
            System.out.println("Flight ID "+flight.getFlightID()+" | Destination: " +flight.getDestination()+" | Airline: "+getAirlineName());
        }}
        return null;
}

public String displayAllPassengers(){
    if(allPassengers.isEmpty()){
        return "no passengers in lobby";
    }else{
        for (Passenger passenger : allPassengers){
            System.out.println("Passenger waiting: " +passenger.getName()+" ID: "+passenger.getId());
        }}
    return null;
}

public void addPassengerLobby(Passenger passenger){
        this.allPassengers.add(passenger);
}


    // Getters & Setters


    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }


}
