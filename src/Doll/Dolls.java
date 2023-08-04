package Doll;
import java.util.ArrayList;

public class Dolls {
    public String Dollname;
    // 인형의 희귀도
    public int rarity;

    //기본 생성자
    public Dolls(){
        this.Dollname = "인형 이름";
        this.rarity = 0;
    }
    public Dolls(String name, int rarity) {
        this.Dollname = name;
        this.rarity = rarity;
    }

}
