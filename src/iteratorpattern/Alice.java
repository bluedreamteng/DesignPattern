package iteratorpattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 女招待
 * @author zhangtf
 * @date 2019-09-08 22:47
 */
public class Alice {
    PencakeHouseMenu pencakeHouseMenu = new PencakeHouseMenu();
    /**
     * 早餐项在ArrayList中
     */
    ArrayList breakfastItems = pencakeHouseMenu.getMenuItems();

    DinerMenu dinerMenu = new DinerMenu();
    /**
     * 午餐项在数组中
     */
    MenuItem[] lunchItems = dinerMenu.getMenuItems();

    public void printMenu() {
        //我们必须实现两个不同的循环，分别处理两个不同的菜单

        //处理ArrayList的循环
        for(int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = (MenuItem) breakfastItems.get(i);
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription()+" ");
        }

        //处理数组的循环
        for(int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription()+" ");
        }
    }
}
