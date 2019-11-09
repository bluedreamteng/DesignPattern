package iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zhangtf
 * @date 2019-09-14 15:59
 */
public class RdWaitress {
    ArrayList menus;

    public RdWaitress(ArrayList menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator menuIterator = menus.iterator();
        while(menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription()+" ");
        }
    }
}
