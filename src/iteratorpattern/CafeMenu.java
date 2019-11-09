package iteratorpattern;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * 咖啡厅菜单实现menu接口
 * @author zhangtf
 * @date 2019-09-14 10:22
 */
public class CafeMenu implements Menu{
    /**
     * 表单项用散列表存储
     */
    Hashtable menuItems = new Hashtable();

    /**
     * 菜单项在构造器中初始化
     */
    public CafeMenu() {
        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast", true, 2.99);

        addItem("Regualr Pancake Breakfast",
                "Pancakes with fried eggs, sausage", false, 3.49);

        addItem("Blueberry Pancakes",
                "Panckes made with fresh blueberries", true, 3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries", true, 3.59);

    }

    /**
     * 创建新的菜单项，并将它加入到菜单项散列表中
     * @param name
     * @param description
     * @param vegetarian
     * @param price
     */
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        //key时项目名称， 值是菜单项
        menuItems.put(menuItem.getName(), menuItem);
    }

    /**
     * 这个方法可以去掉
     * @return
     */
    public Hashtable getMenuItems() {
        return menuItems;
    }

    /**
     * 我们在这里实现了createIterator方法，我们这里不是取得整个HashTable的迭代器，而是取得值得部分得迭代器
     * @return
     */
    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
