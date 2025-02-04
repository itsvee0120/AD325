

# Ticket Processing System

This is a simple Java-based ticket processing system consisting of three classes: `Ticket`, `TicketQueue`, and `TicketProcess`. The system simulates the process of generating, serving, and managing tickets in a queue.

## Classes Overview

### `Ticket`
Represents a single ticket in the system. Each ticket has:
- A unique ticket number.
- A timestamp indicating when the ticket was generated.

#### Key Methods:
- `display()`: Returns a formatted string with the ticket number and timestamp.

### `TicketQueue`
Manages a queue of tickets. This class provides basic operations for adding and removing tickets from the queue.

#### Key Methods:
- `enqueue(Ticket ticket)`: Adds a ticket to the queue.
- `dequeue()`: Removes and returns the next ticket from the queue.
- `isEmpty()`: Checks if the queue is empty.

### `TicketProcess`
Handles the generation and processing of tickets. This class:
- Generates a specified number of tickets and adds them to the queue.
- Processes and serves tickets from the queue, simulating a delay (random sleep between 1 to 3 seconds) when serving each ticket.

#### Key Methods:
- `generate(TicketQueue queue, int count)`: Generates `count` tickets and enqueues them to the provided `TicketQueue`.
- `processing(TicketQueue queue)`: Processes and serves tickets from the queue.

## Usage

1. **Generate Tickets:**
    - Call the `generate()` method of the `TicketProcess` class, providing a `TicketQueue` object and the number of tickets to generate.

2. **Process Tickets:**
    - Call the `processing()` method of the `TicketProcess` class to start serving the generated tickets from the queue.

### Example:

```java
public class Main {
    public static void main(String[] args) {
        TicketQueue queue = new TicketQueue();
        
        // Generate 5 tickets
        TicketProcess.generate(queue, 5);

        // Process the tickets
        TicketProcess.processing(queue);
    }
}
```

## Dependencies

- Java 8 or higher for LocalDateTime and DateTimeFormatter.
- Standard Java libraries for Queue and LinkedList.

