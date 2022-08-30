import airline.Airline;
import airline.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class AirlineTest {
    private Airline airline;
    private Flight flight1;
    private Flight flight2;

    @BeforeEach
    public void setUp() {
        airline = new Airline("Ryanair");
        flight1=new Flight("Madrid",1);
        flight2=new Flight("London",2);


    }
    @Test
    public void allFlightsStartsEmpty(){
        assertThat(airline.getAllFlightsCount()).isEqualTo(0);
    }

    @Test
    public void canAddNewFlight(){
        airline.addNewFlight(flight1); // new Flight("Madrid",1);
        assertThat(airline.getAllFlightsCount()).isEqualTo(1);
    }
    @Test
    public void canAddMultipleNewFlights(){
        airline.addNewFlight(flight1); // new Flight("Madrid",1);
        airline.addNewFlight(flight2);
        assertThat(airline.getAllFlightsCount()).isEqualTo(2);
    }

    @Test
    public void allFlightsDisplayNoFlightsAvailable(){
        assertThat(airline.displayAvailFlights()).isEqualTo("no flights available");
    }

    @Test
    public void canAddAndDisplayNewFlight(){
        airline.addNewFlight(flight1); // new Flight("Madrid",1);
        assertThat(airline.displayAvailFlights()).isEqualTo("Flight ID: "+1+" | Destination: " +"Madrid"+" | Airline: "+"Ryanair");

    }
}
