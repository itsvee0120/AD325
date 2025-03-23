public class Main {

    public static void main(String[] args) {
        StudentRecordManager manager = new StudentRecordManager();

        System.out.println("\n Adding students:");
        // Add 5 student records
        manager.addRecord(101, "Alice", 3.5);
        manager.addRecord(102, "Bob", 2.8);
        manager.addRecord(103, "Charlie", 3.2);
        manager.addRecord(104, "David", 3.9);
        manager.addRecord(105, "Eve", 3.7);

        System.out.println();
        // Display all records
        manager.displayAllRecords();
        System.out.println();
        // Update GPA of a student
        manager.updateStudentGPA(102, 3.6);
        System.out.println();
        // Display all records again after GPA update
        manager.displayAllRecords();
        System.out.println();
        // Delete a student record
        manager.removeRecord(103);
        System.out.println();
        // Display all records again after deletion
        manager.displayAllRecords();
        System.out.println();
        // Find students with GPA higher than 3.0
        manager.findStudent(3.7);
        System.out.println();
        // Adding a student with duplicate ID (101)
        manager.addRecord(101, "Alice Smith", 3.8); // This should update Alice's record
        manager.displayAllRecords();
    }
}
