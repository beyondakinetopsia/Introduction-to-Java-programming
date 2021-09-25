import java.util.*;

public class Main{
    public static void main(String[] args){
        double x1 = Math.random() * 1000;
        while(!(x1>-50 && x1<50)){
            x1 = Math.random() * 1000 * ((new Random()).nextBoolean() ? -1 : 1);
        }
        double y1 = Math.random() * 1000;
        while(!(y1>-100 && y1<100)){
            y1 = Math.random() * 1000 * ((new Random()).nextBoolean() ? -1 : 1);
        }
        System.out.println("("+x1+", "+y1+")");
    }
}
