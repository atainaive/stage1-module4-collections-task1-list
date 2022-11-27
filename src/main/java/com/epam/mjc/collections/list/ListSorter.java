package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int numberA = Integer.parseInt(a);
        int numberB = Integer.parseInt(b);

        int funcA = 5 * numberA*numberA +3;
        int funcB = 5 * numberB*numberB +3;

        return funcA == funcB ? numberA - numberB : funcA - funcB;
    }
}
