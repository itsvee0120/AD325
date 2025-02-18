public class Main {
    public static void main(String[] args) {
        SinglyLinkedList orderList = new SinglyLinkedList();
        //Adding orders to the linked list.
        orderList.append(new Order(1, "Jake", "Hamburger"));
        orderList.append(new Order(2, "Ana", "Coke"));
        orderList.append(new Order(3, "Tom", "Sausage"));

       // Displaying the list of orders in the order they were added.
        System.out.println("Order List: ");
        orderList.display();

       // Reversing the linked list.
        System.out.println("Order List Reversed: ");
        orderList.reverse();
       // Displaying the list of orders after reversal to ensure the most recent order is processed first.
        orderList.display();

    }
}