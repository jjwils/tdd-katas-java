package uk.me.johnwilson.calculatestats;

public class CalculateStats {
    private int[] array;


    public int numberofElements() {
        int total = 0;

        try {
            int i = 0;
            while(true) {
                //  if !(this.array[total] == null) break;
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
}
