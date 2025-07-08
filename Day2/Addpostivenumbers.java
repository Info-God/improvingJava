import java.util.Scanner;

class Addpostivenumbers {
    public static void main(String args[]){
        Scanner getData = new Scanner(System.in);

        
        System.out.println("Give the count to provide numbers");

        int number = getData.nextInt();

        int[] negative = new int[number];

        for ( int i = 0; i < number ; i++){
            
            
            System.out.println("Enter the number");

            

            int totalPostive = ( getData.nextInt() < 0 ) ? totalPostive + getData.nextInt() : negative[] = getData.nextInt();
        }

        System.out.println(totalPostive);
        
    }
}