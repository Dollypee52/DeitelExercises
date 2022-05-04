package DiaryProject;

import java.util.ArrayList;

public class Diary {
 private String name;
 private ArrayList<Entry> entries;
 private String password;
 private int numberOfEntries;

 public Diary(String name,String password){
     this.name = name;
     entries = new ArrayList<>();
     this.password = password;
 }

    public String getName() {
     return name;
    }

    public void setPassword(String password) {
     this.password = password;
    }

    public String getPassword() {
     return password;
    }

    public void addEntry(String title, String body) {
     Entry entry = new Entry(title, body);
     entries.add(entry);
     numberOfEntries += 1;
 }

    public int getNumberOfEntries() {
     return numberOfEntries;
    }

    public String findEntryById(int entryId) {
     int index = entryId - 1;
     for(int i = 0; i < entries.size();i++){
        Entry entry = entries.get(i);
        if(index == i){
            return entry.getDate() + " | " + entry.getTitle() + " | " + entry.getBody();
        }

     }
     return "Entry" + entryId + "not found";
    }

    public boolean removeById(int entryId) {
     int index = entryId - 1;
     for(int i = 0; i < entries.size();i++){
         Entry entry = entries.get(i);
         if(index == i){
             entries.remove(entry);
             numberOfEntries -= 1;
             return true;

         }
     }
     return false;
    }
}
