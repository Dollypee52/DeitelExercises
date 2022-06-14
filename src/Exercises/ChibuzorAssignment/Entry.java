package Exercises.ChibuzorAssignment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private String date;
    private String title;
    private String body;

    public Entry(String title, String body ){
        this.title = title;
        this.body = body;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd:MM:yyyy, hh:mma");
        date = dateTimeFormatter.format(LocalDateTime.now());
    }

    public String getDate() {
        return date;
    }
    public String getTitle() {
        return title;
    }
    public String getBody() {
        return body;
    }

    @Override
    public String toString(){
       return String.format("""
               Date: %s
               Title: %s

               Body: %s""",getDate(),getTitle(),getBody());
    }
}
