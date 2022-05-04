package DiaryProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {

    private Diary diary;
    @BeforeEach

    public void setUp(){
        diary = new Diary("DolapoDiary","funmi");
    }

    @Test
    public void diaryCanBeCreated(){
        assertNotNull(diary);
    }
    @Test
    public void nameCanBeAdded(){
        assertEquals("DolapoDiary",diary.getName());

    }
    @Test
    public void passwordCanBeSet(){
        diary.setPassword("funmi");
        assertEquals("funmi",diary.getPassword());
    }
    @Test
    public void entryCanBeCreated(){
        diary.addEntry("bigie","a big guy");
        assertEquals(1, diary.getNumberOfEntries());
    }
    @Test
    public void entryCanBeFoundByIdTest(){
        diary.addEntry("book","use for writing");
        diary.addEntry("man","loves women");
        diary.addEntry("pastor","loves tithe and offerings");
        assertEquals(3,diary.getNumberOfEntries());
        assertEquals("Tue, 03:05:2022, 06:31PM | man | loves women",diary.findEntryById(2));

    }
    @Test
    public void entryCanBeRemoveTest(){
        diary.addEntry("book","use for writing");
        diary.addEntry("man","loves women");
        diary.addEntry("pastor","loves tithe and offerings");
        assertEquals(3,diary.getNumberOfEntries());
        diary.removeById(2);
        assertEquals(2,diary.getNumberOfEntries());

    }
}
