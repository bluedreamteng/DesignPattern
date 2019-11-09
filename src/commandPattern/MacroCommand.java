package commandPattern;

/**
 * @description: 宏命令
 * @author: zhangtf
 * @create: 2019-08-26 21:28
 */
public class MacroCommand implements Command{

    /**
     * 在宏命令中，用命令数组存储一大堆命令
     */
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    /**
     * 当宏命令执行时，就一次性执行数组里的每个部分
     */
    @Override
    public void execute() {
        for (int i = 0; i<commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i<commands.length; i++) {
            commands[i].undo();
        }
    }
}
