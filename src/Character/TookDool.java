package Character;

public class TookDool extends Character {
    public int favorability;

    public void favorabilityRise(){
        favorability++;
    }
    public void favorabilityDecline(){
        favorability--;
    }
    public void favorabilityInitialization(){
        favorability = 0;
    }
}
