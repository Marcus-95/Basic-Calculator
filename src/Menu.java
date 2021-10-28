import java.util.Scanner;

public class Menu {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Menu.runApp();
    }
        public static void runApp() {

            boolean runGame = true;
            do{
                System.out.println("Hi! What would you like to do?");
                System.out.println("Press 1 for addition");
                System.out.println("Press 2 for subtraction");
                System.out.println("Press 3 for multiply");
                System.out.println("Press 4 for divide");
                System.out.println("Press 5 to quit the game");

                int choiceInput = scanner.nextInt();

                switch (choiceInput) {
                    case 1:
                        Calculator.addWelcome();
                        Calculator.add();
                        break;
                    case 2:
                        Calculator.subWelcome();
                        Calculator.subtract();
                        break;
                    case 3:
                        Calculator.multiplyWelcome();
                        Calculator.multiply();
                        break;
                    case 4:
                        Calculator.divideWelcome();
                        Calculator.divide();
                        break;
                    case 5:
                        runGame = false;
                        System.out.println("Game stopped");
                        break;
                }
            }while(runGame);
    }
}
