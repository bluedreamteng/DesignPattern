package iteratorpattern;

/**
 * @author zhangtf
 * @date 2019-09-08 16:11
 */
public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    /**
     * 菜单项包含了名称，叙述，是否为素食的标志，还有价格。将这些值传入构造器来初始化这个菜单项
     * @param name
     * @param description
     * @param vegetarian
     * @param price
     */
    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
