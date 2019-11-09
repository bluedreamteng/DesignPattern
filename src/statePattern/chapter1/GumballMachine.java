package statePattern.chapter1;

/**
 * @author zhangtf
 * @date 2019-09-21 09:01
 */
public class GumballMachine {
    /**
     * 所有的状态都在这里
     */
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    /**
     * 现在这个实例变量持有一个状态对象，而不是整数
     */
    State state = soldState;

    /**
     * 这个count实例变量记录机器内装有多少糖果，开始机器是没有糖果的
     */
    int count = 0;

    /**
     * 构造器取得糖果的初始数目并把它存放在一个实例变量中，每一种状态也都创建一个状态实例
     * @param numberGumballs
     */
    public GumballMachine(int numberGumballs) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);
        this.count = numberGumballs;
        //如果超过0颗糖果，我们就把状态设为NoQuarterState
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    /**
     * 我们这些动作变得很容易实现，我们只是委托到当前状态
     */
    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    /**
     * 请注意，我们不需要在GumballMachine中准备一个dispense()的动作方法，因为这只是一个内部的动作，
     * 用户不可以直接要求机器发放糖果，但我们是在状态对象的turnCrack()方法中调用dispense()方法的
     */
    public void turnGrank() {
        state.turnGrank();
        state.dispense();
    }

    public void refill(int count) {
        this.count = count;
        this.state = noQuarterState;
    }

    /**
     * 这个方法允许其它的对象（像我们的状态对象）将机器的状态转换到不同的状态
     * @param state
     */
    void setState(State state) {
        this.state = state;
    }

    /**
     * 这个机器提供了一个releaseBall()的辅助方法来释放出糖果，并将count实例变量的值减一
     */
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot");
        if (count != 0) {
            count--;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }
}
