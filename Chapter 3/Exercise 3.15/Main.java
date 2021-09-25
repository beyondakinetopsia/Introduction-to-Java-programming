import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three-digit number: ");
        int x = input.nextInt();
        int[] arr = new int[3];
        arr[2] = x%10;
        x = x/10;
        arr[1] = x%10;
        x = x/10;
        arr[0] = x%10;

        int loteryNum = 539;
        int[] lotArr = new int[3];
        lotArr[2] = loteryNum%10;
        loteryNum = loteryNum/10;
        lotArr[1] = loteryNum%10;
        loteryNum = loteryNum/10;
        lotArr[0] = loteryNum%10;
        if((arr[0]==lotArr[0])&&(arr[1]==lotArr[1])&&(arr[2]==lotArr[2])){
            System.out.println("You win $10,000!");
            return ;
        }
        Arrays.sort(lotArr);
        Arrays.sort(arr);
        if(((arr[0]==lotArr[0])&&(arr[1]==lotArr[1])&&(arr[2]==lotArr[2]))||
                ((arr[1]==lotArr[0])&&(arr[2]==lotArr[1])&&(arr[0]==lotArr[2]))||
                ((arr[2]==lotArr[0])&&(arr[1]==lotArr[1])&&(arr[0]==lotArr[2]))){
            System.out.println("You win $3,000!");
            return ;
        }
        if((arr[0]==lotArr[0])||(arr[0]==lotArr[1])||(arr[0]==lotArr[2])||
                (arr[1]==lotArr[0])||(arr[1]==lotArr[1])||(arr[1]==lotArr[2])||
                (arr[2]==lotArr[0])||(arr[2]==lotArr[1])||(arr[2]==lotArr[2])){
            System.out.println("You win $1,000!");
            return ;
        }
        else{
            System.out.println("You lose!");
        }
    }
}
