public class Main{
    public static void main(String[] args){
        double pop = 312032486;
        double seconds = 365*24*60*60;
        System.out.println("1 year later: "+ pop+pop/7+pop/45-pop/13);
        pop = pop+seconds/7+seconds/45-seconds/13;
        System.out.println("2 years later: "+ pop+pop/7+pop/45-pop/13);
        pop = pop+seconds/7+seconds/45-seconds/13;
        System.out.println("3 years later: "+ pop+pop/7+pop/45-pop/13);
        pop = pop+seconds/7+seconds/45-seconds/13;
        System.out.println("4 years later: "+ pop+pop/7+pop/45-pop/13);
        pop = pop+seconds/7+seconds/45-seconds/13;
        System.out.println("5 years later: "+ pop+pop/7+pop/45-pop/13);
        pop = pop+seconds/7+seconds/45-seconds/13;
    }
}
