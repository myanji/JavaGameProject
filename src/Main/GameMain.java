package Main;

import java.util.Scanner;
import Character.*;
import java.util.ArrayList;
import Doll.*;

public class GameMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        while (true) {
            System.out.println("인형을 찾으러 어디로 가볼까?");
            System.out.println("1. 대로변");
            System.out.println("2. 숲");
            System.out.println("3. 이사하기 전 집 근처");
            System.out.println("4. 혼자가기에 으스스한 곳");

            int choice = sc.nextInt();

            if (choice == 1){
                findChild();
                counter++;
            }

            else if (choice == 2) {
                findCat();
                counter++;
            }

            System.out.println("----- 모은 인형 정보 ------");
            DollCollection.printCollection();

            if (counter >= 6) {
                System.out.println("\n");
                break;
            }

        }

        // 엔딩 출력 엔딩 뭔가 이상함 손봐야함
        Ending ending = new Ending();
        if (DollCollection.TotalRarity() >= 28 || counter >= 6) {
            ending.HappyEnding();
        } else if (DollCollection.TotalRarity() >= 20 || (counter < 6 && counter >= 4)) {
            ending.NomalEnding();
        } else {
            ending.BadEnding();
        }
    }


    public static void findChild() {
        System.out.println("인형을 찾으러 대로변으로 갑니다.");
        System.out.println("\n");
        Child.ChildFirst();
    }

    public static void findCat() {
        System.out.println("인형을 찾으러 숲으로 갑니다.");
    }
}
