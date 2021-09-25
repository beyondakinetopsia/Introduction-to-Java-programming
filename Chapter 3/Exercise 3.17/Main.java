import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2):");
        int choice = input.nextInt();
        int computerChoice = ((int)(Math.random()*10))/3;
        switch (choice){
            case 0:
                switch(computerChoice){
                    case 0: System.out.println("Even");break;
                    case 1: System.out.println("You Win");break;
                    case 2: System.out.println("You Lose");break;
                };break;
            case 1:
                switch(computerChoice){
                    case 1: System.out.println("Even");break;
                    case 0: System.out.println("You Win");break;
                    case 2: System.out.println("You Lose");break;
                };break;
            case 2:
                switch(computerChoice){
                    case 2: System.out.println("Even");break;
                    case 1: System.out.println("You Win");break;
                    case 0: System.out.println("You Lose");break;
                };break;
            default:
                System.out.println("There is no such choice!");
        }
        System.out.println(computerChoice);
    }
}
