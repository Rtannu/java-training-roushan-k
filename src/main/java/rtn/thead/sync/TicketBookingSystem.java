package rtn.thead.sync;

public class TicketBookingSystem {
    int totalTickets;
    int bookedTickets;

    TicketBookingSystem(int totalTickets){
        this.totalTickets=totalTickets;
        this.bookedTickets=0;
    }

    public synchronized void book(){
        if(totalTickets<=0){
            throw new RuntimeException("Tickets are not available");
        }
        totalTickets-=1;
        bookedTickets+=1;
        System.out.println("Thread :: "+Thread.currentThread().getId() +" Booked Ticket :: "+bookedTickets +" and Total Available Tickets :: "+totalTickets);
    }
}
