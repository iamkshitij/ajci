import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;

public class FractionalKnapsack {

    public static void main(String[] args) {
        DecimalFormat decimal = new DecimalFormat("#.##"); // this class rounds off the double upto 2 decimal places

        double[] weights = {2, 1, 6, 0.5, 0.25, 7};
        double[] values = {50, 70, 100, 50, 30, 99};
        int capacity = 10;

        double maxValue = maxWeight(weights, values, capacity);
        System.out.println("Maximum value we can obtain = " + decimal.format(maxValue));

    }

    int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

    public static double maxWeight(double[] w,double[] v, int k){
        double result = 0d;
        double[] vwRatio = new double[w.length];
        for (int i = 0; i < w.length; i++) {
            vwRatio[i] = v[i]/w[i];
        }

//        Arrays.sort(vwRatio);
        double[] descRatio = Arrays.stream(vwRatio).boxed()
                .sorted(Collections.reverseOrder())
                .mapToDouble(Double::doubleValue)
                .toArray();

        for (int i = 0; i < descRatio.length; i++) {
            if(descRatio[i]<k)
                result = result+descRatio[i];
        }
        return result;
    }

}
