package airline;

import java.util.ArrayList;

public class Flight {

  private String destination;

  private int flightID;

  private ArrayList<Passenger> flightPassengers;

  public Flight(String destination, int flightID){
    this.destination = destination;
    this.flightID = flightID;
    this.flightPassengers = new ArrayList<>();
  }


}
