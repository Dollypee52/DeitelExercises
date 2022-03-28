package Practice;

import java.util.Scanner;

public class NativeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Native myNative = new Native();
//        System.out.println("the initial name is "+myNative.getName());
//
////        myNative.setName("Dolapo");
////        System.out.println("the initial name is "+myNative.getName());
//
//        System.out.println("Enter a name ");
//        String name = input.nextLine();
//
//        myNative.setName(name);
//        System.out.println("Your  name is "+myNative.getName());

 //       myNative.setAge(17);
 //       System.out.println("Your age is "+myNative.getAge());

        System.out.println("Enter your age");
        int age = input.nextInt();

        myNative.setAge(age);
        System.out.println("your age is " +myNative.getAge());
    }
}
