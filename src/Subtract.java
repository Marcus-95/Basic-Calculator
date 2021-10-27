import java.util.Scanner;

public class Subtract {
    public static Scanner scanner = new Scanner(System.in);
    public static void subWelcome() {
        System.out.println("What two numbers do you wanna subtract?");
    }

    public static void subtract() {

        System.out.println("First number:");
        int x = scanner.nextInt();

        System.out.println("Second number:");
        int y = scanner.nextInt();

        int result = x - y;
        System.out.println("The result of your numbers are: " + result);
    }
}

