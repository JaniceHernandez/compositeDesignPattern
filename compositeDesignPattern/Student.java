public class Student implements UniversityComponent {

    private String name;
    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public int getStudentCount() {
        return 1;
    }

    @Override
    public double getBudget() {
        return -tuitionFee;
    }

    @Override
    public void displayDetails() {
        System.out.println("    Student  : " + name);
        System.out.println("    ID       : " + studentId);
        System.out.println("    Tuition  : " + tuitionFee + "\n");
    }
}