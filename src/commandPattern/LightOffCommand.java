package commandPattern;

/**
 * @description: 关灯命令
 * @author: zhangtf
 * @create: 2019-07-31 17:32
 */
public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
