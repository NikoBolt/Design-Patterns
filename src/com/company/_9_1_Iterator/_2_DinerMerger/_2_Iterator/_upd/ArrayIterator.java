package com.company._9_1_Iterator._2_DinerMerger._2_Iterator._upd;

import com.company._9_1_Iterator._2_DinerMerger._2_Iterator.Iterator;
import com.company._9_1_Iterator._2_DinerMerger._2_Iterator.MenuItem;

public class ArrayIterator implements Iterator {
	MenuItem[] items;
	int position = 0;
 
	public ArrayIterator(MenuItem[] items) {
		this.items = items;
	}
 
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}
 
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}
