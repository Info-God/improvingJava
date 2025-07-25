import java.util.Scanner;
import java.util.Arrays;
class TwoDimension {

    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        // int marks[][] = new int[3][5];

        // // System.out.println(marks[1].length);
        // for(int row = 0; row < marks.length; row++){
        //     System.out.print("Enter mark of " + row + " person :");
        //     for (int col = 0 ; col < marks[0].length; col++ ){
                
                
        //         marks[row][col] = inp.nextInt();
        //     }
            

        // }

        int[][] marks = {
            {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
        };

        // for(int row = 0; row < marks.length; row++){

            

        //     for (int col = 0 ; col < marks[row].length; col++ ){
                
                
        //         System.out.print(marks[row][col] + " ");
        //     }

        //     System.out.println();
            

        // }

    /*
    Example Input:


int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
Expected Output:

Row 0 sum: 6
Row 1 sum: 15
Row 2 sum: 24
     */
        
        // for ( int[] itr : marks ){
        //     int total = 0;
        //     for ( int eachElement : itr ){
        //         total += eachElement;
        //     }
        //     System.out.printf("Rows sum: %d%n", total);
        // }

        for ( int row = 0 ; row < marks.length ; row++ ){
            int total = 0;
            for ( int col = 0 ; col < marks[row].length ; col++ ){

                total += marks[row][col];
            }
            System.out.printf("Rows %d sum: %d%n", row , total);
        }


    }
}