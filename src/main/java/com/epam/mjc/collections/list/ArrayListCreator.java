package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrayList = new ArrayList<>();

        int index = 1;

        for (String s : sourceList) {
            if (index % 3 == 0) {
                arrayList.add(s);
                arrayList.add(s);
            }
            index++;
        }

        return arrayList;
    }
}
