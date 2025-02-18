
public class HealthRecord {
    public boolean isHealthRecordSymmetric (ListNode head){

        //Floyd's Algo determine the middle of the Linked List
        ListNode slow = head;
       ListNode fast = head;
       while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }

       ListNode secondHalf = reversed(slow);

       ListNode firstHalf = head;
       ListNode secondHalfCopy = secondHalf;
       boolean isSymmetric = true;

       while(secondHalf != null){
           if(firstHalf.val != secondHalf.val){
               isSymmetric = false;
               break;
           }
           firstHalf = firstHalf.next;
           secondHalf = secondHalf.next;
       }

       reversed(secondHalfCopy);
       return isSymmetric;
    }

    public ListNode reversed(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
       return prev;
    }
}
