package com.company._9_1_Iterator._2_DinerMerger._2_Iterator._upd;

import java.util.ArrayList;
import com.company._9_1_Iterator._2_DinerMerger._2_Iterator.Iterator;
import com.company._9_1_Iterator._2_DinerMerger._2_Iterator.MenuItem;

public class ArrayListIterator implements Iterator {
	ArrayList<MenuItem> items;
	int position = 0;
 
	public ArrayListIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}
 
	public MenuItem next() {
		MenuItem item = items.get(position);
		position = position + 1;
		return item;
	}
 
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}
