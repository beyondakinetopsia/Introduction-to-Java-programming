import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int zone = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds/1000;
        long currentSeconds = totalSeconds%60;


        long totalMinutes = totalSeconds/60;
        long currentMinutes = totalMinutes%60;

        long totalHours = totalMinutes/60;
        long currentHours = totalHours%24;
        if ((currentHours+zone)/12>1){
            System.out.println("The current time is " + (currentHours+zone)%12 +":"+currentMinutes+":"+currentSeconds +" PM");
        }
        else{
            System.out.println("The current time is " + (currentHours+zone)%12 +":"+currentMinutes+":"+currentSeconds+" AM");
        }
    }
}
