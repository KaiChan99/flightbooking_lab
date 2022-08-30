package airline;

import java.util.ArrayList;

public class Airline {

    private String airlineName;
    private ArrayList<Flight> allFlights;

    public Airline(String airlineName){
        this.airlineName = airlineName;
        this.allFlights = new ArrayList<>();

    }

    // Display available flights

//public String DisplayAvailFlights(){
//        for (Flight flight : allFlights){
//           System.out.println(allFlights);
//        }
//    return null;
//}




    // Getters & Setters


    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }


}
