import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in range between -58 and 41: ");
        double ta = input.nextDouble();
        System.out.print("Enter wind speed: ");
        double v = input.nextDouble();
        if(ta>-58 && ta<41 && v>=2){
            System.out.println(35.74 + 0.6215*ta - 35.75*Math.pow(v, 0.16) + 0.4275*ta*Math.pow(v, 0.16));
        }
        if(ta<-58 || ta>41){
            System.out.println("temperature is not valid");
        }
        if(v<2){
            System.out.println("wind speed is not valid");
        }
    }
}
