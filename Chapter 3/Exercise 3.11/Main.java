import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt();

        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month){
            case 1: System.out.println("January year "+ year+" has 31 days");break;
            case 2: System.out.println("February year "+ year+" has " + ((leapYear) ? " 29 days" : " 28 days"));break;
            case 3: System.out.println("March year "+ year+" has 31 days");break;
            case 4: System.out.println("April year "+ year+" has 30 days");break;
            case 5: System.out.println("May year "+ year+" has 31 days");break;
            case 6: System.out.println("June year "+ year+" has 30 days");break;
            case 7: System.out.println("Jule year "+ year+" has 31 days");break;
            case 8: System.out.println("August year "+ year+" has 31 days");break;
            case 9: System.out.println("September year "+ year+" has 30 days");break;
            case 10: System.out.println("October year "+ year+" has 31 days");break;
            case 11: System.out.println("November year "+ year+" has 30 days");break;
            case 12: System.out.println("December year "+ year+" has 31 days");break;
        }
    }
}
