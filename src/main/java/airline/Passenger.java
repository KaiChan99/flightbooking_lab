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
    this.flightBooking = flightBooking;
}


// Adding flight to passengersBooking
    public void AddFlightReservation(Flight flight){
        this.flightBooking.add(flight);
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
