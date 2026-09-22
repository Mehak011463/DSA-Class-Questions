import java.util.ArrayList;

public class ArrayListOperations {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        // Adding elements
        students.add("Rahul");
        students.add("Priya");
        students.add("Aman");
        students.add("Neha");

        System.out.println("After adding: " + students);

        // Retrieving an element
        System.out.println("Student at index 1: " + students.get(1));

        // Updating an element
        students.set(2, "Riya");
        System.out.println("After updating: " + students);

        // Removing an element
        students.remove("Priya");
        System.out.println("After removing: " + students);

        // Checking an element
        System.out.println("Contains Neha? " + students.contains("Neha"));

        // Size of ArrayList
        System.out.println("Number of students: " + students.size());
    }
}