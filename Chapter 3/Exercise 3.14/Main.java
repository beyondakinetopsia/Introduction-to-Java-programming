import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 if your guess is head or 1 if ypur guess is tail: ");
        int x = input.nextInt();
        int num = (int)Math.round(System.currentTimeMillis()%10*0.1);
        if(num==x){
            System.out.println("You win!");
        }
        else{
            System.out.println("You lose!");
        }
    }
}
