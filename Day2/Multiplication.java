import java.util.Scanner;

class Multiplication {
    public static void main (String args[]){

        Scanner getData  =  new Scanner(System.in);

        System.out.println("Enter the number to get muliplication upto 10");

        int number = getData.nextInt();

        int i;

        for(i = 1;i<=10;i++){
            
            System.out.println("Multiplication of " + number + " : " + i + " x" + number + " is " + i * number);
        }
    }
}