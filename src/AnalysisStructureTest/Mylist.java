package AnalysisStructureTest;

public class Mylist {
   private String[] mylist= new String[5];
    private int count=0;
    private int size;


    public void add(String item) {
        if((mylist.length -1) == count){
            expandmylist();

        }
        mylist[count]=item;
        count++;
    }

    private void expandmylist() {
        String[] temp = mylist;
        mylist = new String[mylist.length * 2];

        for(int i=0; i<temp.length;i++){
            mylist[i]= temp[i];

        }
    }

    public int size() {
        return count;
    }

    public void remove(String item) {
        int index = 0;
        mylist[count] = item;
        for(int i= mylist.length-1; i<=0; i--){
            if(item.equals(mylist[i]));
            index = 1;
        }
        count--;



    }
}
