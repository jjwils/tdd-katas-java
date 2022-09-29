package uk.me.johnwilson.closesttozero;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClosestToZeroTest {

    @Test
    public void add(){
        ClosestToZero closestToZero = new ClosestToZero();
        Assertions.assertTrue(closestToZero.add(1));
    }

    @Test
    public void givenIntIsAddedReturnCorrectSize(){
        ClosestToZero closestToZero = new ClosestToZero();
        closestToZero.add(9);
        Assertions.assertEquals(1, closestToZero.getSize());
    }

    @Test
    public void givenTheSameTwoIntsShouldReturnSizeOne(){
        ClosestToZero closestToZero = new ClosestToZero();
        closestToZero.add(9);
        closestToZero.add(9);
        Assertions.assertEquals(1, closestToZero.getSize());
    }


}
