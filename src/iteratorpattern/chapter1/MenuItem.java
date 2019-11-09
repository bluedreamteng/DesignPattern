package iteratorpattern.chapter1;

import java.util.Iterator;

/**
 * 首先需要拓展MenuComponent接口
 * @author zhangtf
 * @date 2019-09-15 12:09
 */
public class MenuItem extends MenuComponent{
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * 这和之前的实现不一样，在MenuComponent类里我们覆盖了print()方法。
     * 对菜单项来说，此方法会打印出完整的菜单项条目，包括：名字，描述，价格，以及是否为素食。
     */
    @Override
    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("       --" + getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
