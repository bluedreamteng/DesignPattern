package templatepattern;

/**
 * @author zhangtf
 * @date 2019-09-03 21:31
 */
public class Tea extends CaffeineBeverage{




    /**
     * 泡茶专有
     */
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    /**
     * 泡茶专有
     */
    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

}
