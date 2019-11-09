package decoratorPattern;

/**
 * @description: 综合咖啡
 * @author: zhangtf
 * @create: 2019-07-20 11:19
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "House blend coffee";
    }

    /**
     * 直接返回饮料价钱即可
     * @return
     */
    @Override
    public double cost() {
        return 0;
    }
}
