package commandPattern;

/**
 * @description: 带状态的吊扇
 * @author: zhangtf
 * @create: 2019-08-25 22:30
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;

    /**
     *  局部状态， 代表吊扇的速度
     */
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }


    /**
     * 设置吊扇速度
     */
    public void high () {
        speed = HIGH;
        System.out.println("high");
    }

    public void medium () {
        speed = MEDIUM;
        System.out.println("medium");
    }

    public void low() {
        speed = LOW;
        System.out.println("low");
    }

    public void off() {
        speed = OFF;
        System.out.println("off");
    }

    /**
     * 获取吊扇当前速度
     * @return 当前速度
     */
    public int getSpeed(){
        return speed;
    }
}
