package statePattern.chapter1;

/**
 * @author zhangtf
 * @date 2019-09-18 23:17
 */
public interface State {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnGrank();

    public void dispense();
}
