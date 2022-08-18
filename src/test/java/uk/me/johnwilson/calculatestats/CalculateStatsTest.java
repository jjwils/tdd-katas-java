package uk.me.johnwilson.calculatestats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateStatsTest {

    @Test
    void testtest(){
        assertEquals(1,1);
    }


    @Test
    void numberOfElements(){

        CalculateStats calculateStats = new CalculateStats();
        int[] array = new int[]{6, 9, 15, -2, 92, 11, 13};
        calculateStats.setarray(array);

        assertEquals(7, calculateStats.numberofElements());

        int[] array2 = new int[]{6, 9, 15, -2};
        calculateStats.setarray(array2);

        assertEquals(4, calculateStats.numberofElements());

        int[] array3 = new int[]{100};
        calculateStats.setarray(array3);

        assertEquals(1, calculateStats.numberofElements());

    }

    @Test
    void mean(){
        CalculateStats calculateStats = new CalculateStats();
        int[] array = new int[]{6, 9, 15, -2, 92, 11};
        calculateStats.setarray(array);
        assertEquals(21.833334,calculateStats.mean());


        int[] array2 = new int[]{1, 2, 3};
        calculateStats.setarray(array2);
        assertEquals(2.0,calculateStats.mean());
    }


}
