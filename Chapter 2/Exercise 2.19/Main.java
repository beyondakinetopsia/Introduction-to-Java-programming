import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);   
        System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double s = (Math.pow(Math.pow((x2-x1),2)+Math.pow((y2-y1),2),0.5) + Math.pow(Math.pow((x3-x2),2)+Math.pow((y3-y2),2),0.5) + Math.pow(Math.pow((x1-x3),2)+Math.pow((y1-y3),2),0.5))/2
        System.out.println(Math.pow(s*(s-Math.pow(Math.pow((x2-x1),2)+Math.pow((y2-y1),2),0.5)*(s-Math.pow(Math.pow((x3-x2),2)+Math.pow((y3-y2),2),0.5))*(s-Math.pow(Math.pow((x1-x3),2)+Math.pow((y1-y3),2),0.5))),0.5)
    }
}
