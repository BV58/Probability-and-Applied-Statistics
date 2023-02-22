import java.util.ArrayList;
import java.util.Collections;

public class SetOperations {


    //Should combine both subsets without repetition
    public ArrayList<Double> union(ArrayList<Double> subsetA, ArrayList<Double> subsetB) {
        ArrayList<Double> unionArr = new ArrayList<>();
        unionArr.addAll(subsetA);
        for (double num : subsetB){
            if (unionArr.contains(num) == false){
                unionArr.add(num);
            }
        }
        Collections.sort(unionArr);
        return unionArr;
    }

    //Should find all elemements that are in both subsetA and subsetB and return that in an arrayList
    public ArrayList<Double> intersects(ArrayList<Double> subsetA, ArrayList<Double> subsetB) {
        ArrayList<Double> intersectArr = new ArrayList<>();
        for (double num1 : subsetA){
            if (subsetB.contains(num1)){
                intersectArr.add(num1);
            }
        }
        Collections.sort(intersectArr);
        return intersectArr;
    }

    //Should find all numbers that are not in subSet that are in fullSet and return that arrayList
    public ArrayList<Double> compliment(ArrayList<Double> fullSet, ArrayList<Double> subSet) {
        ArrayList<Double> complimentArr = new ArrayList<>();
        for (double num1 : fullSet){
            if (subSet.contains(num1) == false){
                complimentArr.add(num1);
            }
        }
        return complimentArr;
    }
}


