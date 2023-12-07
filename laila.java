import java.util.Random;
import java.util.Scanner;

public class laila {

    public static void main(String args[]) {
        String[] options = {"7up", "7Down"};

        try (Scanner scanner = new Scanner(System.in)) {
            int userInput1;

            do {
                System.out.println("Enter your number: ");
                int userInput = scanner.nextInt();

                Random random = new Random();
                int randomIndex = random.nextInt(options.length);
                String computerChoice = options[randomIndex];

                String result;
                switch (computerChoice) {
                    case "7up":
                        result = userInput < 7 ? "Lost, as computer chose 7up" : "Won, as computer chose 7up";
                        System.out.println(result);
                        break;

                    case "7Down":
                        result = userInput > 7 ? "Lost, as computer chose 7Down" : "Won, as computer chose 7Down";
                        System.out.println(result);
                        break;
                }
                do{
                    System.out.println("Enter your choice: \n1. Play again\n2. Exit the game");
                    userInput1 = scanner.nextInt();

                    switch (userInput1) {
                        case 1:
                            System.out.println("Let's play again");
                            break;
                        case 2:
                            System.out.println("Exiting the game");
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter 1 or 2.");
                            break;
                    }
            } 
            while (userInput1 != 1 && userInput1 != 2);
        } while(userInput1==1);

        } catch (Exception e) {
            System.out.println("Please enter a valid integer only.");
        } finally {
            System.out.println("Thanks for playing!");
        }
    }
}
