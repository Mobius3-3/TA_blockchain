package math;
import java.lang.Math;
import java.util.Arrays;

public class mean_std {
    public static void main(String[] args) {
        double mylist[] = {1,2,3,4,5,6};
        System.out.println(calculateSD(mylist));
    }
    public static double calculateSD(double numArray[])
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = numArray.length;
        for(double num : numArray) {
            sum += num;
        }
        double mean = sum/length;
        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation/length);
    }
}
