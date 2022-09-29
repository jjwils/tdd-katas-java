package uk.me.johnwilson.closesttozero;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClosestToZero {

    private Set<Integer> list = new HashSet<>();
    public boolean add(int i) {
       return list.add(i);
    }

    public int getSize() {
        return list.size();
    }
}
