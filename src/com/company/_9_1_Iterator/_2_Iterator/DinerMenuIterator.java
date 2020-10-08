package com.company._9_1_Iterator._2_Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem [] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public Object /*MenuItem*/ next() {
        /*
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
		*/

        // or shorten to
        return items[position++];
    }

    @Override
    public boolean hasNext() {
        /*
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
		*/

        // or shorten to
        return items.length > position;
    }
}
