public class Task9 {

//            Task 9 - Numbers and stars
//            Create a program that will give this output using loops and if statements:
//            0*********
//            01********
//            012*******
//            0123******
//            01234*****
//            012345****
//            0123456***
//            01234567**
//            012345678*
//            0123456789

    public static void main(String[] args) {

        System.out.println("¯\\_(ツ)_/¯");
        System.out.println();

        for (int j = 0; j <= 9; j++) {
            for (int i = 0; i <= 9; i++) {
                if (i > j) {
                    System.out.print("*");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
