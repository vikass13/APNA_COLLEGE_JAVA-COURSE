import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the cost of pencil is");
        float pencil = sc.nextFloat();

        System.out.println("the cost of pen is");
        float pen = sc.nextFloat();

        System.out.println("the cost of an eraser is");
        float eraser = sc.nextFloat();

        float total_cost = (pen+pencil+eraser);
        float gst = (total_cost*18) /100 ;
        float total_amount = total_cost + gst ;

        System.out.println("total amount is " +total_amount);


    }
}
