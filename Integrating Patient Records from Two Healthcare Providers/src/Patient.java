public class Patient {
    String ssn;
    int age;
    String name;
    Patient next;

    public Patient(String ssn, int age, String name){
        this.ssn = ssn;
        this.age = age;
        this.name = name;
        this.next = null;
    }
}
