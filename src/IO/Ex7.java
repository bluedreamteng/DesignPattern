package IO;

import java.io.*;
import java.util.*;

public class Ex7 {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\ZTF\\Desktop\\test.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        LinkedList<String> linkedList = new LinkedList<String>();
        String preLine;
        while ((preLine=bufferedReader.readLine())!=null) {
            linkedList.add(preLine);
        }
        bufferedReader.close();
        while(linkedList.peekLast()!=null) {
            String s = (linkedList.pollLast());
            String s1 = s.toUpperCase();
            System.out.println(s1);
        }
        String[] sa = {"C:\\Users\\ZTF\\Desktop\\test.txt","11111"};
        readReverseFind(sa);
    }

    public static String readReverseFind(String[] sa) throws IOException {
        // Reading input by lines:
        BufferedReader in = new BufferedReader(new FileReader(sa[0]));
        String s;
        List<String> find = new ArrayList<String>();
        for(String t : sa) find.add(t);
        find.remove(0); // Remove the file name
        LinkedList<String> list = new LinkedList<String>();
        StringBuilder sb = new StringBuilder(); // For output String
        while((s = in.readLine()) != null) {
            // List of words in line:
            List<String> line = Arrays.asList(s.split("\\W+"));
            // Find lines with word(s) in common:
            if(!(Collections.disjoint(line, find)))
                list.add(s); // Add to list
        }
        while(list.peekLast() != null) // While there is a last line
            sb.append(list.pollLast() + "\n"); // Removes line from list
        in.close();
        return sb.toString();
    }
}
