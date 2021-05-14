package goodCode;

import java.util.StringTokenizer;

public class EnglishDate extends MyDate {
    public String toString(String inputDate) {
        StringTokenizer tokenizeDate = new StringTokenizer(inputDate, "/");
        int day = Integer.parseInt(tokenizeDate.nextToken());
        int month = Integer.parseInt(tokenizeDate.nextToken());
        int year = Integer.parseInt(tokenizeDate.nextToken());

        String monthNames[] = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October",
                "November", "December"};

        return (monthNames[month-1] + " " + day +  ", " + year );
    }
}
