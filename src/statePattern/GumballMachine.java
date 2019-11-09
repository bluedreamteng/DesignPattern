package statePattern;

/**
 * @author zhangtf
 * @date 2019-09-18 20:33
 */
public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    /**
     * 这个实例变量跟踪当前状态，一开始被设置为糖果售罄
     */
    int state = SOLD_OUT;
    /**
     * 用来追踪机器内的糖果数目
     */
    int count = 0;

    /**
     * 构造器需要初始糖果库存量当作参数，如果库存量不为零的话，
     * 机器就会进入没有25分钱的状态，也就是说，它等着别人投入25分钱。如果糖果数目为零的话，
     * 机器就会保持在糖果售罄的状态
     * @param count
     */
    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    /**
     * 当有25钱投进来，就会执行这里
     */
    public void insertQuarter() {
        //每一个可能的状态都需要用条件状态检查
        if (state == HAS_QUARTER) {
            //如果已经投入25分钱我们就告诉顾客
            System.out.println("You can't insert anonther quarter");
        } else if (state == SOLD_OUT) {
            //如果是在没有25分钱的状态下，我们就接收25分钱，并将状态转换到有25分钱的状态
            System.out.println("You can't insert a quarter, the machine is sold out");
        } else if (state == SOLD) {
            //然后对每一个可能的状态展现适当的行为
            //如果糖果已经售罄，我们就拒绝收钱
            System.out.println("Please wait, we're already giving you a gumball");
        } else if (state == NO_QUARTER) {
            //也可以转换到另一个状态，像状态图所描绘的那样
            state = HAS_QUARTER;
            System.out.println("YOU inserted a quarter");
        }
    }

    /**
     * 退回25分钱
     */
    public void ejectQuarter() {
        //如果有25分钱，就把25分钱退出来，回到没有25分钱的状态
        if (state == HAS_QUARTER) {
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("you haven't insert a quarter");
        } else if (state == SOLD) {
            //如果顾客已经转动曲柄，就不能再退钱了，已经拿到糖果了
            System.out.println("Sorry, you already turned the crank");
        } else if (state == SOLD_OUT) {
            //如果糖果售罄，就不可能接收25分钱，当然也不可能退钱
            System.out.println("YOU can't eject, you haven't inserted a quarter yet");
        }
    }

    /**
     * 转动曲柄
     */
    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball");
        } else if (state == NO_QUARTER) {
            System.out.println("you turned but there's no quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("YOU turned, but there are no gumballs");
        } else if (state == HAS_QUARTER) {
            //成功 拿到糖果，改变状态到售出糖果，然后调用机器的dispense方法
            System.out.println("You turned ...");
            state = SOLD;
            dispense();
        }
    }

    /**
     * 发放糖果
     */
    public void dispense() {
        if(state == SOLD) {
            //我们正在售出糖果状态，给它们糖果
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if (count == 0) {
                //我们在这里处理糖果售罄的状况，如果这是最后一颗糖果，我们就将机器的状态设置到
                //糖果售罄，否则就回到没有25分钱状态
                System.out.println("oops out of gumballs");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
            //这些都不应该发生，但如果客户这么做了，他们得到的是错误消息，而不是糖果
        } else if (state == NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if (state == SOLD_OUT) {
            System.out.println("NO gumball dispensed");
        } else if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
