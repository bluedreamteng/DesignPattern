package iteratorpattern.chapter1;

/**
 * @author zhangtf
 * @date 2019-09-15 18:35
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        //先创建所有的菜单对象
        MenuComponent pancakeHouseMenu =
                new Menu("PancakeHouseMenu", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("Diner Menu", "Lunch");
        MenuComponent cafeMenu =
                new Menu("Caffe Menu", "Dinner");
        MenuComponent dessertMenu =
                new Menu("Dessert Menu", "Dessert of course");
        //我们需要一个最顶层的菜单，将它称为 allMenus
        MenuComponent allMenus = new Menu("All Menus", "All menus combined");
        //利用组合的add方法，将每个菜单都加入到顶层菜单allMenus中
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem(
                "Pasta",
                "spaghtti with marinara sauce, and a slice of sourdough bread",
                true,
                3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                true,
                1.59));

        //加入更多菜单项

        //我们将整个菜单层次构建完毕后交给女招待，然后由女招待将整份菜单打印出来
        Waitress waitress = new Waitress(allMenus);
        waitress.printVegetarianMenu();
    }
}
