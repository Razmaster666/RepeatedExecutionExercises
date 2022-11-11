import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//        Write a program that generates a random number and asks the user to guess the number. If the
//        user guess too high the program should print “Too high, try again!”, if the user guess too low the
//        program should print “Too low, try again!”. The program should continue asking the user to guess
//        the number until the user guess the correct number. When that happens, the program should
//        print “Correct guess!” and then end.

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThreadLocalRandom rand = ThreadLocalRandom.current();
        int number = rand.nextInt(10);

        System.out.print("Enter a number baby: ");
        int guess = Integer.valueOf(scanner.nextLine());

        while(guess != number){
           if(guess < number){
               System.out.println("Too low, try again!");
               guess = Integer.valueOf(scanner.nextLine());
           }
           else if(guess > number){
               System.out.println("Too high, try again!");
               guess = Integer.valueOf(scanner.nextLine());
           }
        }

        System.out.println("Correct! The right number was " + number);

    }
}
