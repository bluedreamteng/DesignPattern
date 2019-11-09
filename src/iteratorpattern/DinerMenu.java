package iteratorpattern;

import java.util.Iterator;

/**
 * 餐厅菜单实现
 * @author zhangtf
 * @date 2019-09-08 20:53
 */
public class DinerMenu implements Menu{

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;

    /**
     * 采用不同的方法，他使用的是一个数组，所以可以控制菜单的长度。
     * 并且在取出菜单项的时候不需要转型
     */
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast", true, 2.99);

        addItem("Regualr Pancake Breakfast",
                "Pancakes with fried eggs, sausage", false, 3.49);

        addItem("Blueberry Pancakes",
                "Panckes made with fresh blueberries", true, 3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries", true, 3.59);

    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    //还有很多方法依赖于这个数组

    /**
     * 返回迭代器接口，客户不需要知道餐厅菜单是如何维护菜单项的，也不需要知道迭代器是如何实现的。
     * 客户只需直接使用这个迭代器遍历菜单项即可。
     * @return
     */
    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
