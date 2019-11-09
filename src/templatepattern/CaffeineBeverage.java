package templatepattern;

/**
 * @author zhangtf
 * @date 2019-09-03 23:13
 */
public abstract class CaffeineBeverage {
    /**
     * 现在用同一个prepareRecipe()方法来处理茶和咖啡。prepareRecipe()被声明为final,
     * 因为我们不想子类覆盖这个方法，将步骤2和步骤4泛化成为brew()和addCondiments()。
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 因为咖啡和茶处理这些方法的做法不同，所以这两个方法必须被声明为抽象，剩余的东西留给子类去决定
     */
    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
