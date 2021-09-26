import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int num = input.nextInt();
        
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds/1000;
        
        
        long totalMinutes = totalSeconds/60;

        long totalHours = totalMinutes/60;

        System.out.println("The current time is "+totalHours+":"+totalMinutes+":"+totalSeconds);     
    }
}
