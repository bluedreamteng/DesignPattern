package decoratorPattern.IO;

import java.io.*;

/**
 * @description:
 * @author: zhangtf
 * @create: 2019-07-20 17:30
 */
public class InputTest {
    public static void main(String[] args) {
        try {
            int c;

            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(new File("C:\\Users\\ZTF\\Desktop\\Aa11111"))));
            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
