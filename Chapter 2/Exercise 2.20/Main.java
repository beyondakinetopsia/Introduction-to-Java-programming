import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);   
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%):");
        double b = input.nextDouble();
        double ir = input.nextDouble();
        System.out.println("The interest is "+(b*(ir/1200)));
    }
}
