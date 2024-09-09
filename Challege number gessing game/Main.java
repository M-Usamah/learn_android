import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Welcome to Wonderland");
        System.out.println("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);

        System.out.println("Should We Start");
        System.out.println("\t1: Yes");
        System.out.println("\t2: No");

        int beginAnswer = scanner.nextInt();

        while (beginAnswer!=1){
            System.out.println("Shell we Start");
            System.out.println("\t1: Yes");
            System.out.println("\t2: No");

            beginAnswer = scanner.nextInt();

        }
        Random random = new Random();
        int x = random.nextInt(20) +1;
        System.out.println("Please guess the number:");
        int userInput = scanner.nextInt();

        int timeTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while(!shouldFinish){
            timeTried++;
            if (timeTried<5) {
                if (userInput==x){
                    hasWon = true;
                    shouldFinish = true;
                }else if (userInput > x){
                    System.out.println("Guess lover number");
                    userInput = scanner.nextInt();
                }else{
                    System.out.println("Guess higher");
                    userInput = scanner.nextInt();
                }

            }else{
                shouldFinish = true;
            }
        }
        if (hasWon){
            System.out.println("You Won");
        }else{
            System.out.println("You lost");
        }
    }
}