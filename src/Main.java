import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name:");
        String name = scanner.next();
        System.out.println("Please, enter your last name:");
        String lastName = scanner.next();
        System.out.println("How old are You?");
        int x = scanner.nextInt();
        if (x<18) {
            System.out.println(name + " " + lastName + " - You're too young to enter!");
        } else {
            System.out.println(name + " " + lastName + " - You can come in ;)!");
            if (x>18&25>x) {
                System.out.println("You won a free shot - go to the bar!");
        }

}}}