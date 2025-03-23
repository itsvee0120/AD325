

# Student Record Manager

A Java application to manage student records using a `TreeMap`. The program allows you to add, update, delete, and display student records. It also provides functionality to find students with a GPA higher than a specified value.

## Features

- **Add a Student Record**: Add new students with unique IDs, names, and GPA.
- **Delete a Student Record**: Remove student records by student ID.
- **Update a Student Record**: Update a student's GPA based on their ID.
- **Display All Records**: Display all student records sorted by student ID.
- **Find Students with GPA Higher Than a Specified Value**: Find and display students whose GPA is higher than a specified threshold.

## Technologies Used

- Java 8 or higher
- TreeMap for storing student records

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/itsvee0120/AD300.git
   ```

2. Navigate to the project directory:
   ```bash
   cd StudentRecordManager
   ```

3. Compile the Java files:
   ```bash
   javac Main.java Student.java StudentRecordManager.java
   ```

4. Run the program:
   ```bash
   java Main
   ```

## Usage

### Example Code

The main method in `Main.java` demonstrates how to use the application:

```java
public static void main(String[] args) {
    StudentRecordManager manager = new StudentRecordManager();

    // Add records
    System.out.println("\n Adding students:");
    // Add 5 student records
    manager.addRecord(101, "Alice", 3.5);
    manager.addRecord(102, "Bob", 2.8);
    manager.addRecord(103, "Charlie", 3.2);
    manager.addRecord(104, "David", 3.9);
    manager.addRecord(105, "Eve", 3.7);

    // Display all records
    manager.displayAllRecords();

    // Update GPA of a student
    manager.updateStudentGpa(103, 3.6);
    System.out.println("After GPA Update:");
    manager.displayAllRecords();

    // Delete a student record
    manager.deleteStudentRecord(102);
    System.out.println("After Deletion:");
    manager.displayAllRecords();

    // Find students with GPA higher than 3.0
    manager.findStudent(3.0);
}
```

### Methods

1. **addStudentRecord(int id, String name, double gpa)**
    - Adds a student record to the system.


2. **deleteStudentRecord(int id)**
    - Deletes a student record by their ID.



3. **updateStudentGpa(int id, double newGpa)**
    - Updates the GPA of a student based on their ID.



4. **displayAllRecords()**
    - Displays all student records sorted by their student ID.


5. **findStudentsWithGpaHigherThan(double gpa)**
    - Displays all students whose GPA is higher than the specified value.

## Example Output

```bash
All Student Records:
ID: 101, Name: Alice, GPA: 3.5
ID: 102, Name: Bob, GPA: 2.8
ID: 103, Name: Charlie, GPA: 3.2
ID: 104, Name: Diana, GPA: 3.9
ID: 105, Name: Eve, GPA: 2.6

Student GPA updated for ID 103; new GPA: 3.6
After GPA Update:
All Student Records:
ID: 101, Name: Alice, GPA: 3.5
ID: 102, Name: Bob, GPA: 2.8
ID: 103, Name: Charlie, GPA: 3.6
ID: 104, Name: Diana, GPA: 3.9
ID: 105, Name: Eve, GPA: 2.6

Student with ID 102 deleted.
After Deletion:
All Student Records:
ID: 101, Name: Alice, GPA: 3.5
ID: 103, Name: Charlie, GPA: 3.6
ID: 104, Name: Diana, GPA: 3.9
ID: 105, Name: Eve, GPA: 2.6

Students with GPA higher than 3.0:
ID: 101, Name: Alice, GPA: 3.5
ID: 103, Name: Charlie, GPA: 3.6
ID: 104, Name: Diana, GPA: 3.9
```

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature-name`).
3. Make changes and commit (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature/your-feature-name`).
5. Create a new Pull Request.

## License

This project is open source and available under the [MIT License](LICENSE).