package Model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histogram {
    private final Map<Integer, Integer> counts = new HashMap();

    public Histogram(int ... values) {
        for(int value: values)
            counts.put(value, counts.getOrDefault(value, 0) +1);
    }

    public Set<Integer> getValues(){
        return counts.keySet();
    }
    
    public int getCounts(int value) {
        return counts.get(value);
    }
    
}
