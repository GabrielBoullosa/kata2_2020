package View;

import Model.Histogram;

public class HistogramDisplay {
    private final Histogram histogram;

    public HistogramDisplay(Histogram histogram) {
        this.histogram = histogram;
    }
    
    public void execute(){
        for(int value: histogram.getValues())
            System.out.println(value + " "+ histogram.getCounts(value));
    }
}
