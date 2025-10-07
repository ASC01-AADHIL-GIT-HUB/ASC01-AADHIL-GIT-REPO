import java.util.ArrayList;
import java.util.Scanner;

public class LearnerArrayData {
    private ArrayList<String> learnerNames = new ArrayList<>();

    // Add learners dynamically using Scanner
    public void addLearnersFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many learners do you want to add? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter learner name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            learnerNames.add(name);
        }
    }

    // Print all learner names
    public void printLearnerNames() {
        System.out.println("\n---- Learner List ----");
        for (int i = 0; i < learnerNames.size(); i++) {
            System.out.println((i + 1) + ". " + learnerNames.get(i));
        }
        System.out.println("----------------------");
        System.out.println("Total learners: " + learnerNames.size());
    }

    // Search learner by name
    public void searchLearner(String name) {
        if (learnerNames.contains(name)) {
            System.out.println(name + " is in the learner list ✅");
        } else {
            System.out.println(name + " is NOT in the learner list ❌");
        }
    }

    // Getter (so we can access names in LearnerApp if needed)
    public ArrayList<String> getLearnerNames() {
        return learnerNames;
    }
}
