import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        StatsLibrary statsLib = new StatsLibrary();
//        System.out.println(statsLib.combination(52, 2));
//        System.out.println(statsLib.combination(4, 2));
//        System.out.println((statsLib.combination(4, 3)*(statsLib.combination(4,2))/statsLib.combination(52, 5)));
       // System.out.println(statsLib.combination(50, 3)/statsLib.permutation(4, 3));
        //System.out.println(statsLib.binomialDistribution(.75, 5,3)*100);
        ArrayList<Double> sd = new ArrayList();
        //, , , , , , ,
        sd.add(10.0);
        sd.add(12.0);
        sd.add(23.0);
        sd.add(23.0);
        sd.add(16.0);
        sd.add(23.0);
        sd.add(21.0);
        sd.add(16.0);
        System.out.println(statsLib.standardDeviation(sd));

//        Birthday birth = new Birthday();
//        birth.userInput();
//        MontyHall mh = new MontyHall();
//        mh.input();


    }

}
