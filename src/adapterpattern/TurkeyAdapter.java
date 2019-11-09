package adapterpattern;

/**
 * 首先需要实现像转换成的类型接口，也就是你的
 * 客户所期望看到的接口
 * @author zhangtf
 * @date  2019-08-27 07:13
 */
public class TurkeyAdapter implements Duck{
    Turkey turkey;

    /**
     * 接着， 需要取得要适配的对象引用，这里我们用构造器取得这个引用
     * @param turkey 被适配对象
     */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /**
     * 我们现在需要实现接口中的所有方法。quack()在类之间的转换
     * 很简单，只要调用gobble就可以了
     */
    @Override
    public void quack() {
        turkey.gobble();
    }

    /**
     * 固然两个接口都具备了fly()方法，火鸡的飞行距离很短，不像鸭子可以
     * 长途飞行，要让鸭子的飞行和火鸡的飞行能对应，必须连续五次调用火鸡的fly()
     * 来完成
     */
    @Override
    public void fly() {
        for(int i=0; i < 5; i++) {
            turkey.fly();
        }
    }
}
