import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);   
        System.out.print("Enter the driving distance:");
        double d = input.nextDouble();
        System.out.print("Enter miles per gallon:");
        double m = input.nextDouble();
        System.out.print("Enter price per gallon:");
        double p = input.nextDouble();
        
        System.out.println("The cost of driving is $"+(d/m * p));
    }
}
