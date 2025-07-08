import java.util.Scanner;

class calculator {
    public static void main(String args[]){

        Scanner getData = new Scanner(System.in);

        int firstNum;

        int secondNum;

        int operation;

        int result = 0;

        System.out.println("Calculators :\n 1. Add \n 2. Sub \n 3. Div \n 4. Mul");

        operation = getData.nextInt();

        System.out.println("Enter first number");

        firstNum = getData.nextInt();

        System.out.println("Enter second number");

        secondNum = getData.nextInt();

        switch(operation){
            case 1 : result = firstNum + secondNum;
                     break;

            case 2 : result = firstNum - secondNum;
                     break;
            case 3 : result = firstNum / secondNum;
                     break;
            case 4 : result = firstNum * secondNum;
                     break;
        }

        System.out.println("Result of " + firstNum + " and " + secondNum + " is " + result);

        getData.close();

        
    }
}