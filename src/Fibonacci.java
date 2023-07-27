import java.util.ArrayList;

public class Fibonacci {

    public static String getResult(ArrayList<double[]> array, double price, boolean inMarket, double entryPrice) {

        if (array.size() >= 300) {

            int fibPeriod = 20;

            ArrayList<double[]> array1 = new ArrayList<>(array.subList(array.size() - fibPeriod, array.size()));

            double high = Utils.getHigh(Utils.convertTo1D(array1, 2));
            double low = Utils.getLow(Utils.convertTo1D(array1, 3));
            double[] fibLevels = Utils.calculateFib(high, low);

            double[] latestCandle = array.get(array.size()-1);
            double time = latestCandle[4];
            double newLow = latestCandle[3];

            //System.out.println("-----" + latestCandle[0] + "  " + latestCandle[1]);
            int stopLossIndex = Utils.getStopLossIndex(entryPrice, time, 0, 5);
            //double stopLossPrice = simulator.bitmexHist1m[stopLossIndex][1];
            //double stopLossTime = simulator.bitmexHist1m[stopLossIndex][4];

            if (stopLossIndex > 0 && inMarket) {
                //return "sell" + "_" + stopLossPrice + "_" + stopLossTime;
            }

            if (newLow == low) {
                //buy
                return "buy" + "_" + price + "_" + time;
            } else if (price >= fibLevels[2]) {
                //sell
                return "sell" + "_" + price + "_" + time;

            }
            else {
                return "null_0_0";
            }


        } else {
            return "null_0_0";
        }

    }

}