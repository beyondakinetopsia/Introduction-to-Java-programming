public class Main{
    public static void main(String[] args){
        System.out.print("The card you picked is ");
        int ran = ((int)(Math.random()*10))%4;
        switch (((int)(Math.random()*10))%13){
            case 0:
                switch (ran) {
                    case 0: System.out.println("Ace of Clubs"); break;
                    case 1: System.out.println("Ace of Diamonds"); break;
                    case 2: System.out.println("Ace of Hearts"); break;
                    case 3: System.out.println("Ace of Spades"); break;
                } break;
            case 1:
                switch (ran) {
                    case 0: System.out.println("2 of Clubs"); break;
                    case 1: System.out.println("2 of Diamonds"); break;
                    case 2: System.out.println("2 of Hearts"); break;
                    case 3: System.out.println("2 of Spades"); break;
                } break;
            case 2:
                switch (ran) {
                    case 0: System.out.println("3 of Clubs"); break;
                    case 1: System.out.println("3 of Diamonds"); break;
                    case 2: System.out.println("3 of Hearts"); break;
                    case 3: System.out.println("3 of Spades"); break;
                } break;
            case 3:
                switch (ran) {
                    case 0: System.out.println("4 of Clubs"); break;
                    case 1: System.out.println("4 of Diamonds"); break;
                    case 2: System.out.println("4 of Hearts"); break;
                    case 3: System.out.println("4 of Spades"); break;
                } break;
            case 4:
                switch (ran) {
                    case 0: System.out.println("5 of Clubs"); break;
                    case 1: System.out.println("5 of Diamonds"); break;
                    case 2: System.out.println("5 of Hearts"); break;
                    case 3: System.out.println("5 of Spades"); break;
                } break;
            case 5:
                switch (ran) {
                    case 0: System.out.println("6 of Clubs"); break;
                    case 1: System.out.println("6 of Diamonds"); break;
                    case 2: System.out.println("6 of Hearts"); break;
                    case 3: System.out.println("6 of Spades"); break;
                } break;
            case 6:
                switch (ran) {
                    case 0: System.out.println("7 of Clubs"); break;
                    case 1: System.out.println("7 of Diamonds"); break;
                    case 2: System.out.println("7 of Hearts"); break;
                    case 3: System.out.println("7 of Spades"); break;
                } break;
            case 7:
                switch (ran) {
                    case 0: System.out.println("8 of Clubs"); break;
                    case 1: System.out.println("8 of Diamonds"); break;
                    case 2: System.out.println("8 of Hearts"); break;
                    case 3: System.out.println("8 of Spades"); break;
                } break;
            case 8:
                switch (ran) {
                    case 0: System.out.println("9 of Clubs"); break;
                    case 1: System.out.println("9 of Diamonds"); break;
                    case 2: System.out.println("9 of Hearts"); break;
                    case 3: System.out.println("9 of Spades"); break;
                } break;
            case 9:
                switch (ran) {
                    case 0: System.out.println("10 of Clubs"); break;
                    case 1: System.out.println("10 of Diamonds"); break;
                    case 2: System.out.println("10 of Hearts"); break;
                    case 3: System.out.println("10 of Spades"); break;
                } break;
            case 10:
                switch (ran) {
                    case 0: System.out.println("Jack of Clubs"); break;
                    case 1: System.out.println("Jack of Diamonds"); break;
                    case 2: System.out.println("Jack of Hearts"); break;
                    case 3: System.out.println("Jack of Spades"); break;
                } break;
            case 11:
                switch (ran) {
                    case 0: System.out.println("Queen of Clubs"); break;
                    case 1: System.out.println("Queen of Diamonds"); break;
                    case 2: System.out.println("Queen of Hearts"); break;
                    case 3: System.out.println("Queen of Spades"); break;
                } break;
            case 12:
                switch (ran) {
                    case 0: System.out.println("King of Clubs"); break;
                    case 1: System.out.println("King of Diamonds"); break;
                    case 2: System.out.println("King of Hearts"); break;
                    case 3: System.out.println("King of Spades"); break;
                } break;
            default:
                System.out.println();
        }
    }
}
