package adapterpattern;

/**
 * @description:
 * @author : zhangtf
 * @date : 2019-08-27 07:22
 */
public class DuckTestDrive {
    public static void main (String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println(" the turkey says ---");

        turkey.gobble();
        turkey.fly();

        System.out.println("the duck says");

        testDuck(duck);

        System.out.println("\n the turkeyAdapter says ...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
