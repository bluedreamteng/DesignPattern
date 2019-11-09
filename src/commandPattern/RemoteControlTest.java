package commandPattern;

/**
 * @description: 遥控器测试
 * @author: zhangtf
 * @create: 2019-07-31 08:42
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        Light light = new Light("");
        Command command = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor("");
        Command garageDoorCommand = new GarageDoorOpenCommand(garageDoor);
        SimpleRemoteControl control = new SimpleRemoteControl();
        control.setCommand(command);
        control.buttonIsPressed();
        control.setCommand(garageDoorCommand);
        control.buttonIsPressed();

    }
}
