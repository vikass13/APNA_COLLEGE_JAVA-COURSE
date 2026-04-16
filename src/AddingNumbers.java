import java.util.Scanner;
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
