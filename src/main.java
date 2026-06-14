import java.time.LocalDate;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {

        moodTracker tracker = new moodTracker();

        int userChoice;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("\n----------Mood Tracker----------");
                System.out.println("1. Add Mood Entry");
                System.out.println("2. View All Entries");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                userChoice = scanner.nextInt();
                scanner.nextLine(); // Create newline

            switch (userChoice) {
                case 1 -> {
                    // Add mood entry
                    System.out.print("Enter the date (YYYY-MM-DD): ");
                    LocalDate date = LocalDate.parse(scanner.nextLine());
                    System.out.print("Enter your mood(Happy, Sad, etc.): ");
                    String mood = scanner.nextLine();
                    System.out.print("Enter any notes: ");
                    String notes = scanner.nextLine();
                    moodEntry entry = new moodEntry(date, mood, notes);
                    tracker.addEntry(entry);
                    System.out.println("Mood entry added successfully.");
                }
                case 2 -> {
                    System.out.println("\n----------All Entries----------");
                    if (tracker.getEntries().isEmpty()) {
                        System.out.println("No entries found.");
                    } else {
                        for (moodEntry e : tracker.getEntries()) {
                            System.out.println(e);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Exiting...");
                }
                default -> {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        } while (userChoice != 3);
        scanner.close();
    }
}

}