import java.util.Scanner;

public class Divide {

    public static Scanner scanner = new Scanner(System.in);
    public static void divideWelcome(){
        System.out.println("What two numbers do you wanna divide?");
    }

    public static void divide(){

        System.out.println("First number:");
        int x = scanner.nextInt();

        System.out.println("Second number:");
        int y = scanner.nextInt();

        int result = x / y;
        System.out.println("The result of your numbers are: " + result);
    }
}
