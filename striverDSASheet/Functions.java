import java.util.Scanner;
class Functions {

    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the 1st num and 2nd num :");

        int a = inp.nextInt();

        int b = inp.nextInt();

        String result = operations(a,b);

        System.out.println("Output is " + result);
        
    }

    static String operations(int a, int b){
        String result = "";
        if(a > b){
            result = "Success";
        }else{
            result = "Failed";
        }
        
        return result;
    }


}