package lan.zold.models;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Writefile {
    public void tryWriteNums() throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("szamok.txt");
        int count = 1000;
        for (int i = 0; i < count; i++) {
            Long num = Generate.genNum();
            pw.println(num);
        }
        pw.close();
    }
    public void writeNums() throws FileNotFoundException{
        try {
            tryWriteNums();
        } catch (FileNotFoundException e) {
            System.err.println("A file nem található!");
            System.err.println(e.getMessage());
        }
    }
}
