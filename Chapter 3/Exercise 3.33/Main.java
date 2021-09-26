import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        double w1 = input.nextDouble();
        double p1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double w2 = input.nextDouble();
        double p2 = input.nextDouble();
        System.out.println(w1/p1 >= w2/p2? "Package 1 has a better price." : "Package 2 has a better price.");
    }
}
