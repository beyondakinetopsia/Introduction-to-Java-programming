import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        double y = ((y1 -y2)*x1*(y3 -y4) -(x1 -x2)*y1*(y3 -y4) - (y3 -y4)*x3*(y1 -y2) +(x3 -x4)*y3*(y1 -y2))/((x3 -x4)*(y1 -y2) -(x1 -x2)*(y3 -y4));
        double x = ((y1 -y2)*x1 -(x1 -x2)*y1+ (x1 -x2)*y)/(y1 -y2);
        System.out.print("y is "+ y);
        System.out.print("x is "+ x);
    }
}
//
