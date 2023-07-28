package Character;

public class StealDoll extends Character{
    @Override
    public void numberDecline() {
        if (encounterCount < 3) {
            number --;
        }
    }
}
