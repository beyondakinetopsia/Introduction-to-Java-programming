import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);   
        System.out.print("Enter an amount in double, for example 11.56: ");
        int amount = input.nextInt();
        int amount2 = amount;
        int numberOfOneDollars = amount / 100;
        int numberOfQuarters = amount / 25;
        amount = amount % 25;
        int numberOfDimes = amount / 10;
        amount = amount % 10;
        int numberOfNickels = amount / 5;
        amount = amount % 5;
        int numberOfPennies = amount;
        System.out.println("Your amount " + amount2 + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars"); 
        System.out.println(" " + numberOfQuarters + " quarters "); 
        System.out.println("" + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println("" + numberOfPennies + " pennies");
    }
}
