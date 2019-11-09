package adapterpattern;

import java.util.Random;

/**
 * 鸭子适配器
 * @author zhangtf
 * @create 2019-08-28 23:12
 */
public class DuckAdapter implements Turkey { //需要实现目标接口turkey

    /**
     * 需要持有被适配者引用
     */
    private Duck duck;
    private Random rand = new Random();
    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        //由于鸭子比火鸡飞的远，让鸭子平均每五次飞一次
        if (rand.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
