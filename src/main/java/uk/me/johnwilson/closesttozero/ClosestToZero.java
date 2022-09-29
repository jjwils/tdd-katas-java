package uk.me.johnwilson.closesttozero;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ClosestToZero {

    private Set<Integer> list = new HashSet<>();
    public boolean add(int i) {
       return list.add(i);
    }

    public int getSize() {
        return list.size();
    }

    public int getClosestToZero() {
        int closestNegativeValue;
        int closestPositiveValue;

        closestNegativeValue = list
            .stream()
            .filter(val -> val < 0)
            .map(obj -> obj * -1)
            .sorted()
            .collect(Collectors.toList())
            .get(0);

        closestPositiveValue = list
            .stream()
            .filter(val -> val > 0)
            .sorted()
            .collect(Collectors.toList())
            .get(0);
        if(closestNegativeValue == closestPositiveValue) {
            return closestPositiveValue;
        }
        return closestPositiveValue < closestNegativeValue ? closestPositiveValue : closestNegativeValue * -1;

    }
}
