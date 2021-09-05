import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        System.out.println(num + "minutes is approximately" + num/(60*24*365) + " and " + (num%(60*24*365))/(60*24) + " days");
    }
}
