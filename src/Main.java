import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        StatsLibrary statsLib = new StatsLibrary();
        ArrayList<Double> doubleArray = new ArrayList<>();
        for (double i = 0; i <=5; i++) doubleArray.add(i);
        System.out.println("Array: "+doubleArray);
        //System.out.println("Mean: ");
        //System.out.println("Median: "+statsLib.median(doubleArray));
        System.out.println("Mode: "+statsLib.mode(doubleArray));
    }

}
