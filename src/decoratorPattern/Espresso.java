package decoratorPattern;

/**
 * @description: 浓咖啡
 * @author: zhangtf
 * @create: 2019-07-20 11:10
 */
public class Espresso extends Beverage{
    /**
     * 为了要设置饮料的描述，我们写了一个构造器，变量description继承自Beverage
     */
    public Espresso() {
        description = "Espresso";
    }

    /**
     * 计算价钱，我们不需要管调料的价钱，直接把饮料价钱返回即可
     * @return 浓咖啡的价钱
     */
    @Override
    public double cost() {
        return 1.99;
    }
}
