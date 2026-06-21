import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        float a = sc.nextFloat();

        System.out.println("enter second number");
        float b = sc.nextFloat();

        System.out.println("enter third number");
        float c = sc.nextFloat();


        System.out.println("the avg is "+ ((a+b+c)/3) );
    }
}