package adapterpattern;

/**
 * @description: 火鸡具体实现
 * @author: zhangtf
 * @create: 2019-08-27 07:03
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
