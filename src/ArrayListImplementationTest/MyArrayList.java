package ArrayListImplementationTest;

public class MyArrayList {
    String[] arrayList = new String[5];
    int count = 0;


    public void add(String item) {
        arrayList[count] = item;
        count++;
    }

    public int size() {
        return count;
    }

    public String get(int index) {

        return arrayList[index];
    }

    public void remove(String item) {
        arrayList[count] = item;
        count--;
    }

    public void ExpandArrayList() {
        String[] temp = arrayList;
        arrayList = new String[arrayList.length - 1 * 2];
        for (int i = 0; i < temp.length; i++) {
            arrayList[i] = temp[i];
        }
    }
    public void arrayListReplaceREmoval(){

    }
}
