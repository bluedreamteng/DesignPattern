package commandPattern;

/**
 * @description: 控制电灯开的命令对象
 * @author: zhangtf
 * @create: 2019-07-31 08:36
 */
public class LightOnCommand implements Command{

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        this.light.off();
    }


}
