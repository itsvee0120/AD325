import java.util.TreeMap;

public class StudentRecordManager {
    private TreeMap<Integer, Student> studentRecords;

    public StudentRecordManager() {
        studentRecords = new TreeMap<>();
    }

    public void addRecord(int id, String name, double gpa) {
        if (studentRecords.containsKey(id)) {
            System.out.println("ID already exists");
            Student student = studentRecords.get(id);
            student.setName(name);
            student.setGPA(gpa);
        } else {
            studentRecords.put(id, new Student(id, name, gpa));
            System.out.println("Student with ID: " + id + " added");
        }
    }

    public void removeRecord(int id) {
        if (studentRecords.remove(id) != null) {
            System.out.println("Student with ID: " + id + " removed");
        } else {
            System.out.println("ID does not exist");
        }
    }

    public void updateStudentGPA(int id, double newGpa) {
        if (newGpa < 0 || newGpa > 4.0) {
            System.out.println("GPA must be between 0 and 4");
            return;
        }
        Student student = studentRecords.get(id);
        if (student != null) {
            student.setGPA(newGpa);
            System.out.println("Student GPA updated, new GPA is" + newGpa);
        } else {
            System.out.println("ID does not exist");
        }
    }

    public void displayAllRecords() {
        if (studentRecords.isEmpty()) {
            System.out.println("No record found");

        } else {
            System.out.println("Displaying all records");
            studentRecords.values().forEach(System.out::println);
            }

    }

    public void findStudent(double gpa) {
        System.out.println("Student with GPA higher than " + gpa + ":");
        boolean found = false;
        for (Student student : studentRecords.values()) {
            if (student.getGPA() > gpa) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No student found");
        }

    }
}