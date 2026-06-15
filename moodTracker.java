import java.util.ArrayList;
import java.util.List;

public class moodTracker {

    private ArrayList<moodEntry> entries;

    public moodTracker() {
        entries = new ArrayList<>();
    }

    public void addEntry(moodEntry entry) {
        entries.add(entry);
    }

    public ArrayList<moodEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<moodEntry> loadedEntries) {
        entries = new ArrayList<>(loadedEntries);
    }
}