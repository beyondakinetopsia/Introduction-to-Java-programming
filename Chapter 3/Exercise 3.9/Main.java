import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int num = input.nextInt();
        System.out.print("The ISBN-10 number is "+num);
        int d9 = num%10;
        num /=10;
        int d8 = num%10;
        num /=10;
        int d7 = num%10;
        num /=10;
        int d6 = num%10;
        num /=10;
        int d5 = num%10;
        num /=10;
        int d4 = num%10;
        num /=10;
        int d3 = num%10;
        num /=10;
        int d2 = num%10;
        num /=10;
        int d1 = num%10;
        num /=10;
        if((d1+2*d2+3*d3+4*d4+5*d5+6*d6+7*d7+8*d8+9*d9)%11 == 10){
            System.out.println("X");
            return;
        }
        System.out.println((d1+2*d2+3*d3+4*d4+5*d5+6*d6+7*d7+8*d8+9*d9)%11);
    }
}
