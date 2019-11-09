package statePattern.chapter1;

/**
 * @author zhangtf
 * @date 2019-09-25 22:18
 */
public class WinnerState implements State{
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("error");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("error");
    }

    @Override
    public void turnGrank() {
        System.out.println("error");
    }

    @Override
    public void dispense() {
        System.out.println("You are a Winner ! You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops , out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
