package commandPattern;

/**
 * @description: 电灯 接收者对象
 * @author: zhangtf
 * @create: 2019-07-31 08:34
 */
public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on () {
        System.out.println(name + "light is on");
    }
    public void off() {
        System.out.println(name + "light is off");
    }
}
