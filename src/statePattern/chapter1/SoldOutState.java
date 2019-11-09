package statePattern.chapter1;

/**
 * @author zhangtf
 * @date 2019-09-21 11:10
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you can't insert quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you can't inject ,you haven't insert a quarter yet");
    }

    @Override
    public void turnGrank() {
        System.out.println("you turned but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }
}
