package decoratorPattern;

/**
 * @description:
 * @author: zhangtf
 * @create: 2019-07-20 12:04
 */
public class StarBuzzCoffee {
    public static void main(String[] args) {
        //订一杯Espresso 什么都不放
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + " $" +beverage.cost());
        //用whip进行装饰
        beverage = new Whip(beverage);
        //用soy进行装饰
        beverage = new Soy(beverage);
        //用Mocha进行装饰它
        beverage = new Mocha(beverage);

        System.out.println(beverage.getDescription() + " $" +beverage.cost());
    }
}
