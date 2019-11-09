package commandPattern;

/**
 * @description:
 * @author: zhangtf
 * @create: 2019-07-31 17:41
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    /**
     *  前一个命令会被记录在这里
     */
    Command undoCommand;

    public RemoteControl () {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int i = 0; i<7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        //刚开始并没有前一个动作，用一个空对象来记录
        undoCommand = noCommand;
    }

    public void setCommand (int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed (int slot) {
        onCommands[slot].execute();

        //当按下按钮，我们取得这个命令并优先执行它，然后
        //将它记录在undoCommand实例变量中，不管开或关命令，处理方法都一样
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed () {
        //当按下撤销按钮， 我们调用undoCommand实例变量的undo()方法，
        //就可以倒转前一个命令
        undoCommand.undo();
    }
    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------RemoteControl ------\n");
        for (int i = 0;i < onCommands.length; i++) {
            stringBuff.append("[slot" + i + "] " + onCommands[i].getClass().getName()
                    + "  " + offCommands[i].getClass().getName() + "\n" );
        }
        return stringBuff.toString();
    }
}
