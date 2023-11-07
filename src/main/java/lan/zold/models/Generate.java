package lan.zold.models;

import java.util.Random;

public class Generate {
    
    public static Long genNum(){
        Random rd= new Random();
        Long num = rd.nextLong();
        return num;
    }
}
