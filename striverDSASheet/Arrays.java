import java.util.Scanner;

class Arrays {
    public static void main(String args[]){

        Scanner inp = new Scanner(System.in);
        
        int[] marks = {10,20,31,1,5};

        int min = marks[0];
        int max = marks[0];
        for(int i = 1; i< marks.length; i++) {
        
            if ( min > marks[i])
                min = marks[i];
            
            if ( max < marks[i])
                max = marks[i];
        }

        System.out.println(min);
        System.out.println(max);
        
    
    }
}