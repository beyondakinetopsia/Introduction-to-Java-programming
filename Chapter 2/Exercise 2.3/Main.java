import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double f = input.nextDouble();
        System.out.println(f+" feet is "+(f*0.305)+" meters");
    }
}
