import java.time.LocalDate;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {

        moodTracker tracker = new moodTracker();
        tracker.setEntries(fileManager.loadEntries());

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
                    try {
                        System.out.print("Enter the date (YYYY-MM-DD): ");
                        String inputDate = scanner.nextLine();

                        LocalDate date = LocalDate.parse(inputDate);

                        System.out.print("Enter your mood (Happy, Sad, etc.): ");
                        String mood = scanner.nextLine();

                        if (mood == null || mood.trim().isEmpty()) {
                            System.out.println("Mood cannot be empty!");
                            break;
                        }

                        System.out.print("Enter any notes: ");
                        String notes = scanner.nextLine();

                        moodEntry entry = new moodEntry(date, mood, notes);

                        tracker.addEntry(entry);
                        fileManager.saveEntries(tracker.getEntries());

                        System.out.println("Mood entry added successfully.");

                    } catch (Exception e) {
                        System.out.println("Invalid input. Please check date format (YYYY-MM-DD).");
                    }
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