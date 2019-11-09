package decoratorPattern;

/**
 * @description:
 * @author: zhangtf
 * @create: 2019-07-20 12:02
 */
public class Soy extends CondimentDecorator{
    Beverage beverage;

    //把被装饰者当作构造器的参数，由构造器将此饮料记录在实例变量中
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 让叙述不只是描述饮料，而是完整地连调料描述出来，首先利用委托的做法，得到
     * 一个叙述，然后在其加上附加得叙述
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }

    /**
     * 计算价钱，首先把调用委托给被装饰对象，以计算价钱，然后再加上调料本身得价钱
     * 最后得到结果。
     * @return
     */
    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
