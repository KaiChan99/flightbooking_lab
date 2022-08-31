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

        List<Object> listOfObject = new ArrayList<>();
        do {
            System.out.println("Computer Menu");
            System.out.println("1. Add a new Flight");
            System.out.println("2. Add a new Passenger");
            System.out.println("3. Display all available flights");
            System.out.println("4. Quit");

            System.out.print("Please enter either 1 to 4: ");
            input = (scanner.nextLine());
            if (input.equals("1")) {
                Flight flight1 = new Flight();
                System.out.println("Where is your destination?");
                String destination = scanner.nextLine();
                flight1.setDestination(destination);

                System.out.println("What is the flight ID?");
                int flightID = scanner.nextInt();
                flight1.setFlightID(flightID);

                System.out.println(flight1.getDestination());
                System.out.println(flight1.getFlightID());
                airline1.addNewFlight(flight1);
                listOfObject.add(flight1);
            } else if (input.equals("2")) {
                Passenger passenger1 = new Passenger();
                listOfObject.add(passenger1);
            } else if (input.equals("3")) {
                System.out.println(airline1.displayAvailFlights());
//                    for(Object obj : listOfObject){
//                        if(obj instanceof Flight) {              // So it checks for flights in the object list if true - print flights
//                            Flight flight1 = (Flight) obj;
//                            System.out.println(flight1.toString());
            }
//        }
//            }
        }while(!input.equals("4"));

    }



}

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






        

// end of code

// hello changes
