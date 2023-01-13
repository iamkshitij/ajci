import java.util.ArrayList;

public class MaxThief {

    public static void main(String[] args) {
        int k;

        char[] policeThiefArray = {'P', 'T', 'T', 'P', 'T'};
        k = 2;

        System.out.println("Maximum thieves caught for {P, T, T, P, T}: " + MaxThief.policeCatchThief(policeThiefArray,k));

        char[] policeThiefArray1 = {'T', 'T', 'P', 'P', 'T', 'P'};
        k = 2;

        System.out.println("Maximum thieves caught for {T, T, P, P, T,P}: " + MaxThief.policeCatchThief(policeThiefArray1, k));

    }

    public static int policeCatchThief(char[] arr, int k ){
        int result = 0;
        ArrayList<Integer> police = new ArrayList<>();
        ArrayList<Integer> thieves = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 'P')
                police.add(i);
            else
                thieves.add(i);
        }

        int thievesCount=0, policeCount=0;

        while(thievesCount < thieves.size() && policeCount < police.size()){

            if(Math.abs(thieves.get(thievesCount) - police.get(policeCount)) <= k){
                result++;
                thievesCount++;
                policeCount++;
            }
            else if (thieves.get(thievesCount) < police.get(policeCount)) thievesCount++;
            else policeCount++;


        }
        return  result;
    }

}
