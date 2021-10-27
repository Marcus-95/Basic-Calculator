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

                int choiceInput = scanner.nextInt();

                switch (choiceInput) {
                    case 1:
                        Add.addWelcome();
                        Add.add();
                        break;
                    case 2:
                        Subtract.subWelcome();
                        Subtract.subtract();
                        break;
                    case 3:
                        Multiply.multiplyWelcome();
                        Multiply.multiply();
                        break;
                    case 4:
                        Divide.divideWelcome();
                        Divide.divide();
                        break;
                }
                System.out.println("\nDo you wanna play again? Write ´Yes´ or ´No´\n");
                String endGameInput = scanner.nextLine();
                if (endGameInput.equals("No")) {
                    runGame = false;
                } else if (endGameInput.equals("Yes")) {
                    System.out.println("Lets go again!");
                }
            }while(runGame== true);
    }
}
