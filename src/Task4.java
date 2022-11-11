import java.util.Scanner;

public class Task4 {

    // Task 4
    // Create a for loop that prints "10 8 6 4 2"

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        int numInput = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1; i <= 10; i++){
            System.out.println(numInput + " x " + i + " = " + numInput * i);
        }
    }
}
