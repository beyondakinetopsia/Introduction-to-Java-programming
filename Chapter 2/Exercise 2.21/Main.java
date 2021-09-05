import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);   
        System.out.print("Enter investment amount:");
        double ia = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage:");
        double irp = input.nextDouble();
        System.out.print("Enter number of years:");
        double y = input.nextDouble();
        System.out.println("Accumulated value is "+(ia*Math.pow((1+irp/12), y*12));
    }
}
