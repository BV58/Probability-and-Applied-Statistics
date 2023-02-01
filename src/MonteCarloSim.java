public class MonteCarloSim {
//game is pick one of 3 doors, one of which is a success.
    public static void main(String[] args) {

        int total = 0;
        for (int i=0; i <=10000; i++){
            total = monteCarlo();
        }
        System.out.println("Win Percentage: "+total/10000);
    }

    public static int monteCarlo(){
        return 0;
    }

}
