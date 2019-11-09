package iteratorpattern.chapter1;

import java.util.Iterator;

/**
 * @author zhangtf
 * @date 2019-09-15 18:29
 */
public class Waitress {
    /**
     * 现在我们只要将最顶层的菜单组件交给她就可以了，
     * 最顶层菜单包含其它所有菜单，我们称之为allMenus
     */
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    /**
     * 只需要调用最顶层菜单的print()就可以打印出整个菜单层次，
     * 包括所有菜单及所有菜单项
     */
    public void printMenu() {
        allMenus.print();
    }

    /**
     * 取得allMenu's的组合并得到它的迭代器来作为我们的CompositeIterator
     */
    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\n VEGETARIAN MENU \n ----");
        //遍历组合内的每个元素
        while (iterator.hasNext()) {
            MenuComponent menuComponent =
                    (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
                //我们在菜单上实现isVegetarian()方法，让它永远抛出异常，
                // 如果异常真发生了，我们就捕捉这个异常，然后再继续遍历
            } catch (UnsupportedOperationException e) {
            }
        }

    }
}
