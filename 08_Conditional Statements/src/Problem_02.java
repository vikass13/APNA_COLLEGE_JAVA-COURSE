import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("temperature is = ");
        double temp = sc.nextFloat();
        if(temp>100)
            System.out.println("i have a fever");
        else
            System.out.println("i don't have a fever");
    }
}
