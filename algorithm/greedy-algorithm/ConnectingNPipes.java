import java.util.Arrays;

public class ConnectingNPipes {

        public static void main(String[] args) {
            int[] input = {70,59,41, 42, 75};
            int res = minCost(input);
            System.out.println(res);
        }
    

        public static int minCost(int[] pipes){
            int cost = 0;

            int sizeOfPipes = pipes.length;
      
            Arrays.sort(pipes);
            int[] storeage = new int[sizeOfPipes];
            int sum = 0;
            for(int i=0;i<sizeOfPipes;i++){
              sum = sum + pipes[i];
              storeage[i] = sum;
              System.out.println("sum-->"+sum);
            }
            System.out.println(Arrays.toString(storeage));
      
            for(int i=1;i<storeage.length;i++){
              cost = cost + storeage[i];
              System.out.println("cost-->"+cost);
            }
          
            return cost;
        }

        public static int minCostII(int[] pipes){
        int cost = 0;
        int n = pipes.length;
        Arrays.sort(pipes);
        for (int i = 0; i < n - 1; i++) {
            int prev_cost = cost;
            cost = (pipes[i] + pipes[i + 1]);
            pipes[i + 1] = cost;
            cost = cost + prev_cost;
        }
        return cost;
        }
}
