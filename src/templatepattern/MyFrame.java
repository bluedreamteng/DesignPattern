package templatepattern;

import javax.swing.*;
import java.awt.*;

/**
 * 我们扩展了JFrame,它包含一个update()方法，这个方法控制更新屏幕的算法，我们可以通过
 * 覆盖paint()钩子方法和这个算法挂上钩
 * @author zhangtf
 * @date 2019-09-05 23:43
 */
public class MyFrame extends JFrame {

    public MyFrame(String title) throws HeadlessException {
        //这只是一些初始化动作
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    /**
     * JFrame的更新算法被称为paint()。在默认状态下，paint()是不做事的，它只是一个钩子，我们覆盖paint(),
     * 告诉JFrame在窗口上面画出一条消息
     * @param graphics
     */
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "I rule!!";
        graphics.drawString(msg, 100, 100);
    }

    public static void main (String[] args) {
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
