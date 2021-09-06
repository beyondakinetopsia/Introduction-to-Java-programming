import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double w = input.nextDouble()*0.45359237;

        System.out.print("Enter feet: ");
        double f = input.nextDouble();

        System.out.print("Enter inches: ");
        double i = input.nextDouble()*0.0254;

        double bmi = w /
                ((i+12*f*0.0254) * (i+12*f*0.0254));
        System.out.println("BMI is "+ bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

    }
}
