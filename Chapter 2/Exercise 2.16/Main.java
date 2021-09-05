import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);   
        System.out.print(" Enter the side:");
        double s = input.nextDouble();
        System.out.println("The area of the hexagon is "+(1.5*s*s*Math.pow(3,0.5)));
    }
}
