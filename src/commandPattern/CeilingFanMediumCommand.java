package commandPattern;

/**
 * @description: 中速命令
 * @author: zhangtf
 * @create: 2019-08-25 23:33
 */
public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;

    /**
     * 增加局部状态以便追踪吊扇之前的速度
     */
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        //在我们改变吊扇的速度之前，需要先将它之前的状态记录起来，以便需要撤销时使用
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    /**
     * 将吊扇的速度设置回之前的值，达到撤销的目的
     */
    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
