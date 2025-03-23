# StudentRecordManager

## Overview
`StudentRecordManager` is a Java class that manages student records using a `TreeMap`. It allows adding, removing, updating, and displaying student records efficiently. The implementation ensures students are stored in a sorted order based on their unique IDs.

## Features
- Add a student record with ID, name, and GPA.
- Remove a student record by ID.
- Update a student's GPA.
- Display all student records in sorted order.
- Find students with a GPA higher than a given value.

## Time Complexity Analysis
| Operation            | Method Name          | Time Complexity |
|----------------------|----------------------|----------------|
| Add Record          | `addRecord(int, String, double)` | O(log n) |
| Remove Record       | `removeRecord(int)` | O(log n) |
| Update Student GPA  | `updateStudentGPA(int, double)` | O(log n) |
| Display All Records | `displayAllRecords()` | O(n) |
| Find Students       | `findStudent(double)` | O(n) |

### Explanation:
- The `TreeMap` data structure is based on a Red-Black tree, where insertions, deletions, and updates take **O(log n)** time.
- Iterating over all student records (e.g., in `displayAllRecords()` and `findStudent()`) takes **O(n)** time.

## Space Complexity Analysis
- The `TreeMap` requires **O(n)** space to store `n` student records.
- Each student record consists of an `Integer` (ID) and a `Student` object containing a `String` (name) and a `double` (GPA), all requiring **O(n)** space in total.

## Summary
- The class provides efficient operations using `TreeMap`, ensuring sorted order.
- The worst-case scenario for `addRecord`, `removeRecord`, and `updateStudentGPA` is **O(log n)**.
- Displaying or searching students based on GPA requires **O(n)** time.
- The overall space complexity remains **O(n)** due to storing `n` student records.

