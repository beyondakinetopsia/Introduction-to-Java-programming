import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double save = input.nextDouble();
        double temp = 0;
        for(int i=0;i<6;i++){
          temp = (save+temp)*1.00417;
        }
        System.out.print("After the sixth month, the account value is $"+temp);
    }
}
