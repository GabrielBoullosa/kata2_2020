package Main;

import Model.Histogram;
import View.HistogramDisplay;

public class Main {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(3,2,1,5,7,8,3,7,33,2,5,7,3,3,3,1);
        HistogramDisplay display = new HistogramDisplay(histogram);
        display.execute();
    }
}
