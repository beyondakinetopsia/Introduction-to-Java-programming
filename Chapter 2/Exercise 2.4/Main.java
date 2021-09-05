import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double f = input.nextDouble();
        System.out.println(f+" pounds is "+(f*0.454)+" kilograms");
    }
}
