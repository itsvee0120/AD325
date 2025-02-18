public class Merging {
    public static Patient mergedList(Patient l1, Patient l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        Patient dummy = new Patient("", 0, ""); // place holder
        Patient current = dummy;

        while(l1 != null && l2 != null){
            if(l1.ssn.compareTo(l2.ssn) <= 0){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 != null){
            current.next = l1;
        }else{
            current.next = l2;
        }

        return dummy.next;
    }

    public static void display(Patient record){
        while(record != null){
            System.out.println("SSN: " + record.ssn + ", Name: " + record.name + ", Age: " + record.age);
            record= record.next;
        }
    }
}
