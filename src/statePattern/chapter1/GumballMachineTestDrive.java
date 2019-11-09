package statePattern.chapter1;

/**
 * @author zhangtf
 * @date 2019-09-25 23:05
 */
public class GumballMachineTestDrive {
    public static void main (String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnGrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnGrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnGrank();

        System.out.println(gumballMachine);
    }
}
