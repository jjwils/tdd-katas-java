package uk.me.johnwilson.closesttozero;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(1, closestToZero.getSize());
    }

    @Test
    public void givenTheSameTwoIntsShouldReturnSizeOne(){
        ClosestToZero closestToZero = new ClosestToZero();
        closestToZero.add(9);
        closestToZero.add(9);
        assertEquals(1, closestToZero.getSize());
    }

    @Test
    public void givenAListOfIntegersWhereNegativeValueIsclosestShouldReturnTheClosestToZero(){
        ClosestToZero closestToZero = new ClosestToZero();
        closestToZero.add(-1);
        closestToZero.add(2);
        closestToZero.add(-4);
        assertEquals(-1, closestToZero.getClosestToZero());
    }

    @Test
    public void givenAListOfIntegersWherePositiveValueIsClosestShouldReturnTheClosestToZero(){
        ClosestToZero closestToZero = new ClosestToZero();
        closestToZero.add(1);
        closestToZero.add(2);
        closestToZero.add(-4);
        assertEquals(1, closestToZero.getClosestToZero());
    }


    @Test
    public void givenANegativeAndPositiveValueIsEqualShouldReturnThePositiveValue(){
        ClosestToZero closestToZero = new ClosestToZero();
        closestToZero.add(-2);
        closestToZero.add(2);
        assertEquals(2, closestToZero.getClosestToZero());
    }



}
