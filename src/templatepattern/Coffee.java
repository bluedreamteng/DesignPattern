package templatepattern;

/**
 * 用来煮咖啡
 * @author zhangtf
 * @date 2019-09-03 21:24
 */
public class Coffee extends CaffeineBeverage {

    /**
     * 冲泡咖啡
     */
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }


    /**
     * 加糖和奶
     */
    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
