import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();
        if(x1+r1/2>=x2 && x1-r1/2<=x2 && y1+r1/2>=y2 && y1-r1/2<=y2){
            System.out.println("inside");
        }
        else if((x1 + r1 / 2 > x2 - r2) ||
                (y1 + r1 / 2 > y2 - r2)){
            System.out.println("overlaps");
        }
        else{
            System.out.println("does not overlaps");
        }
    }
}
