package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of tickets:");
        int Total_tickets = sc.nextInt();
        System.out.println("How many round-trip tickets:");
        int Round_trip = sc.nextInt();

        Ticket ticket = new Ticket(Total_tickets,Round_trip);
    }
}
