package DiaryProject;

import java.util.Scanner;

public class Main {
    private static Diary diary;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();

    }
    public static void runApp() {
        System.out.println("creating a userName: ");
        String diaryname = input.nextLine();

        System.out.println("creating a password: ");
        String password = input.nextLine();

        diary = new Diary (diaryname, password);

        System.out.println("*** WELCOME TO MY DIARY  ***");


        boolean logOff = false;
        while(!logOff){
            String startUp = """
                    Press:
                    1. ---> To add new entry
                    2. ---> To find entry
                    3. ---> To remove entry
                    4. ---> To update entry
                    5. ---> To viewAll entry
                    6. ---> To change password
                    7. ---> To exit
                     """;
            System.out.println(startUp);
            String response = input.nextLine();
            switch(response){
                case "1": createEntry();
                    break;
                case "2": findEntry();
                    break;
                case "3": removeEntry();
                    break;
                case "4": updateEntry();
                    break;
                case "5": viewAllEntry();
                    break;
               case "6": changePassword();
                   break;
                case "7":
                    System.out.println("Thank you for your time");
                    logOff = true;
                default: runApp();
            }
        }

    }

    private static void changePassword(){
        System.out.println("Enter old password: ");
        String oldPassword = input.nextLine();

        if(diary.validatePassword(oldPassword)){
            System.out.println("Enter new password:");
            String newPassword = input.nextLine();
            diary.setPassword(newPassword);
        }
        else System.out.println("Opss! incorrect password!");

    }

    private static void viewAllEntry() {
        System.out.println("Enter password: ");
        String password = input.nextLine();

        if (diary.validatePassword(password)){
            diary.viewAllEntries();
        }
        else System.out.println("Opss! incorrect password!");
    }

    private static void updateEntry() {
    }


    private static void removeEntry() {
        System.out.println("""
                You can remove an entry by using:
                1.---> by title
                2.---> by Id number
                """);
        String response = input.nextLine();
        switch(response){
            case "1": removeEntryByTitle();
            case "2": removeEntryByIdNumber();
            default: runApp();
        }
    }

    private static void removeEntryByIdNumber() {
        System.out.println("Enter Id Number");
        int idNumber = input.nextInt();

        diary.removeById(idNumber);
            System.out.println("Entry is removed by IdNumber");

    }

    private static void removeEntryByTitle() {
        System.out.println("Enter title ");
        String title = input.nextLine();

        diary.removeByTitle(title);
            System.out.println("Entry is removed by title");
        }


    private static void findEntry() {
        System.out.println("""
                You can find an entry by using any of:
                1. ---> by title
                2. ---> by IdNumber
                 """);
        String Response = input.nextLine();
        switch(Response){
            case "1": findEntryByTitle();
            break;
            case "2": findEntryByIdNumber();
            break;
            default: runApp();

        }
    }

    private static void findEntryByTitle() {
        System.out.println("Enter title ");
        String userTitle = input.nextLine();
        String answer = diary.findEntryByTitle(userTitle);
        System.out.println(answer);
    }

    private static void findEntryByIdNumber() {
        System.out.println("Enter IdNumber ");
        int IdNumber = input.nextInt();
        input.nextInt();
        String output = diary.findEntryById(IdNumber);
        System.out.println(output);
    }




    private static void createEntry() {
        System.out.println("Enter title for your entry ");
        String userTitle = input.nextLine();

        System.out.println("Enter body for your entry ");
        String userBody = input.nextLine();

        diary.addEntry(userTitle,userBody);
        System.out.println("you have successfully added "+userTitle );


    }
}
