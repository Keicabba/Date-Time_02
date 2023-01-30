package it.figuccia;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Start {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        //DayNumber FullMonthName Last2DigitsOfYearNumber HourTime MinuteTime
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yy hh mm");
        String stringDateTime = date.format(dateTimeFormatter).replaceAll("(?<![a-z])\\s+(?![a-z])",":");
        System.out.println(stringDateTime);
        //using ZonedDateTime, the current date and time in ISO Zoned Date Time format
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(date.atZone(ZoneId.from(zonedDateTime)));

    }
}
