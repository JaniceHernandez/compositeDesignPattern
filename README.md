# Composite Design Pattern – University Organizational Structure

## Problem Overview

New Era University consists of multiple organizational units such as Colleges, Departments, Teachers, and Students. These units form a hierarchical structure where some elements contain other elements.

For example:

* A **College** can contain multiple **Departments**, **Teachers**, and **Students**.
* A **Department** can contain **Teachers** and **Students**.
* **Teachers** and **Students** are individual entities.

The system must support the following operations:

* **Model hierarchical relationships** between organizational units.
* **Calculate the total number of students** in a college, including those in its departments.
* **Display details** of the organizational structure clearly.
* **Calculate the total budget** of a college.

Budget calculation rules:

* Teacher budget = **salary**
* Student budget = **negative tuition fee**
* Department budget = **sum of teachers' salaries – sum of students' tuition**
* College budget = **sum of all its departments, teachers, and students**

To manage this hierarchical structure efficiently, the **Composite Design Pattern** is used. This pattern allows both individual objects and groups of objects to be treated uniformly.

---

## UML Class Diagram
<img width="1916" height="1596" alt="compositeDesignPattern" src="https://github.com/user-attachments/assets/99029e55-f978-4029-b260-63c9acef4141" />

---

## System Components

### 1. UniversityComponent (Interface)

Defines the common operations used by all elements in the system.

Methods:

* `displayDetails()` – Displays information about the component.
* `getStudentCount()` – Returns the number of students.
* `getBudget()` – Calculates the budget contribution of the component.

---

### 2. Student (Leaf)

Represents an individual student.

Attributes:

* `name`
* `studentId`
* `tuitionFee`

Responsibilities:

* Returns **1 student**
* Returns **negative tuition fee** as budget
* Displays student information

---

### 3. Teacher (Leaf)

Represents a teacher.

Attributes:

* `name`
* `subject`
* `salary`

Responsibilities:

* Returns **0 students**
* Returns **salary** as budget
* Displays teacher information

---

### 4. Department (Composite)

Represents a department that can contain teachers and students.

Responsibilities:

* Maintains a **list of components**
* Aggregates student counts
* Aggregates budget values
* Displays department details

---

### 5. College (Composite)

Represents a college that may contain departments, teachers, students, or other colleges.

Responsibilities:

* Manages organizational hierarchy
* Calculates total students in the college
* Calculates the overall budget
* Displays the full structure of the college

---

6. Client Class (UniversityClient)

The entry point of the system.

Responsibilities:

Creates Students, Teachers, Departments, and Colleges
Builds the hierarchical structure
Calls displayDetails()
Prints total student count
Prints total budget

---

## Conclusion

The **Composite Design Pattern** allows the university system to represent hierarchical relationships between organizational units while treating individual and grouped elements uniformly. This simplifies operations such as displaying details, counting students, and calculating budgets across complex organizational structures.
