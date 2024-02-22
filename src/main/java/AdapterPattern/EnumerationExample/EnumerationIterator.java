package AdapterPattern.EnumerationExample;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {

    Enumeration<Integer> enumeration;

    public EnumerationIterator(Enumeration<Integer> enumeration){
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
