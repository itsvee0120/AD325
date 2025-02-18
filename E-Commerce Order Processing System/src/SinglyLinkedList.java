public class SinglyLinkedList {
    private Order head;

    public void append(Order newOrder){
        if(head == null){
            head = newOrder;
            return;
        }
        Order temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newOrder;

    }

    public void display(){
        Order temp = head;
        while(temp != null){
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void reverse(){
        Order prev = null;
        Order current = head;
        Order temp = null;
        while(current != null){
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        head = prev;
    }
}
