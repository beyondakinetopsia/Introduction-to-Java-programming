import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int day = input.nextInt();
        if(day<32 && day>0 && month>0 && month<13){
            switch((day+(26*(month+1)/10)+year%100+year%100/4+year/400+year/25)%7){
                case 0:
                    System.out.println("Day of the week is Sunday"); break;
                case 1:
                    System.out.println("Day of the week is Monday"); break;
                case 2:
                    System.out.println("Day of the week is Tuesday"); break;
                case 3:
                    System.out.println("Day of the week is Wednesday"); break;
                case 4:
                    System.out.println("Day of the week is Thursday"); break;
                case 5:
                    System.out.println("Day of the week is Friday"); break;
                case 6:
                    System.out.println("Day of the week is Saturday"); break;
                default:
                    System.out.println();
            }
        }
        else{
            System.out.println("Invalid");
        }

    }
}
