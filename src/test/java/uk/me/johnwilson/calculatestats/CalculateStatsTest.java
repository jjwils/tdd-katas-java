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
    }




}
