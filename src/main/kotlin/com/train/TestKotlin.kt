package com.train

import java.util.*

fun main(args: Array<String>) {
    var sc = Scanner (System.`in`);
    print("Please enter number of tickets:");
    var Total_tickets = sc.nextInt();
    print("How many round-trip tickets:")
    var Round_trip = sc.nextInt();
    val ti = Ticket(Total_tickets,Round_trip);
    ti.print();
}

class Ticket(var Total_tickets : Int, var Round_trip : Int){

    fun print(){
        val Total = 1800 *  Round_trip + (Total_tickets-Round_trip) * 1000;
        print("Total tickets:" + Total_tickets);
        print("Round_trip:" + Round_trip);
        print("Total:" + Total);
    }
}
