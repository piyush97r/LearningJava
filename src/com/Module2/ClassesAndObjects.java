package com.Module2;

public class ClassesAndObjects {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket(10);
        int totalPrice = ticket.calculateCost(100);
        System.out.println(totalPrice);
    }
}

class MovieTicket {
    public int singleTicketCost; //Should be defined as private as this allows other users to change the singleTicketCost to 0 and allowing them to book multiple tickets at 0

    public MovieTicket(int singleTicketCost) {
        this.singleTicketCost = singleTicketCost;
    }

    public int calculateCost(int quantity) {
        return quantity * singleTicketCost;
    }
}
