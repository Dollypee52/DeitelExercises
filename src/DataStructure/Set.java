package DataStructure;


public class Set {
    private Arraylist setters = new Arraylist();
    private int counter;
    public boolean isEmpty() {
        if(setters.size() > 0){
            return false;
        }
        return true;
    }
    public boolean isContain(String item) {
        for (int i = 0; i < size(); i++) {
            if(item.equals(setters.get(i))){
                return true;
            }
        }

        return false;
    }
    public void add (int index, String item){
        setters.add(index, item);
        counter++;
    }
    public void add(String item){
        if(!isContain(item)){
            setters.add(item);
            counter++;
        }
    }

    public int size() {
        return counter;
    }

    public String get(int index) {
        return setters.get(index);
    }

    public void remove(int index) {
        setters.remove(index);
        counter--;
    }
    public void remove(String item ){
        setters.remove(item);
        counter--;
    }
}