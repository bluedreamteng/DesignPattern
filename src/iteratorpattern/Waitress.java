package iteratorpattern;

import java.util.Iterator;

/**
 * @author zhangtf
 * @date 2019-09-09 07:27
 */
public class Waitress {
    Menu pencakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    /**
     * 在构造器中，女招待照顾两个菜单
     * @param pencakeHouseMenu
     * @param dinerMenu
     */
    public Waitress(Menu pencakeHouseMenu, Menu dinerMenu, CafeMenu cafeMenu) { //将具体类改为Menu接口
        this.pencakeHouseMenu = pencakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    /**
     * 这个printMenu方法为每一个菜单各自创建一个迭代器
     */
    public void printMenu() {
        Iterator panckeIterator = pencakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();

        System.out.println("Menu\n----\nbreakfast");
        //然后对每个迭代器调用重载的printMenu(),将迭代器传入
        printMenu(panckeIterator);
        System.out.println("\n Lunch");
        printMenu(dinerIterator);
        System.out.println("\n Dinner");
        printMenu(cafeIterator);
    }

    /**
     * 这个重载的printMenu方法，使用迭代器，来遍历菜单项并打印出来
     * @param iterator
     */
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription()+" ");
        }
    }
}
