import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);   
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        System.out.println("The equation has two roots "+ ((-1)*b+Math.pow(b*b-4*a*c))/(2*a) + " and " + ((-1)*b-Math.pow(b*b-4*a*c))/(2*a);
    }
}
