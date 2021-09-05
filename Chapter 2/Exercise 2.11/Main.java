import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double pop = 312032486;
        double seconds = 365*24*60*60;
        System.out.print("Enter the number of years: ");
        int num = input.nextInt();
        int birthPerYear = (int) seconds/7;
        int deathPerYear = (int) seconds/13;
        int imigrationPerYear = (int) seconds/45;
        for(int i=0;i<num;i++){
            pop+=birthPerYear+imigrationPerYear-deathPerYear;
        }
        System.out.println("he population in "+num+" years is "+pop);
    }
}
