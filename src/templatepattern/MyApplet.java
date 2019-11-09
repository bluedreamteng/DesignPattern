package templatepattern;

import java.applet.Applet;
import java.awt.*;

/**
 * @author zhangtf
 * @date 2019-09-06 07:29
 */
public class MyApplet extends Applet {
    String message;

    /**
     * init钩子用来进行applet的初始化动作，它会在applet一开始的时候被调用一次
     */
    @Override
    public void init() {
        message = "Hello World., i am alive";
        //repaint()事Applet类的一个具体方法，可让applet的上层组件知道
        //这个applet需要重绘
        repaint();
    }

    /**
     * start钩子可以在applet正要被显示在网页上时，让applet做一些动作
     */
    @Override
    public void start() {
        message = "Now i am starting up";
        repaint();
    }

    /**
     * 如果用户跳到别的网页，这个stop钩子会被调用，然后applet就可以在这里做一些事情来停止它的行动
     */
    @Override
    public void stop() {
        message = "Oh now i am being stopped";
        repaint();
    }

    /**
     * 当这个applet即将被销毁时（如关闭浏览器），destroy钩子就会被调用，我们可以在这里显示一些东西
     */
    @Override
    public void destroy() {
        //applet正在被销毁
    }

    /**
     * 这个方法也是钩子
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }
}
