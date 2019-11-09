package iteratorpattern.chapter1;

import java.util.Iterator;

/**
 * @author zhangtf
 * @date 2019-09-15 23:07
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
