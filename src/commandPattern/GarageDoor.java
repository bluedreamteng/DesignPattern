package commandPattern;

/**
 * @description: 车库大门
 * @author: zhangtf
 * @create: 2019-07-31 08:59
 */
public class GarageDoor {
    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up(){
        System.out.println(name + "the door is up");
    }
    public void down(){
        System.out.println(name + "the door is down");
    }
    public void stop(){
        System.out.println(name + "the door is stop");
    }
}
