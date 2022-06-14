package AnalysisStructureTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MylistTest {
    private Mylist mylist;
    @BeforeEach
    public void setUp(){
        mylist = new Mylist();
    }
    @Test
    public void mylistCanBeCreatedTest(){
        assertNotNull(mylist);
    }
    @Test
    public void itemCanBeAddedToMylistTest(){
        mylist.add("Table");
        mylist.add("Chair");
        mylist.add("Pencil");
        assertEquals(3,mylist.size());
    }
    @Test
    public void itemCanBeRemovedFromMyListTest(){
        mylist.add("Table");
        mylist.add("Chair");
        mylist.add("Pencil");
        mylist.remove("Chair");
        assertEquals(2,mylist.size());

    }
    @Test
    public void mylistCanBeRemovedByItemAndIndex(){
        mylist.add("Table");
        mylist.add("Chair");
        mylist.add("Pencil");
        mylist.remove("Chair");
        assertEquals(2,mylist.size());
    }
}
