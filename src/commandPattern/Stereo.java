package commandPattern;

/**
 * @description: 收音机
 * @author: zhangtf
 * @create: 2019-07-31 16:12
 */
public class Stereo {
    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + "stereo is on");
    }

    public void off() {
        System.out.println(name + "stereo is off");
    }

    public void setCD() {
        System.out.println(name + "stereo is cd");
    }
}
