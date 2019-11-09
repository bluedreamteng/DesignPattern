package decoratorPattern;

/**
 * @description: 摩卡是一个装饰者，所以让它扩展自CondimentDecorator
 * @author: zhangtf
 * @create: 2019-07-20 11:45
 */
public class Mocha extends CondimentDecorator{
    //让Mocha能够引用一个Beverage,用一个实例变量记录饮料，也就是被装饰者
    Beverage beverage;

    //把被装饰者当作构造器的参数，由构造器将此饮料记录在实例变量中
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 让叙述不只是描述饮料，而是完整地连调料描述出来，首先利用委托的做法，得到
     * 一个叙述，然后在其加上附加得叙述
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    /**
     * 计算价钱，首先把调用委托给被装饰对象，以计算价钱，然后再加上调料本身得价钱
     * 最后得到结果。
     * @return
     */
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
