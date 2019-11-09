package decoratorPattern;

/**
 * @description:
 * @author: zhangtf
 * @create: 2019-07-20 11:05
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    /**
     *  所有的调料装饰者都必须实现getDescription方法
     */
    public abstract String getDescription();
}