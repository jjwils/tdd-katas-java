package uk.me.johnwilson.closesttozero;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClosestToZeroTest {

    @Test
    public void add(){
        ClosestToZero closestToZero = new ClosestToZero();
        Assertions.assertTrue(closestToZero.add(1));


    }


}
