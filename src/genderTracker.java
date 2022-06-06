import java.util.Vector;

public class genderTracker {
    public static void main(String[] args) {
        // Initialize view
        iView view = new cmdView();

        // Initialize database
        view.displayText("Please enter your username: ");
        String filename = view.getTextInput();
        iDatabase database = new textDatabase(filename, view);
        database.populate();

        while(true) {
            switch(showMenu()) {
                case 1: // create new entry
                    view.displayText("Please enter the number corresponding to today's gender:");
                    int num = Integer.parseInt(view.getTextInput());
                    view.displayText("\r\n");
                    view.displayText("Please enter a description of today's gender:");
                    String notes = view.getTextInput();
                    gender entry = new gender(num, notes);
                    database.addEntry(entry.toString());
                    break;
                case 2: // remove an entry
                    view.displayText("Which entry would you like to remove?");
                    int index = Integer.parseInt(view.getTextInput());
                    database.removeEntry(index);
                    break;
                case 3: // modify an entry
                    view.displayText("Which entry would you like to modify?");
                    int modNum = Integer.parseInt(view.getTextInput());
                    view.displayText("Please enter the number corresponding to today's gender:");
                    int genderNum = Integer.parseInt(view.getTextInput());
                    view.displayText("\r\n");
                    view.displayText("Please enter a description of today's gender:");
                    String desc = view.getTextInput();
                    gender ent = new gender(genderNum, desc);
                    database.changeEntry(modNum, ent.toString());
                    break;
                case 4: // remove all entries
                    database.removeAllEntries();
                    break;
                case 5: // print all entries
                    Vector<String> allEntries = database.getAllEntries();
                    String temp;
                    for (int i = 0; i < allEntries.size(); i++) {
                        view.displayText((i) + ": " + allEntries.get(i));
                    }
                    break;
                case -1: // save and exit
                    database.save();
                    System.exit(0);
                    break;
                default:
                    view.displayText("Please pick an entry from the menu!");
                    break;
            }
        }
    }

    public static int showMenu() {
        iView view = new cmdView();

        view.displayText("---MENU---");
        view.displayText("1. Create new entry");
        view.displayText("2. Remove an entry");
        view.displayText("3. Modify an entry");
        view.displayText("4. Remove all entries");
        view.displayText("5. Show all entries");
        view.displayText("-1. Save and exit program");

        return Integer.parseInt(view.getTextInput());
    }
}
