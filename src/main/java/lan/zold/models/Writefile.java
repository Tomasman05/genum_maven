package lan.zold.models;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Writefile {
    public void tryWriteNums() throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("szamok.txt");
        int count = 2000000;
        for (int i = 0; i < count; i++) {
            Long num = Generate.genNum();
            pw.println(num);
        }
        pw.close();
        System.out.println("Sikeres írás.");
    }
    public void writeNums(){
        try {
            tryWriteNums();
        } catch (FileNotFoundException e) {
            System.err.println("A file nem található!");
            System.err.println(e.getMessage());
        }
    }
}
