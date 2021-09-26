import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int choice = input.nextInt();
        System.out.print("Enter the dollar amount: ");
        double amount = input.nextDouble();
        switch (choice){
            case 0: System.out.println("$" + amount + " is " + amount*rate + " yuan"); break;
            case 1: System.out.println(amount + " yuan is " + amount/rate); break;
            default: System.out.println("Incorrect input"); break;
        }
    }
}
