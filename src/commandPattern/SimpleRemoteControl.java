package commandPattern;

/**
 * @description: 遥控器 调用者对象
 * @author: zhangtf
 * @create: 2019-07-31 08:38
 */
public class SimpleRemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonIsPressed () {
        command.execute();
    }
}
