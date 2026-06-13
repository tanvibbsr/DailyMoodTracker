import java.util.ArrayList;

public class moodTracker{
    private final ArrayList<moodEntry> entries;

    public moodTracker() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(moodEntry entry) {
        entries.add(entry);
    }

    public ArrayList<moodEntry> getEntries() {
        return entries;
    }
}