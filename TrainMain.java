package com.train.booking;
import java.util.LinkedList;
import java.time.LocalDate;
import java.util.List;

public class TrainMain {
public static void main(String args[]) {
	
	System.out.println("Now Searching for trains....");
	TrainService.searchTrainsBetweenStations("Hyderabad","Banglore", LocalDate.now(), 10);
	
	BankAccount b1 = new BankAccount();
	b1.setActNumber(999);
	b1.setActBalance(10000);
	
	Passenger p1 = new Passenger(10, "  Harshit       ", 30, b1);
	Passenger p2 = new Passenger(20, "  Sonali        ", 32,b1);
	Passenger p3 = new Passenger(30, "  Sushil        ", 33,b1);
	
	
	List<Passenger> passengerList = new LinkedList<>();
	
	passengerList.add(p1);
	passengerList.add(p2);
	passengerList.add(p3);
	
	int initialBalance = b1.getActBalance();
	System.out.println("Now Booking tickets for 3 passengers in train number 101....");
	
	TrainService.bookTickets(101, passengerList);
	System.out.println("Now Printing the ticket details....");
	TicketService.showTicketDetails(1);
	System.out.println("\n\n");
	TrainService.searchTrainsBetweenStations("Hyderabad", "Banglore", LocalDate.now(), 10);
	int balanceAfterBookingTickets = b1.getActBalance();	
	System.out.println("Initial balance = " + initialBalance);
	System.out.println("Balance after booking =" + balanceAfterBookingTickets);
	
}
}
