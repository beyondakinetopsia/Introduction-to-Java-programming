import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = input.nextInt();
        System.out.println("The sum of the digits is "+ (num%1000+num%100+num%10));
    }
}
