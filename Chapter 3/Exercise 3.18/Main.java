import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight of the package: ");
        double choice = input.nextInt();
        if (choice>0 && choice<=1) {
            System.out.println(3.5);
        }
        if (choice>1 && choice<=3) {
            System.out.println(3.5);
        }
        if (choice>3 && choice<=10) {
            System.out.println(3.5);
        }
        if (choice>10 && choice<=20) {
            System.out.println(3.5);
        }
        else {
            System.out.println("package cannot be shipped");
        }
    }
}
