import java.time.LocalDate;

public class moodEntry {
    private final String mood;
    private final LocalDate date;
    private final String notes;

    public moodEntry(LocalDate date, String mood, String notes) {
        this.date = date;
        this.mood = mood;
        this.notes = notes;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getMood() {
        return mood;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "moodEntry{" +
                "date=" + date +
                ", mood='" + mood + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}