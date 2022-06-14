package DiaryProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    private Diary diary;
    private String date;

    @BeforeEach

    public void setUp() {
        diary = new Diary("DolapoDiary", "funmi");
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd:MM:yyyy, hh:mma");
        date = dateTimeFormatter.format(LocalDateTime.now());
    }

    @Test
    public void diaryCanBeCreatedTest() {

        assertNotNull(diary);
    }

    @Test
    public void nameCanBeAddedTest() {
        assertEquals("DolapoDiary", diary.getName());

    }

    @Test
    public void passwordCanBeSet() {
        diary.setPassword("funmi");
        assertTrue(diary.validatePassword("funmi"));
    }

    @Test
    public void entryCanBeCreatedTest() {
        diary.addEntry("bigie", "a big guy");
        assertEquals(1, diary.getNumberOfEntries());
    }

    @Test
    public void moreEntryCanBeCreatedTest() {
        diary.addEntry("boss", "she is a good boss");
        diary.addEntry("pastor", "he preaches well");
        diary.addEntry("company", "the company is a nice workplace");
        assertEquals(3, diary.getNumberOfEntries());
    }

    @Test
    public void entryCanBeFindByIdTest() {
        diary.addEntry("book", "use for writing");
        diary.addEntry("man", "loves women");
        diary.addEntry("pastor", "loves tithe and offerings");
        assertEquals(3, diary.getNumberOfEntries());
        assertEquals("Thu, 05:05:2022, 10:14PM | man | loves women", diary.findEntryById(2));

    }
    @Test
    public void entryCanBeFindByTitle(){
        diary.addEntry("book", "use for learning");
        diary.addEntry("uncle chi", "loves to teach java");
        diary.addEntry("papa", "works hard for family");
        assertEquals(3, diary.getNumberOfEntries());
        String result = diary.findEntryByTitle("papa");
        assertEquals("papa", result);

    }

    @Test
    public void entryCanBeRemoveTest() {
        diary.addEntry("book", "use for writing");
        diary.addEntry("man", "loves women");
        diary.addEntry("pastor", "loves tithe and offerings");
        assertEquals(3, diary.getNumberOfEntries());
        diary.removeById(2);
        assertEquals(2, diary.getNumberOfEntries());

    }

    @Test
    public void entryCanBeRemoveByTitleTest() {
        diary.addEntry("book", "use for writing");
        diary.addEntry("man", "loves women");
        diary.addEntry("pastor", "loves tithe and offerings");
        diary.addEntry("company", "the company is a nice workplace");
        assertEquals(4, diary.getNumberOfEntries());
        assertTrue(diary.removeByTitle("book"));
        assertEquals(3, diary.getNumberOfEntries());
    }
    @Test
    public void isLockTest(){
        diary.setPassword("");

    }
}
