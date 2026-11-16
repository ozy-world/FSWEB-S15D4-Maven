package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList<String> {

    @Override
    public boolean add(String element) {
        if (contains(element)) {
            return false;
        }
        return super.add(element);
    }

    public void sort() {
        Collections.sort(this);
    }

    public boolean remove(String element) {
        return super.remove(element);
    }
}
