/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata03;

public class Kata03 {

    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("hotmail.com");
        histogram.increment("google.com");
        histogram.increment("google.com");
        histogram.increment("google.com");
        histogram.increment("google.com");
        new HistogramDisplay(histogram).execute();
    }
    
}
