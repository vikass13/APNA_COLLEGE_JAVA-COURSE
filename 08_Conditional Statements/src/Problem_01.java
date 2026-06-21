import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the number is ");
        int i = sc.nextInt();

            if (i > 0) {
                System.out.println("the number is positive");
            } else if (i < 0) {
                System.out.println("the number is negative");
            } else {
                System.out.println("the number is zero");
            }
        }
    }
