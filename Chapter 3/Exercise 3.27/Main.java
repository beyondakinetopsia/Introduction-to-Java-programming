import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if(x>0 && y>0 && y<100 && x<200){
            System.out.println("inside");
        }
        else{
            System.out.println("outside");
        }
    }
}
