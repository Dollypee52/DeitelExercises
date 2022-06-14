package DataStructure;

public class Hashmap {
    Set keys = new Set();
    Set values = new Set();

    private int counter;


    public int size() {
        return counter;
    }

    public void put(String key, String value) {
        for (int i = 0; i < keys.size(); i++) {
            if(key.equals(keys.get(i))){
                values.add(i,value);
            }
        }
        keys.add(key);
        values.add(value);
        counter++;
    }


    public String getValue(String key) {
        for (int i = 0; i < keys.size(); i++) {
            if(key.equals(keys.get(i))){
                return values.get(i);
            }
        }
        return null;
    }
    public boolean containKey(String key){
        if(keys.isContain(key)){
            return true;
        }
        return false;
    }

    public boolean containValue(String value){
        if(values.isContain(value)){
            return true;
        }
        return false;
    }

    public void printHashMap(){
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i));
            System.out.println(values.get(i));
        }
    }
}

