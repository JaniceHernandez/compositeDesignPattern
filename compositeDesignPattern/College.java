import java.util.ArrayList;
import java.util.List;

public class College implements UniversityComponent {

    private String name;
    private List<UniversityComponent> components = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void add(UniversityComponent component) {
        components.add(component);
    }

    public void remove(UniversityComponent component) {
        components.remove(component);
    }

    @Override
    public int getStudentCount() {
        int total = 0;
        for (UniversityComponent c : components) {
            total += c.getStudentCount();
        }
        return total;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (UniversityComponent c : components) {
            total += c.getBudget();
        }
        return total;
    }

    @Override
    public void displayDetails() {
        System.out.println("College: " + name);
        System.out.println("----------------------------------------\n");

    for (UniversityComponent c : components) {
        c.displayDetails();
    }
}
}