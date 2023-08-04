package Character;

public class Ending {

    public void HappyEnding(){
        System.out.println("\"휴... 다행히 인형을 전부 되찾았어!\"");
        System.out.println("\"엄마가 오기전에 빨리 집에 가야지\"");
        System.out.println("그렇게 현지는 인형을 전부 되찾고 가벼워진 발걸음으로 집으로 향했다.");
        System.out.println("-----Happy ending-----");
    }
    public void NomalEnding(){
        System.out.println("\"흠... 인형을 다 찾진 못했지만 어쩔 수 없지\"");
        System.out.println("\"좋아하는 인형을 다 찾았으니까 그만 집으로 가야겠다...\"");
        System.out.println("그렇게 현지는 인형을 챙겨 집으로 갔다. 어딘가 아쉬운 발걸음이였다.");
        System.out.println("-----Nomal ending-----");
    }
    public void BadEnding(){
        System.out.println("\"앗 안돼..... 이제 엄마가 올 시간인데...\"");
        System.out.println("\"좋아하는 인형을 다 찾지 못했어........ \"");
        System.out.println("좋아하는 인형을 찾지 못한 현지는 울면서 집으로 돌아갔다.");
        System.out.println("-----Bad ending-----");
    }
}
