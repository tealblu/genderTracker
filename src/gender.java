import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class gender implements iGender {
    // DATA:
    int num;
    String hex;
    String notes;
    LocalDateTime creationDate;

    // CONSTRUCTOR:
    public gender(int num, String notes) {
        this.num = num;
        this.notes = notes;

        // SWITCH ON NUM TO ASSIGN HEXES
        hex = "-1";

        creationDate = LocalDateTime.now();
    }

    // METHODS:
    public String toString() {
        // Get date as string
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDateTime = creationDate.format(dateTimeFormatter);

        // FORMAT: yyyy-MM-dd HH:mm [num] [hex code] [description]
        return formattedDateTime + ' ' + String.valueOf(num) + ' ' + hex + ' ' + notes;
    }
}
