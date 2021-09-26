import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = input.nextInt();
        int sol = num%10;
        num /= 10;
        sol += num%10;
        num /= 10;
        sol += num%10;

        System.out.println("The sum of the digits is "+ sol);
    }
}
