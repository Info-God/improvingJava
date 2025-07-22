import java.util.Scanner;
import java.math.BigInteger;


class DataType {

    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine()); // number of test cases
        Integer checktype = t;
        System.out.print(Byte.MIN_VALUE);
        System.exit(0);
        // Define BigInteger limits
        BigInteger byteMin = BigInteger.valueOf(Byte.MIN_VALUE);
        BigInteger byteMax = BigInteger.valueOf(Byte.MAX_VALUE);
        BigInteger shortMin = BigInteger.valueOf(Short.MIN_VALUE);
        BigInteger shortMax = BigInteger.valueOf(Short.MAX_VALUE);
        BigInteger intMin = BigInteger.valueOf(Integer.MIN_VALUE);
        BigInteger intMax = BigInteger.valueOf(Integer.MAX_VALUE);
        BigInteger longMin = BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger longMax = BigInteger.valueOf(Long.MAX_VALUE);

        for (int i = 0; i < t; i++) {
            try {
                String input = scanner.nextLine();
                BigInteger n = new BigInteger(input);

                System.out.println(input + " can be fitted in:");

                if (n.compareTo(byteMin) >= 0 && n.compareTo(byteMax) <= 0)
                    System.out.println("* byte");
                if (n.compareTo(shortMin) >= 0 && n.compareTo(shortMax) <= 0)
                    System.out.println("* short");
                if (n.compareTo(intMin) >= 0 && n.compareTo(intMax) <= 0)
                    System.out.println("* int");
                if (n.compareTo(longMin) >= 0 && n.compareTo(longMax) <= 0)
                    System.out.println("* long");

                // If none match, handle in catch below

            } catch (Exception e) {
                System.out.println(scanner.nextLine() + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    
    }
}