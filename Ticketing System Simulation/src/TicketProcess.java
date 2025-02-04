import java.util.Random;

public class TicketProcess {
    public static void generate(TicketQueue queue, int count){
        for(int i = 0; i < count; i++){
            Ticket ticket = new Ticket();
            queue.enqueue(ticket);
            System.out.println("Generated: " + ticket.display());
        }
    }

    public static void processing(TicketQueue queue){
        Random random = new Random();
        while(!queue.isEmpty()){
            Ticket ticket = queue.dequeue();
            if(ticket != null){
                System.out.println("Serving ticket " + ticket.display());
                try{
                    Thread.sleep(random.nextInt(2000) + 1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

            }
        }
            System.out.println("All Tickets Have Been Served!");
        }
    }


