public class Task6 {
    //        Task 6
//        Look at this code and try to understand how it works and what it will print to the screen when you
//        run it.
//
//        int rows = 4;
//        int cols = 4;
//        for (int row = 0; row < rows; row++) {
//            for (int col = 0; col < cols; col++) {
//                System.out.print("X");
//        }
//            System.out.println();
//    }
//
//      Modify the code in 4 different ways so that you can create the following 4 outputs, and remember
//      that you can test if a row is even by using this if statement: if (row % 2 == 0)
//
    public static void main(String[] args) {

//      Task 6.1:
//
//      XXXX
//      OOOO
//      XXXX
//      OOOO

        int rows = 4;
        int cols = 4;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row % 2 == 0){
                    System.out.print("X");
                }
                else if (row % 2 != 0){
                    System.out.print("O");
                }
            }
            System.out.println();
        }

        System.out.println();
//      Task 6.2:
//
//      XOXO
//      XOXO
//      XOXO
//      XOXO

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (col % 2 == 0){
                    System.out.print("X");
                }
                else if (col % 2 != 0){
                    System.out.print("O");
                }

            }
            System.out.println();
        }

        System.out.println();
//      Task 6.3:
//
//      XOOO
//      OXOO
//      OOXO
//      OOOX

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (col == row){
                    System.out.print("X");
                }
                else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }


    }
}