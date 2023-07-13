package Andela;

public class Switch {

    public static void main(String[] args) {
        char charValue = 'b';
        switch(charValue){
            case 'a':
                System.out.println("value was a");
                break;
            case 'b':
                System.out.println("value was b");
                break;
            case 'c':
                System.out.println("value was c");
                break;
            case 'd':
                System.out.println("value was d");
                break;
            case 'e':
                System.out.println("value was e");
                break;
            default:
                System.out.println("value not found");
                break;
        }
    }
}
