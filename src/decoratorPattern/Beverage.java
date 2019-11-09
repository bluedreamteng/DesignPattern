package decoratorPattern;

/**
 * @description: Beverage是一个抽象类，有两个方法，getDescription以及cost()
 * @author: zhangtf
 * @create: 2019-07-20 10:52
 */
public abstract class Beverage{
    String description = "Unknown Beverage";

    //getDescription已经在此实现了，但是cost必须在子类中实现
    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
