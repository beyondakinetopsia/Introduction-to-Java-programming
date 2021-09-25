import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.print("Enter today's day: ");
        int w = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int v = input.nextInt();

        w %= 7;
        System.out.print("Today is " + days[w] + " and the future day is " + days[(w+v)%7]);
    }
}
