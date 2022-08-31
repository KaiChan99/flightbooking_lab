package airline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
Flight flight1 = new Flight("Madrid",1);
Flight flight2=new Flight("London",2);
Passenger passenger1 = new Passenger("Bob", "Bob@gmail.com", 1);

Airline airline1 = new Airline("Ryanair");
Airline airline2 = new Airline("EasyJet");

// testing adding and cancelling flights
        airline1.addNewFlight(flight1);
        airline1.addNewFlight(flight2);
        System.out.println(airline1.getAllFlightsCount());
//airline1.cancelFlight(flight1);
        System.out.println(airline1.displayAvailFlights());


// testing adding passengers to flight
//flight2.bookPassenger(passenger1);
//flight2.displayPassengers();

// testing adding flight booking to a passenger
flight1.bookPassenger(passenger1);
passenger1.addFlightBooking(flight1);
        System.out.println(passenger1.getFlightBooking());
*/



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
        airline1.addNewFlight(flight4);
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

                System.out.println("great! we have added a passenger: " +passenger1.getName()+" ID: "+passenger1.getId());
                input = (scanner.nextLine());

            } else if (input.equals("3")) {
                airline1.displayAvailFlights();



            } else if (input.equals("4")) {
             Flight flight0 = listOfFlight.get(0);
             Passenger passenger0 = listOfPassenger.get(0);

             flight0.bookPassenger(passenger0);
                flight0.displayPassengers();
                System.out.println(flight0.getDestination());
                System.out.println(passenger0.getId());

            } else if (input.equals("5")){
                Flight flight0 = listOfFlight.get(0);
                airline1.cancelFlight(flight0);
                System.out.println(airline1.displayAvailFlights());

            }



        }while(!input.equals("6"));

    }
}
//                    for(Object obj : listOfObject){
//                        if(obj instanceof Flight) {              // So it checks for flights in the object list if true - print flights
//                            Flight flight1 = (Flight) obj;
//                            System.out.println(flight1.toString());
//            }
//        }


//        Flight flight1 = new Flight();

//        System.out.println("Hi! Welcome to the VFK app. Please type: Add a flight");
//
//        String answer1 = scan.nextLine();

//        if (answer1.equals("Add a flight")){
//            System.out.println("Where is your destination?");
//            String destination = scan.nextLine();
//            flight1.setDestination(destination);
//            System.out.println("What is the flight ID?");
//            int flightID= scan.nextInt();
//            flight1.setFlightID(flightID);
//            System.out.println(flight1.getDestination());
//            System.out.println(flight1.getFlightID());
//            airline1.addNewFlight(flight1);
//            System.out.println(airline1.displayAvailFlights());
//
//        }
//          else if (answer1.equals("Display all flights")){
//              airline1.displayAvailFlights();

//            }
//          else if (answer1.equals("Add a passenger")){
//                System.out.println("What is passengers first name?");
//            }
//          else {
//                System.out.println("Please correctly type out one of the options given above.");
