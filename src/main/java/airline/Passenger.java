package airline;

import java.util.ArrayList;

public class Passenger {

    private String name;

    private String contact;

    private int id;

    private ArrayList<Flight> flightBooking;

public Passenger(String name, String contact, int id){
    this.name = name;
    this.contact = contact;
    this.id = id;
    this.flightBooking = new ArrayList<>();
}


// Adding flight to passengersBooking
    public void addFlightBooking(Flight flight){
        this.flightBooking.add(flight);
    }
// Display flights in  passengerBooking
public String getFlightBooking(){
    if(flightBooking.isEmpty()){
        return "this passenger has no flights booked yet";
    }else{
        for (Flight flight : flightBooking){
            return this.name +" is travelling to "+flight.getDestination() +" | Flight ID: "+flight.getFlightID();
        }}
    return null;
}


// Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
