import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double pop = 312032486;
        double seconds = 365*24*60*60;
        System.out.print("Enter the number of years: ");
        int num = input.nextInt();
        double birthPerYear = seconds/7;
        double deathPerYear = seconds/13;
        double imigrationPerYear = seconds/45;
        for(int i=0;i<num;i++){
            pop+=birthPerYear+imigrationPerYear-deathPerYear;
        }
        System.out.println("The population in "+num+" years is "+(int) pop);
    }
}
