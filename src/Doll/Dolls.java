package Doll;

public class Dolls {
    public String Dollname;
    public int rarity;
    public int number;
    
    //기본 생성자
    public Dolls(){
        this.Dollname = "인형이름";
        this.rarity = 0;
        this.number = 0;
    }
    
    public void numberIncrease(){
        number++;
    }
    public void numberDecline (){
        number--;
    }

}
