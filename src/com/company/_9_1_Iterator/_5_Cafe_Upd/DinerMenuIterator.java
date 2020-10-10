package com.company._9_1_Iterator._5_Cafe_Upd;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.list = items;
    }

    @Override
    public MenuItem next() {
        /*
		MenuItem menuItem = list[position];
		position = position + 1;
		return menuItem;
		*/

        // or shorten to
        return list[position++];
    }

    @Override
    public boolean hasNext() {
        /*
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
		*/

        // or shorten to
        return list.length > position;
    }

    // Элементы просто сдвигаются на одну позицию
    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("You can't remove an itemuntil you've done at least one next()");
        }
        if (list[position-1] != null) {
            for (int i = position - 1; i < (list.length - 1 ); i++) {
                list[i] = list[i+1];
            }
            list[list.length - 1] = null;
        }
    }
}
