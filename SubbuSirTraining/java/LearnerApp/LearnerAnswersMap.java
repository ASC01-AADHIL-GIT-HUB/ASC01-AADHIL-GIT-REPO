import java.util.*;

public class LearnerAnswersMap {
    private Map<String, List<String>> answersMap = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    // Add multiple answers for learners
    public void addAnswersFromUser() {
        System.out.print("How many learners' answers do you want to add? ");
        int numLearners = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numLearners; i++) {
            System.out.print("Enter learner name for answer " + i + ": ");
            String learnerName = scanner.nextLine();

            // Allow multiple answers for this learner
            System.out.print("How many answers for " + learnerName + "? ");
            int numAnswers = Integer.parseInt(scanner.nextLine());

            List<String> answers = new ArrayList<>();
            for (int j = 1; j <= numAnswers; j++) {
                System.out.print("Enter answer " + j + " for " + learnerName + ": ");
                answers.add(scanner.nextLine());
            }

            answersMap.put(learnerName, answers);
        }
    }

    // Display all answers for all learners
    public void displayAllAnswers() {
        System.out.println("\n---- Learner Answers ----");
        for (Map.Entry<String, List<String>> entry : answersMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("-------------------------");
    }

    // Display all answers for one learner
    public void displayAnswersForLearner(String learnerName) {
        if (answersMap.containsKey(learnerName)) {
            System.out.println(learnerName + "'s answers:");
            List<String> answers = answersMap.get(learnerName);
            for (int i = 0; i < answers.size(); i++) {
                System.out.println(" [" + i + "] " + answers.get(i));
            }
        } else {
            System.out.println(learnerName + " not found in the list ");
        }
    }

    // Display a particular answer by index
    public void displayParticularAnswer(String learnerName, int index) {
        if (answersMap.containsKey(learnerName)) {
            List<String> answers = answersMap.get(learnerName);
            if (index >= 0 && index < answers.size()) {
                System.out.println(learnerName + "'s answer [" + index + "]: " + answers.get(index));
            } else {
                System.out.println("Invalid index for " + learnerName);
            }
        } else {
            System.out.println(learnerName + " not found in the list ");
        }
    }
}
