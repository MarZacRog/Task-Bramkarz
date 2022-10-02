import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] happyList=new String[]{"Mateusz","Justyna","Marta","Paulina","Pawel"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello!");
        System.out.println("Please, enter your name:");
        String name = scanner.next();
        System.out.println("Please, enter your last name:");
        String lastName = scanner.next();
        System.out.println("How old are You?");
        int age = scanner.nextInt();

        if (age>=18) {
            System.out.println(name + " " + lastName + " " + "Welcome to our club!");
            if (age>=18&25>=age) {
                System.out.println("Congrats, You have a free beer!");
                for(String person:happyList)
                    if (name.equals(person)) {
                        System.out.println("Congratulation! Your name is on the happy list. You have also a free shot!");
                    }
            }
            else {
                System.out.println("Have a great time!");
            }
            if (age>=30&40>=age) {
                for(String person:happyList)
                    if (name.equals(person)) {
                        System.out.println("We want to invite you to VIP room");
                    }
            }
        }
        else{
            System.out.println(name + " " + lastName + " " + "You can't enter");
}}}