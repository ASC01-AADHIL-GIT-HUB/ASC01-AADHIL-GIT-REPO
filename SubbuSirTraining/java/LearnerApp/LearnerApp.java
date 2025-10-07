import java.util.Scanner;

public class LearnerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Working with Learner Names
        LearnerArrayData learnerData = new LearnerArrayData();
        learnerData.addLearnersFromUser();
        learnerData.printLearnerNames();

        System.out.print("\nSearch for a learner: ");
        String searchName = scanner.nextLine();
        learnerData.searchLearner(searchName);

        // Working with Learner Answers (multiple answers per learner)
        LearnerAnswersMap learnerAnswers = new LearnerAnswersMap();
        learnerAnswers.addAnswersFromUser();
        learnerAnswers.displayAllAnswers();

        // Show all answers for a learner
        System.out.print("\nEnter a learner's name to see their answers: ");
        String answerSearch = scanner.nextLine();
        learnerAnswers.displayAnswersForLearner(answerSearch);

        // Show one particular answer
        System.out.print("\nEnter a learner's name to see a particular answer: ");
        String learnerName = scanner.nextLine();
        System.out.print("Enter answer index (0-based): ");
        int index = Integer.parseInt(scanner.nextLine());
        learnerAnswers.displayParticularAnswer(learnerName, index);

        scanner.close();
    }
}
