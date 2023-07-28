package Character;

public class GiveDoll extends Character {
    @Override
    public void numberIncrease() {
        if (encounterCount < 3) {
            number ++;
        }
        else {
            number += 5; // 이거 랜덤으로 주는거로 바꾸기
        }
    }
}