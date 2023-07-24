import java.util.ArrayList;
public class Utils {

    public static double getHigh (ArrayList<Double> array) {
        double high = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            double close = array.get(i);
            if (close > high) {
                high = close;
            }
        }
        return high;
    }

    public static double getLow (ArrayList<Double> array) {
        double low = array.get(0);

        for (int i = 0; i < array.size(); i++) {
            double close = array.get(i);
            if (close < low) {
                low = close;
            }
        }
        return low;
    }

    public static double[] ppHighCalculate(ArrayList<double[]> ppArray, int ppPeriod) {
        boolean newPPhigh = false;
        //test ppHigh
        for (int i = 0; i < ppArray.size(); i++) {
            if (i != ppPeriod) {
                if (ppArray.get(i)[2] < ppArray.get(ppPeriod)[2]) {
                    newPPhigh = true;
                } else {
                    newPPhigh = false;
                    break;
                }
            }
        }

        if (newPPhigh == true) {
            return ppArray.get(ppPeriod);
        } else {
            return null;
        }
    }

    public static double[] ppLowCalculate(ArrayList<double[]> ppArray, int ppPeriod) {
        boolean newPPLow = false;
        //test ppHigh
        for (int i = 0; i < ppArray.size(); i++) {
            if (i != ppPeriod) {
                if (ppArray.get(i)[3] >= ppArray.get(ppPeriod)[3]) {
                    newPPLow = true;
                } else {
                    newPPLow = false;
                    break;
                }
            }
        }

        if (newPPLow == true) {
            return ppArray.get(ppPeriod);
        } else {
            return null;
        }
    }

    public static double calculateMovingAverage(ArrayList<Double> array) {
        double sum = 0;
        sum = array.stream()
                .mapToDouble(a -> a)
                .sum();
        double movingAverage = sum / (array.size());
        return movingAverage;
    }

    public double calculateStdev(ArrayList<Double> array) {
        double average = calculateMovingAverage(array);
        double squaredSum = 0;

        for (int i = 0; i < array.size(); i++) {
            double close = array.get(i);
            squaredSum = Math.pow(close - average, 2) + squaredSum;
        }

        double stdev = Math.sqrt(squaredSum);
        return stdev;

    }

    public static double[] calculateFib(double High, double Low) {
        double diff = High - Low;
        double level1 = High - (0.50 * diff);
        double level2 = High - (0.618 * diff);
        double level3 = High - (0.786 * diff);

        double[] levels = {level1, level2, level3};
        return levels;
    }


}