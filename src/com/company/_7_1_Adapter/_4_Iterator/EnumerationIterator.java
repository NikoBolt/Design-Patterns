package com.company._7_1_Adapter._4_Iterator;

public class EnumerationIterator implements Iterator<Object> {
    Enumeration<?> enumeration;
    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.netElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
