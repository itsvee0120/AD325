public class Main {
    public static void main(String[] args) {
        HealthRecord analyzer = new HealthRecord();

        // test 1: Symmetric list
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(2);
        l1.next.next.next.next = new ListNode(1);
        System.out.println(analyzer.isHealthRecordSymmetric(l1));

        // test 2: Non-symmetric
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(3);
        l2.next.next.next = new ListNode(4);
        l2.next.next.next.next = new ListNode(5);
        System.out.println(analyzer.isHealthRecordSymmetric(l2));

    }
}