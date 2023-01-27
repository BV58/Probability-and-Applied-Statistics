
public class MeanFinder {

    private double inputArray[];

    public MeanFinder(double[] input) {
        inputArray = input;
    }

    public double findMean() {
        double mean = 0;

        for(double number : inputArray) {
            mean += number;
        }
        mean = mean/inputArray.length;
        return mean;
    }

}
