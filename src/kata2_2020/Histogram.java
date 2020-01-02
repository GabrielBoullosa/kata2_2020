package kata2_2020;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final Map<Integer, Integer> counts = new HashMap();

    public Histogram(int ... values) {
        for(int value: values)
            counts.put(value, counts.getOrDefault(value, 0) +1);
    }
    
    
}
