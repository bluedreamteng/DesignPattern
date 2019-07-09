package IO;

import java.io.*;
/**
 * @author  zhangtf
 * @date 2019 07 08
 */
public class IoTest {
    public static void main(String[] args) throws IOException {
        String path = "C:\\worksapce\\DesignPattern\\src\\IO\\IoTest.java";
        System.out.print(read(path));
    }

    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s=in.readLine())!= null) {
            sb.append(s+"\n");
        }
        in.close();
        return sb.toString();
    }
}
