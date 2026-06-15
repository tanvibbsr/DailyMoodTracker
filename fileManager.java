import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class fileManager {
    private static final String FILE_NAME = "data\\moods.csv";

    // Methods for saving and loading mood entries from a file
    public static void saveEntries(List<moodEntry> entries) {
    
    File file = new File(FILE_NAME);
    file.getParentFile().mkdirs();

    try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {

        for (moodEntry entry : entries) {
            writer.println(
                    entry.getDate() + ","
                    + entry.getMood() + ","
                    + entry.getNotes());
        }

    } catch (IOException e) {
        System.err.println("Error saving entries: " + e.getMessage());
    }
}

    // Load entries from file
    public static List<moodEntry> loadEntries() {
        List<moodEntry> entries = new ArrayList<>();
         File file = new File(FILE_NAME);

         if(!file.exists()) {
             return entries;
         }
         try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
             String line;

             while ((line = reader.readLine()) != null) {
                 String[] parts = line.split(",");
                 if (parts.length == 3) {
                     LocalDate date = LocalDate.parse(parts[0]);
                     String mood = parts[1];
                     String notes = parts[2];
                     entries.add(new moodEntry(date, mood, notes));
                 }
             }
         } catch (IOException e) {
             System.err.println("Error loading entries: " + e.getMessage());
         }
        return entries;
    }
}
