package com.practice.flightbookingsystem;
import java.util.ArrayList;
class Flight {
private String flightNumber;
private int totalSeat;
private int bookedSeat;
Flight(String flightNumber,int totalSeat,int bookedSeat) {
	this.flightNumber=flightNumber;
	this.totalSeat=totalSeat;
	this.bookedSeat=bookedSeat;
}
public String getflightNumber() {
	return flightNumber;
}
public int getAvailableSeat() {
	return totalSeat-bookedSeat;
}
public int getbookedSeat() {
	return bookedSeat;
}
public void bookSeat(int seat) {
	if(seat>0 && bookedSeat+seat<=totalSeat) {
		bookedSeat+=seat;
		System.out.println(seat+ "successfully booked");
	} else {
		System.out.println("Bookingn Failed. Not enough seats available");
	}
}
public void cancelSeat(int seat) {
	if(seat>0 && seat<= bookedSeat) {
		bookedSeat-=seat;
		System.out.println(seat+ "Seats canceles successfully.");
	} else {
		System.out.println("Cancellation failed. Invalid number of seat.");
	}
}
public void displayStatus() {
	System.out.println("Flight Number "+flightNumber+" || TotalSeat: "+totalSeat+" |Booked: "+bookedSeat+" Available "+getAvailableSeat());
}
	
}

public class FlightBookingSystem {
	public static void main(String[] args) {
		Flight f = new Flight("FO123",40,5);
		f.displayStatus();
	}
}
