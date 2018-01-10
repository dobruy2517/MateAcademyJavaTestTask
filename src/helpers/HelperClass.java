package helpers;

import java.util.concurrent.ThreadLocalRandom;

public class HelperClass {

    public int randomArrIndexInBound(int from, int to){
        int randomNum = ThreadLocalRandom.current().nextInt(from, to);
        return randomNum;
    }

    public int getMaxIntValueFromArray (int[] arr){
        int maxValue = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

}
