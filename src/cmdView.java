import java.util.Scanner;

public class cmdView implements iView {
    // prints txt
    public void displayText(String txt) {
        System.out.println(txt);
    }

    // returns input from command line
    public String getTextInput() {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        return txt;
    }
}
