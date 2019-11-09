package iteratorpattern;

//首先导入这个类，我们需要实现这个接口
import java.util.Iterator;

/**
 * @author zhangtf
 * @date 2019-09-09 06:53
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    /**
     * position 记录当前数组遍历的位置
     */
    int position = 0;

    /**
     * 构造器需要被传入一个菜单项的数组当作参数
     * @param menuItems
     */
    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    /**
     * hasNext()方法为我们检查是否已经取得数组内的全部元素，如果还有元素待遍历，则返回true
     * @return
     */
    @Override
    public boolean hasNext() {
        //因为使用的是固定长度的数组，所以我们不但要检查是否超出了数组长度，
        //也必须检查是否下一项为null,如果是null，就表示没有其它项了
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * next()方法返回数组的下一项，并递增其位置
     * @return
     */
    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    /**
     * 我们需要实现remove()方法，因为使用的是固定长度的数组，所以在remove()被调用时
     * 我们将后面的所有元素，往前移动一个位置
     */
    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("You can't remove an item until you have done at least one next()");
        }
        if (menuItems[position-1] != null) {
            for (int i = position - 1; i < (menuItems.length-1); i++) {
                menuItems[i] = menuItems[i+1];
            }
            menuItems[menuItems.length-1] = null;
        }
    }
}
