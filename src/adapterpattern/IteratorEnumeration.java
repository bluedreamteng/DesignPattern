package adapterpattern;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author zhangtf
 * @date 2019-09-01 07:24
 */
public class IteratorEnumeration implements Enumeration {
    private Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }

    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("zhangtf");
        list.add("wumeng");
        list.add("brother");
        IteratorEnumeration iteratorEnumeration = new IteratorEnumeration(list.iterator());
        while(iteratorEnumeration.hasMoreElements()) {
            System.out.println(iteratorEnumeration.nextElement());
        }
    }
}
