package airline;

import java.util.ArrayList;

public class Flight {

  private String destination;

  private int flightID;

  private ArrayList<Passenger> flightPassengers;
  private Passenger passenger;
  public Flight()
  {
    this.destination = destination;
    this.flightID = flightID;
    this.flightPassengers = new ArrayList<>();
  }


  // Adding passenger to flight
  public void bookPassenger(Passenger passenger){
    this.flightPassengers.add(passenger);
  }

// Display passengers on flight
  public String displayPassengers(){
    if(flightPassengers.isEmpty()){
      System.out.println("no passengers on flight");
    }else{
      for (Passenger passenger : flightPassengers){
        System.out.println("Passenger ID: "+passenger.getId()+" | Passenger name: " +passenger.getName());
      }}
    return null;
  }

  // Getters & Setters

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public int getFlightID() {
    return flightID;
  }

  public void setFlightID(int flightID) {
    this.flightID = flightID;
  }
}
