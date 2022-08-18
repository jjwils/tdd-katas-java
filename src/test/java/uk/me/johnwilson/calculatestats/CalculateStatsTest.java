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

        assertEquals(6, calculateStats.numberofElements());
    }




}
