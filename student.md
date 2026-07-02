# Student Grade Management System

## 📌 Problem Description
The **Student Grade Management System** is designed to manage student records, courses, and grades efficiently.  
It should allow:
- Adding and managing student details
- Assigning courses and instructors
- Recording grades for each student per course
- Calculating averages, GPA, and ranks
- Handling pass/fail decisions
- Storing and retrieving data (e.g., from files or databases)

This system demonstrates **Java OOP concepts** (encapsulation, abstraction, polymorphism, interfaces), **collections**, **exception handling**, and **file handling**.

---

## 🏫 Core Entities & Variables

### 1. Student
- `studentId` *(int/String)* → Unique identifier for each student
- `name` *(String)* → Student’s full name
- `age` *(int)* → Student’s age
- `email` *(String)* → Contact information
- `grades` *(List<Double> or Map<String, Double>)* → Grades per subject

### 2. Course
- `courseId` *(String)* → Unique identifier for the course
- `courseName` *(String)* → Name of the subject/course
- `credits` *(int)* → Credit hours for the course
- `instructor` *(String)* → Instructor’s name

### 3. Grade
- `marksObtained` *(double)* → Numeric score
- `gradeLetter` *(String)* → Letter grade (A, B, C, etc.)
- `subject` *(String)* → Course name
- `semester` *(int/String)* → Semester information

### 4. Management System
- `students` *(List<Student> or Map<Integer, Student>)* → Collection of all students
- `courses` *(List<Course>)* → Collection of all courses
- `studentGrades` *(Map<Student, List<Grade>>)* → Mapping of students to their grades
- `averageGrade` *(double)* → Computed average score
- `highestGrade` *(double)* → Highest score in the system
- `lowestGrade` *(double)* → Lowest score in the system

---

## ⚙️ Supporting Variables
- `isPassed` *(boolean)* → Pass/fail flag
- `gradeScale` *(Map<Double, String>)* → Mapping numeric scores to grade letters
- `attendance` *(double)* → Attendance percentage
- `rank` *(int)* → Student’s rank in class
- `gpa` *(double)* → Grade Point Average

---

## 🚀 Learning Objectives
By implementing this system, you will practice:
- **Encapsulation** → Private variables with getters/setters
- **Abstraction & Interfaces** → Defining grading rules
- **Polymorphism** → Different grading strategies
- **Collections & Generics** → Managing student/course lists
- **Exception Handling** → Handling invalid inputs
- **File Handling** → Saving and loading student records
- **Multithreading** → Simulating multiple students being graded simultaneously

---
