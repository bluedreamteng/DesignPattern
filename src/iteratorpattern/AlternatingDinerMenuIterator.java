package iteratorpattern;

import java.util.Iterator;

/**
 * @author zhangtf
 * @date 2019-09-14 15:47
 */
public class AlternatingDinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position += 2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(
                "Altering Diner Menu Iterator does not support remove()"
        );
    }
}
