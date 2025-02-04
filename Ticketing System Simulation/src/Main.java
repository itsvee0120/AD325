public class Main {

    public static void main(String[] args) {
        System.out.print("Generating Ticket: \n");
        TicketQueue ticketQueue = new TicketQueue();
        TicketProcess.generate(ticketQueue, 5);
        System.out.print("Processing Ticket: \n");
        TicketProcess.processing(ticketQueue);

    }
}