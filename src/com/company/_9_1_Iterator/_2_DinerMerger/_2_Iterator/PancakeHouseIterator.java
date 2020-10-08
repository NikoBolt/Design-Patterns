package com.company._9_1_Iterator._2_DinerMerger._2_Iterator;

import java.util.ArrayList;
//import java.util.List;

public class PancakeHouseIterator implements Iterator {
    ArrayList<MenuItem> items;
//    List<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(/*List*/ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public Object /*MenuItem*/ next() {
        /*
		MenuItem item = items.get(position);
		position = position + 1;
		return item;
		*/
        // or shorten to:
        return items.get(position++);
    }

    @Override
    public boolean hasNext() {
        /*
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
		*/
        // or shorten to:
        return items.size() > position;
    }
}
