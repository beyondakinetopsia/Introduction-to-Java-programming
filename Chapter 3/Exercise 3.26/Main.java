import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        double num = input.nextDouble();
        System.out.println("Is 10 divisible by 5 and 6? "+(num%5==0 && num%6==0));
        System.out.println("Is 10 divisible by 5 or 6? "+(num%5==0 || num%6==0));
        System.out.println("Is 10 divisible by 5 or 6, but not both? "+(num%5==0 ^ num%6==0));

    }
}
