import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        System.out.println((int)num + " minutes is approximately " + (int)num/(60*24*365) + " years and " + (int)(num%(60*24*365))/(60*24) + " days");
    }
}
