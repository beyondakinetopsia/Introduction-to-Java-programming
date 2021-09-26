import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double sub = input.nextDouble();
        double rate = input.nextDouble();
        System.out.println("The gratuity is "+(sub*rate/100)+" and total is $"+(sub+(sub*rate/100)));
    }
}
