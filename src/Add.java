import java.util.Scanner;

public class Add {
    public static Scanner scanner = new Scanner(System.in);
    public static void addWelcome(){
        System.out.println("What two numbers do you wanna add?");
    }

    public static void add(){

        System.out.println("First number:");
        int x = scanner.nextInt();

        System.out.println("Second number:");
        int y = scanner.nextInt();

        int result = x + y;
        System.out.println("The result of your numbers are: " + result);
    }
}
