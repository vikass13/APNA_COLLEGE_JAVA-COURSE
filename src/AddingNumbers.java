/*import java.util.Scanner;
public class AddingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number = ");
        float a = sc.nextFloat();
        System.out.print("enter second number = ");
        float b = sc.nextFloat();

        float add = a+b;
        System.out.println("the sum of a and b " + add);
        sc.close();
    }
}
*/

import java.math.BigInteger;
import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number = ");
        BigInteger a = sc.nextBigInteger();

        System.out.print("Enter second number = ");
        BigInteger b = sc.nextBigInteger();

        BigInteger sum = a.add(b);

        System.out.println("The sum is = " + sum);
    }
}
