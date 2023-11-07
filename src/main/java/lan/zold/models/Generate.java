package lan.zold.models;

import java.util.Random;

public class Generate {
    Random rd;
    public Generate(){
        rd= new Random();
    }
    public Long genNum(){
        Long num = rd.nextLong();
        return num;
    }
}
