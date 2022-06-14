package ListInterfaces;

public class ArrayList implements List {
    private int counter;
    private String[] db;
    @Override
    public void add(String item) {
        if(counter == 0){
            int length = 5;
            db = new String[length];
        }
        if(counter == db.length){
            increaseArrayLength();
        }
       db[counter] = item;
       counter++;
    }

    @Override
    public void add(int index, String item) {
        String[] db1 = new String[db.length+1];
        for (int i = 0; i < db.length; i++) {
            db1[i] = db[i];
        }
        db1[index] = item;
        for (int i = index; i < db1.length; i++) {
            db1[index + 1] = db[index];
        }
        db = db1;
    }

    @Override
    public void remove(String item) {
     counter--;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public String get(int index) {
        return db[index];
    }

    @Override
    public int size() {
        return counter;
    }
    public void increaseArrayLength(){
        String[] db1 = new String[db.length * 2];
        for (int i = 0; i < counter; i++) {
            db1[i] = db[i];
        }
        db = db1;
    }
}
