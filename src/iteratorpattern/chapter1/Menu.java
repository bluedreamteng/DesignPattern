package iteratorpattern.chapter1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zhangtf
 * @date 2019-09-15 17:49
 */
public class Menu extends MenuComponent {
    /**
     * 菜单可以有任意数目的孩子，这些孩子都必须属于MenuComponent类型
     * 我们使用内部的ArrayList记录他们
     */
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    /**
     * 我们将给每个菜单一个名字和一个描述
     * @param name
     * @param description
     */
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * 我们在这里将菜单项和其它菜单加入到菜单中，因为菜单和菜单项都是MenuComponent,
     * 所以我们只需用一个方法就可以两者兼顾
     * @param menuComponent
     */
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    /**
     * 打印菜单的名称和描述
     */
    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("----------------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
