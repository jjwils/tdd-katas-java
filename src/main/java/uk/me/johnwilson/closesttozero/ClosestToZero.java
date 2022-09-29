package uk.me.johnwilson.closesttozero;

import java.util.ArrayList;
import java.util.List;

public class ClosestToZero {

    private List<Integer> list = new ArrayList<>();
    public boolean add(int i) {
       return list.add(i);
    }

    public int getSize() {
        return list.size();
    }
}
