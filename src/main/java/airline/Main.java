package airline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Airline airline1 = new Airline("Ryanair");
        // Start of CLI - Attempt

        String input;
        Scanner scanner = new Scanner(System.in);

        List<Passenger> listOfPassenger = new ArrayList<>();
        List<Flight> listOfFlight = new ArrayList<>();

        Flight flight2 = new  Flight();
        Flight flight3 = new Flight();
        Flight flight4 = new Flight();

        flight2.setDestination("Budapest");
        flight2.setFlightID(70);
        flight3.setDestination("Prague");
        flight3.setFlightID(99);
        flight4.setDestination("Barcelona");
        flight4.setFlightID(88);

        airline1.addNewFlight(flight2);
        airline1.addNewFlight(flight3);
        airline1.addNewFlight(flight4);

        Passenger passenger2 = new Passenger();
        Passenger passenger3 = new Passenger();
        Passenger passenger4 = new Passenger();

        passenger2.setName("Steve");
        passenger3.setName("John");
        passenger4.setName("Dale");

        passenger2.setId(5);
        passenger3.setId(10);
        passenger4.setId(20);

        passenger2.setContact("Steve@Gmail.com");
        passenger3.setContact("John@Gmail.com");
        passenger4.setContact("Dale@Gmail.com");

        airline1.addPassengerLobby(passenger2);
        airline1.addPassengerLobby(passenger3);
        airline1.addPassengerLobby(passenger4);




        do {
            System.out.println("Flight Booking Menu");
            System.out.println("1. Add a new Flight");
            System.out.println("2. Add a new Passenger");
            System.out.println("3. Display all available flights");
            System.out.println("4. Book a Passenger onto a flight");
            System.out.println("5. Cancel a flight");
            System.out.println("6. Quit");

            System.out.print("Please enter either 1 to 6: ");
            input = (scanner.nextLine());
            if (input.equals("1")) {
                Flight flight1 = new Flight();
                System.out.println("Where is your destination?");
                String destination = scanner.nextLine();
                flight1.setDestination(destination);

                System.out.println("What is the flight ID?");
                int flightID = scanner.nextInt();
                flight1.setFlightID(flightID);
                listOfFlight.add(flight1);
                airline1.addNewFlight(flight1);
                System.out.println("great! we have added a flight to " +flight1.getDestination()+" flight ID: "+flight1.getFlightID());
                input = (scanner.nextLine());
            } else if (input.equals("2")) {
                Passenger passenger1 = new Passenger();
                System.out.println("Please enter passenger's name");
                String name = scanner.nextLine();
                passenger1.setName(name);

                System.out.println("Please enter passenger's email");
                String contact = scanner.nextLine();
                passenger1.setContact(contact);

                System.out.println("Please enter passenger's ID");
                int id = scanner.nextInt();
                passenger1.setId(id);


                listOfPassenger.add(passenger1);
                airline1.addPassengerLobby(passenger1);

                System.out.println("great! we have added a passenger: " +passenger1.getName()+" ID: "+passenger1.getId());
                input = (scanner.nextLine());

            } else if (input.equals("3")) {
                airline1.displayAvailFlights();



            } else if (input.equals("4")) {
                System.out.println("Here you can see all available flights:");
                airline1.displayAvailFlights();
                System.out.println("Here you can see all registered passengers:");
                airline1.displayAllPassengers();
                System.out.println("Which passenger would you like to book on a flight? Select ID: ");
                Integer passengerID= scanner.nextInt();

                System.out.println("Which flight do you want to book? Select ID: ");
                Integer flightID= scanner.nextInt();
                airline1.findFlight(flightID).bookPassenger(airline1.findPassenger(passengerID));
                System.out.println("passenger "+passengerID+" has been booked on flight: "+flightID+" going to "+airline1.findFlight(flightID).getDestination());
                System.out.println("here you can see all passengers on this flight:");
                airline1.findFlight(flightID).displayFlightPassengers();

                input = (scanner.nextLine());

            } else if (input.equals("5")){


                System.out.println("Which flight do you want to cancel? Select ID: ");
                Integer flightID= scanner.nextInt();
                airline1.cancelFlight(airline1.findFlight(flightID));
                airline1.displayAvailFlights();
                input = (scanner.nextLine());
            }



        }while(!input.equals("6"));

    }
}
