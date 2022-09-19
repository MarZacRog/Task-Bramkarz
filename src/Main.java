import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println("Enter your last name:");
        String lastName = scanner.next();
        System.out.println("How old are You?");
        int x = scanner.nextInt();
        if (x<18) {
            System.out.println(name + " " + lastName + ", jestes za mlody zeby wejsc!");
        } else {
            System.out.println(name + " " + lastName + ", mozesz wejsc ;)!");
        }


}}