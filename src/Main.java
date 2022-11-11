import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // Task 1
        // Create a for loop that prints "1 2 3 4 5 6 7 8 9 10".

//        for (int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }

        // Task 2
        // Create a for loop that prints "0 5 10 15 20"

//        for (int i = 0; i <= 20; i++){
//            if(i % 5 == 0){
//                System.out.println(i);
//            }
//        }

        // Task 3
        // Create a for loop that prints "10 8 6 4 2"

//        for (int i = 0; i <= 10; i++){
//            if (i % 2 == 0){
//                System.out.println(i);
//            }
//        }

        // Task 4
        // Create a for loop that prints "10 8 6 4 2"

        System.out.print("Enter a number: ");
        int numInput = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1; i <= 10; i++){
            System.out.println(numInput + " x " + i + " = " + numInput * i);
        }


    }
}