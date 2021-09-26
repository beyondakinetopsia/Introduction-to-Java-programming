import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.println(!(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0 ||
                ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 0 ||
                (x2 < x0) || (y2 < y0) || (x2 > x1) || (y2 > y1)) ? "on the line":"not on the line");
    }
}
