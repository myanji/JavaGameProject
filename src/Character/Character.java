package Character;

public class Character {
    public String name;
    public int encounterCount;

    // 기본 생성자
    public Character() {
        this.name = "기본생성자";
        this.encounterCount = 0;
    }

    // 캐릭터, 마주칫 횟수 초기화
    public Character(String name) {
        this.name = name;
        this.encounterCount = 0;
    }
    // 마주친 횟수 올리기
    public void increaseEncounterCount() {
        encounterCount++;
    }
    // 현재 마주친 횟수를 가져오는 함수
    public int getEncounterCount() {
        return encounterCount;
    }

    // 캐릭터의 이름을 가져오는 함수
    public String getName() {
        return name;
    }
}
