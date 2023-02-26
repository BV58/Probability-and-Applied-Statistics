import java.util.ArrayList;
import java.util.Collections;

public class StatsLibrary {

    //method for mean
    /**
     *
     * @param input - Takes a Double ArrayList as a parameter
     * @return
     */
    public double mean(ArrayList<Double> input) {
        double total = 0;
        for( double num : input) total += num;
        return total/input.size();
    }

    //method for median
    /**
     * @param input - Takes a Double ArrayList as a parameter
     * Takes the input parameter and returns the median of the input array.
     * @return
     */
    public double median(ArrayList<Double> input) {
        Collections.sort(input);
        if (input.size() % 2 != 0) {
            return input.get(input.size()/2);
        }else {
            return (input.get((input.size()+1)/2)+input.get((input.size()-1)/2))/2;
        }
    }

    //method for mode
    public String mode(ArrayList<Double> input) {
        double mode = 0;
        double modeNumber = -1;
        for (double num : input) {
            double temp = Collections.frequency(input, num);
            if (temp > mode) {
                mode = temp;
                num = modeNumber;
            }else if (num != modeNumber && temp == mode) {
                modeNumber = 0;
            }
        }
        if (modeNumber == 0 || modeNumber == -1) {
            return "Could not find mode.";
        }else return Double.toString(modeNumber);

    }

    //method for standardDeviation(arraylist)
    public double StandardDeviation(ArrayList<Double> input) {

        return (Double) null;
    }

    public double combination(double n, double r){
        double nMinusR = 1;
        for (int i = 1; i <= n-r; i++){
            nMinusR *= i;
        }
        return factorial(n)/(factorial(r) * nMinusR);
    }

    public double permutation(double n, double r){
        double nMinusR = 1;
        for (int i = 1; i <= n-r; i++){
            nMinusR *= i;
        }

        return factorial(n)/nMinusR;
    }

    public double factorial(double n){
        double nFactorial = 1;
        for (double i = 1; i <= n; i++){
            nFactorial *= i;
        }
        return nFactorial;
    }

}

