package uk.me.johnwilson.calculatestats;

public class CalculateStats {
    private int[] array;


    public int numberofElements() {
        int total = 0;

        try {
            int i = 0;
            while(true) {
                total++;

                int tmp = array[++i];
            }

        } catch(Exception e) {

        }

        return total;
    }

    public void setarray(int[] array) {
    this.array = array;

    }

    public double mean() {


        int total = 0;

        for (int i = 0; i < this.numberofElements(); i++) {
            total += array[i];
        }

        float result = total / (float)this.numberofElements();

        return Math.floor(result*1000000)/1000000;


    }
}
