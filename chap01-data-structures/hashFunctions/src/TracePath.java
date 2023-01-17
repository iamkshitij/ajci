import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class TracePath {
    public static void main(String[] args) {
        HashMap<String,String> hMap = new HashMap<>();

        hMap.put("NewYork","Chicago");
        hMap.put("Boston","Texas");
        hMap.put("Missouri","NewYork");
        hMap.put("Texas","Missouri");

        String actual_output = tracePath(hMap);
        System.out.println(actual_output);
    }

    public static String tracePath(HashMap<String,String> map){
        String path = "";

        HashMap<String, String> reverseMap = new HashMap<>();

        // reverse the map and store it
        map.forEach((k,v)->{
            reverseMap.put(v,k);
        });

        // starting point of iternary

        String from = "";

        // check if graph is discontinued
        int count = 0;

        for (Map.Entry<String, String > entry: map.entrySet()) {
            if(!reverseMap.containsKey(entry.getKey())){
                count++;
                from = entry.getKey();
            }

        }

        // disconnected graph
        if (count>1) return "null";

        // trace complete path

        String to = map.get(from);
        while(to != null){
            path += from+" -> "+ to +", ";
            from = to;
            to = map.get(to);
        }

        return path;
    }
}
