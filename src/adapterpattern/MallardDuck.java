package adapterpattern;

/**
 * @description: 绿头鸭
 * @author: zhangtf
 * @create: 2019-08-27 07:00
 */
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
