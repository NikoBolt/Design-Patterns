package com.company._9_2_composite._4_Ierator;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {

    @Override
    public MenuComponent next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    /*
	 * No longer needed as of Java 8
	 *
	 * (non-Javadoc)
	 * @see java.util.Iterator#remove()
	 *
	public void remove() {
		throw new UnsupportedOperationException();
	}
	*/
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
