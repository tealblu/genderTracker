import java.util.Vector;

public interface iDatabase {
    /**
     * Populates the database vector with contents of a file
     *
     * @pre file exists
     *
     * @post database vector has contents of file
     */
    void populateDatabase();

    /**
     * Saves the database vector into a file\
     *
     * @pre database vector exists
     *
     * @post file has contents of database vector
     */
    void saveDatabase();

    /**
     * Adds an entry to the database
     *
     * @param entry the string to add to the database
     *
     * @pre database vector exists
     *
     * @post database = #dastabase + entry
     */
    void addEntry(String entry);

    /**
     * Removes an entry from the database
     *
     * @param entryNum the number of the entry to remove
     *
     * @pre the database exists
     *
     * @post database = #database - entry@entryNum
     */
    void removeEntry(int entryNum);

    /**
     * Changes an entry in the database
     *
     * @param entryNum the number of the entry to change
     * @param entry the string to add
     *
     * @pre the database exists
     *
     * @post database = #database with changes implemented
     */
    void changeEntry(int entryNum, String entry);

    /**
     * Searches a vector and returns index of specified object
     *
     * @param entry the string to search for
     *
     * @return the entry intex
     *
     * @pre the database exists
     *
     * @post database = #database
     */
    int getEntryNum(String entry);
}
