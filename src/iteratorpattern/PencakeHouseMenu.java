package iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 煎饼屋实现
 * @author zhangtf
 * @date 2019-09-08 16:17
 */
public class PencakeHouseMenu implements Menu{

    /**
     * 使用ArrayList存储菜单项
     */
    ArrayList menuItems;

    /**
     * 在构造器中，每一个菜单项都会被加入到ArrayList中
     */
    public PencakeHouseMenu() {
        menuItems = new ArrayList();

        //每一个菜单项都有一个名称，一个叙述，是否为素食项，还有价格
        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast", true, 2.99);

        addItem("Regualr Pancake Breakfast",
                "Pancakes with fried eggs, sausage", false, 3.49);

        addItem("Blueberry Pancakes",
                "Panckes made with fresh blueberries", true, 3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name,description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }

    //还有许多其它的地方依赖于ArrayList,所以他不希望重写所有的代码
}
