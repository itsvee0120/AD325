public class Main {
    public static void main(String[] args) {
        Patient r1 = new Patient("78", 30, "Peter");
        Patient r2 = new Patient("83", 31, "George");
        Patient r3 = new Patient("84", 32, "Anna");

        r1.next = r2;
        r2.next = r3;

        Patient r4 = new Patient("79", 30, "Peter");
        Patient r5 = new Patient("81", 31, "George");
        Patient r6 = new Patient("82", 32, "Anna");

        r4.next = r5;
        r5.next = r6;


        Patient merge = Merging.mergedList(r1, r4);
        Merging.display(merge);

    }
}