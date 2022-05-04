package DiaryProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EntryTest {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd:MM:yyyy, hh:mma");
    private String date = dateTimeFormatter.format(LocalDateTime.now());
    private  Entry entry;

    @BeforeEach
    public void setUp(){
        entry = new Entry("flex", "gbebodyeh");
    }

    @Test
    public void entryCanBeCreated(){
        assertNotNull(entry);

    }
    @Test
    public void dateCanBeAdded(){
        assertEquals(date,entry.getDate());
    }
    @Test
    public void titleCanBeCreated(){
        assertEquals("flex",entry.getTitle());
    }
    @Test
    public void bodyCanBeCreated() {
        assertEquals("gbebodyeh", entry.getBody());

    }
}
