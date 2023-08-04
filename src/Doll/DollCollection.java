package Doll;

import java.util.ArrayList;

public class DollCollection extends Dolls {
    
    // Dolls의 객체들만 저장할 수 있는 ArrayList
    public static ArrayList<Dolls> collection = new ArrayList<>();

    // 기본 생성자
    public DollCollection() {
    }

    public DollCollection(String name, int rarity) {
        addDoll(name, rarity);
    }
    
    // 인형 추가
    public static void addDoll(String name, int rarity) {
        collection.add(new Dolls(name, rarity));
        System.out.println(" " + name + " 인형을 획득했습니다. (희귀도: " + rarity + ")");
        System.out.println("\n");
    }
    
    // 모은 인형 출력
    public static void printCollection() {
        // collection에 저장된 모든 Dolls 객체들을 하나씩 가져와서 doll 변수에 담는다.
        for (Dolls doll : collection) {
            System.out.println(doll.Dollname + ", 희귀도: " + doll.rarity);
        }
    }

    // 모은 인형 희귀도 합산
    public static int TotalRarity() {
        int totalRarity = 0;
        for (Dolls doll : collection) {
            totalRarity += doll.rarity;
        }
        return totalRarity;
    }
}
