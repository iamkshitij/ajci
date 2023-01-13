import java.util.Arrays;

public class MinimumPlatform {

    public static void main(String[] args) {
        int arrival[] = {900, 940, 950, 1100, 1500, 1800};
        int departure[] = {910, 1200, 1120, 1130, 1900, 2000};
        int answer  = minPlatformRequired(arrival, departure);
        System.out.println("Minimum Number of Platforms Required for Plan1 = " + answer);

        System.out.println();

        // Example 2
        int arrival1[] = {200, 210, 300, 320, 350, 500};
        int departure1[] = {230, 240, 320, 430, 400, 520};
        int answer2 = minPlatformRequired(arrival1, departure1);
        System.out.println("Minimum Number of Platforms Required for Plan2 = " + answer2);

    }

    public static int minPlatformRequired(int[] arrival, int[] departure){

        int platformNeeded = 1;
        int maxPlatform = 1;

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int noOfTrains = arrival.length;

        int i=1, j=0;

        while(i<noOfTrains && j<noOfTrains){
            if(arrival[i] < departure[j]){
                maxPlatform++;
                i++;
                if(maxPlatform > platformNeeded)
                    platformNeeded = maxPlatform;
            }else {
                maxPlatform--;
                j++;
            }
        }

        return platformNeeded;
    }
}
