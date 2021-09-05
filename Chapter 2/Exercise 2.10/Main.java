import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");
        double m = input.nextDouble();
        double it = input.nextDouble();
        double ft = input.nextDouble();
        System.out.println("The energy needed is" + (ft-it)*m*4184);
    }
}
