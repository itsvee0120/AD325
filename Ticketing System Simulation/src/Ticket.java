import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;

public class Ticket {
 private static int counter = 1;
 private int ticketNumber;
 private LocalDateTime timestamp;
 private static final DateTimeFormatter FORMATTER =
         DateTimeFormatter.ofPattern("hh:mm a, MMM dd yyyy");

 public Ticket(){
     this.ticketNumber = counter++;
     this.timestamp = LocalDateTime.now();
 }

 public String display(){
     return(" Ticket #" + ticketNumber + " - Issue at: " + timestamp.format(FORMATTER) );
 }

}
 class TicketQueue{
    private Queue<Ticket> queue = new LinkedList<>();

    public void enqueue(Ticket ticket){
        queue.offer(ticket);
    }

    public Ticket dequeue(){
        return queue.poll();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

}