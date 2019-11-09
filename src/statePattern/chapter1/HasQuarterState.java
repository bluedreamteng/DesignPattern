package statePattern.chapter1;

import java.util.Random;

/**
 * @author zhangtf
 * @date 2019-09-21 09:19
 */
public class HasQuarterState implements State {
    /**
     * 首先我们增加一个随机数产生器，产生10%赢的机会
     */
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    /**
     * 当状态被实例化的时候，我们要传入GumballMachine的引用来作为参数
     * @param gumballMachine
     */
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        //退出顾客的25分钱，并将状态转换到NoQuarterState状态
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    /**
     * 当曲柄被转动时，我们就调用它的setState方法，并传入soldState对象作为参数，
     * 将机器的状态转换到soldState状态。这个soldState对象可以通过getSoldState方法取得
     */
    @Override
    public void turnGrank() {
        System.out.println("You turned ...");
        int winner = randomWinner.nextInt(10);
        //然后决定这个顾客是否赢了，如果赢了，而且有足够的糖果可以让他一次得到两颗的话，我们
        //就进入WinnerState状态，否则就进入SoldState状态
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
