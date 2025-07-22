public class Pattern {
    public static void main(String args[]){
        System.out.println();

        int count = 1;
        int n = 10;

        int iteration  = n * 2 - 1;
        for(int i = 1;i<=iteration;i++){
            
            for(int j = 1; j<=i;j++){

                if ( iteration / 2 == i){
                    --i;
                }
                
                System.out.print(count + " ");

                ++count;
                
            }

            

            System.out.println();
        }
    }
}
