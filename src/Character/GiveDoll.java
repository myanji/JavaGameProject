package Character;
import java.util.Scanner;

public class GiveDoll extends Character {
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