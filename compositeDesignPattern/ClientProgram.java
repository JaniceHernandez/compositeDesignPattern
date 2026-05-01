public class ClientProgram {

    public static void main(String[] args) {

        // Students
        Student student1 = new Student("Harry Potter", "23-12345-678", 25500);
        Student student2 = new Student("Hermione Granger", "24-12345-678", 30100);
        Student student3 = new Student("Ron Weasley", "25-12345-678", 19000);
        Student student4 = new Student("Draco Malfoy", "26-12345-678", 21500);
        Student student5 = new Student("Luna Lovegood", "26-12345-678", 15000);

        // Teachers
        Teacher teacher1 = new Teacher("Prof. Albus Dumbledore", "Introduction to Programming", 50300);
        Teacher teacher2 = new Teacher("Prof. Minerva McGonagall", "Information Management", 35500);
        Teacher teacher3 = new Teacher("Prof. Severus Snape", "Professional Elective", 30000);

        // Departments
        Department cs = new Department("Computer Science");
        cs.add(student1);
        cs.add(student2);
        cs.add(teacher1);

        Department it = new Department("Information Technology");
        it.add(student3);
        it.add(teacher2);

        Department ce = new Department("Civil Engineering");
        ce.add(student4);
        ce.add(student5);
        ce.add(teacher3);
        ce.add(teacher2);

        // College
        College cics = new College("College of Informatics and Computing Studies");
        cics.add(cs);
        cics.add(it);

        College cea = new College("College of Engineering and Architecture");
        cea.add(ce);

        // Header
        System.out.println("=====================================================");
        System.out.println("        NEW ERA UNIVERSITY ORGANIZATIONAL UNITS");
        System.out.println("=====================================================\n");

        // Display structure
        cics.displayDetails();
        cea.displayDetails();

        // Summary
        System.out.println("\n========================================");
        System.out.println("SUMMARY REPORT");
        System.out.println("========================================\n");

        // Summary for CICS
        System.out.println("Total Students in College of Informatics and Computing Studies : "
                + cics.getStudentCount());

        System.out.printf("Total Budget for College of Engineering  : %,.0f\n",
                cics.getBudget());

        System.out.println("\n========================================\n");

        // Summary for CEA
        System.out.println("Total Students in College of Engineering and Architecture : "
                + cea.getStudentCount());

        System.out.printf("Total Budget for College of Engineering and Architecture  : %,.0f\n",
                cea.getBudget());

        System.out.println("\n========================================\n");
    }
}