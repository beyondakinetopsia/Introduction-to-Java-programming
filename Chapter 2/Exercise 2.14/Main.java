import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);   
        System.out.print("Enter weight in pounds:");
        double w = input.nextDouble()*0.45359237;
        System.out.print("Enter height in inches:");
        double h = input.nextDouble()* 0.0254;
        System.out.println("BMI is "+(w/(h*h)));
    }
}
