package ListInterfaces;

public interface List {
    void add(String item);
    void add(int index, String item);
    void remove(String item);
    void remove(int index);
    String get(int index);
    int size();
}
