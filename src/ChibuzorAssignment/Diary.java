package ChibuzorAssignment;

import java.util.ArrayList;

public class Diary {
    private String name;
    private ArrayList<Entry> entries;
    private String password;
    private int numberOfEntries;

    public Diary(String name, String password) {
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

    public boolean validatePassword(String password) {
        if (this.password.equals(password)){
            return true;}

        else return false;
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
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (index == i) {
                return entry.getDate() + " | " + entry.getTitle() + " | " + entry.getBody();
            }

        }
        return "Entry" + entryId + "not found";
    }

    public boolean removeById(int entryId) {
        int index = entryId - 1;
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (index == i) {
                entries.remove(entry);
                numberOfEntries -= 1;
                return true;

            }
        }
        return false;
    }

    public boolean removeByTitle(String title) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (entry.getTitle().equals(title)) {
                entries.remove(entry);
                numberOfEntries -= 1;
                return true;
            }
        }
        return false;
    }


    public String findEntryByTitle(String title) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (entry.getTitle().equals(title)) {
                return entry.toString();
            }
        }
        return null;
    }

    public void viewAllEntries(){
            for (int i = 0; i < entries.size(); i++) {
                Entry entry = entries.get(i);
                System.out.println(entry);
                System.out.println();
            }
    }

}
