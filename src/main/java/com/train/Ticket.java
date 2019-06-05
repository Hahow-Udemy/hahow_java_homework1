package com.train;

public class Ticket {
    int Total_tickets, Round_trip, Total;

    public Ticket(int Total_tickets, int Round_trip){
        this.Total_tickets = Total_tickets;
        this.Round_trip = Round_trip;

        Total = this.Round_trip * 1800 + (this.Total_tickets - this.Round_trip) * 1000 ;
        System.out.println("Total tickets:" + this.Total_tickets);
        System.out.println("Round-trip:" + this.Round_trip);
        System.out.println("Total: "+ Total);
    }

    public void print(){

        Total = Round_trip * 1800 + (Total_tickets - Round_trip) * 1000 ;
        System.out.println("Total tickets:" + Total_tickets);
        System.out.println("Round-trip:" + Round_trip);
        System.out.println("Total: "+ Total);

    }

}
