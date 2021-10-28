import java.util.Scanner;

public class Calculator {
    public static Scanner scanner = new Scanner(System.in);
    //ADD
    public static void addWelcome(){
        System.out.println("What two numbers do you wanna add?");
    }

    public static void add(){

        System.out.println("First number:");
        int x = scanner.nextInt();

        System.out.println("Second number:");
        int y = scanner.nextInt();

        int result = x + y;
        System.out.println("The result of your numbers are: " + result + "\n");
    }
    //SUBTRACT
    public static void subWelcome() {
        System.out.println("What two numbers do you wanna subtract?");
    }

    public static void subtract() {

        System.out.println("First number:");
        int x = scanner.nextInt();

        System.out.println("Second number:");
        int y = scanner.nextInt();

        int result = x - y;
        System.out.println("The result of your numbers are: " + result + "\n");
    }
    //MULTIPLY
    public static void multiplyWelcome(){
        System.out.println("What two numbers do you wanna multiply?");
    }

    public static void multiply(){

        System.out.println("First number:");
        int x = scanner.nextInt();

        System.out.println("Second number:");
        int y = scanner.nextInt();

        int result = x * y;
        System.out.println("The result of your numbers are: " + result + "\n");
    }
    //DIVIDE
    public static void divideWelcome(){
        System.out.println("What two numbers do you wanna divide?");
    }

    public static void divide(){

        System.out.println("First number:");
        int x = scanner.nextInt();

        System.out.println("Second number:");
        int y = scanner.nextInt();

        int result = x / y;
        System.out.println("The result of your numbers are: " + result + "\n");
    }
}