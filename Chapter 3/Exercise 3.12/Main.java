import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String num = input.nextLine();
        if(num.charAt(0) == num.charAt(num.length()-1)){
            System.out.println(num + " is a palindrome");
        }
        else{
            System.out.println(num + " is not a palindrome");
        }
    }
}
