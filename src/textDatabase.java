import java.io.*;
import java.util.Vector;

public class textDatabase implements iDatabase {
    // DATA:
    private String filename; // the name of the text file
    private iView view; // the view to use
    private Vector<String> database; // the database itself

    // CONSTRUCTOR:
    public textDatabase(String fName, iView newView) {
        this.view = newView;
        this.filename = fName;
        database = new Vector<String>();
    }

    // METHODS:
    public void populate() {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            for(String line; (line = br.readLine()) != null; ) { database.add(line); }
        } catch (IOException ignored) { }
    }

    public void save() {
        // clear contents of file
        try {
            new FileWriter(filename, false).close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // write contents of vector to file
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filename));
            for(String line : database) { writer.write(line + "\r\n"); }
        } catch (IOException e) { e.printStackTrace(); } finally {
            try {
                if (writer != null) { writer.close(); }
            } catch (IOException e) { e.printStackTrace(); }
        }
    }

    public void addEntry(String entry) {
        database.add(entry);
    }

    public void removeEntry(int entryNum) {
        database.remove(entryNum);
    }

    public void changeEntry(int entryNum, String entry) {
        database.set(entryNum, entry);
    }

    // IMPLEMENT PATTERN MATCHING LATER
    public int getEntryNum(String entry) {
        return database.indexOf(entry);
    }

    public String getEntry(int entryNum) {
        return database.get(entryNum);
    }

    public Vector<String> getAllEntries() {
        return database;
    }

    public void removeAllEntries() {
        database.clear();
    }
}