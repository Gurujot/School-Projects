package goodCode;

import java.util.StringTokenizer;

public class FrenchDate extends MyDate {
    public String toString(String inputDate) {
        StringTokenizer tokenizeDate = new StringTokenizer(inputDate, "/");
        int day = Integer.parseInt(tokenizeDate.nextToken());
        int month = Integer.parseInt(tokenizeDate.nextToken());
        int year = Integer.parseInt(tokenizeDate.nextToken());

        String monthNames[] = {"janvier", "fevrier", "mars",
                "avril", "mai", "juin", "juillet", "aout",
                "septembre", "octobre", "novembre", "decembre"};

        return (monthNames[month-1] + " " + day +  ", " + year );
    }
}
