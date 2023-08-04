package Character;

import java.util.Scanner;
import Character.*;
import Doll.*;

public class Child extends TookDool {
    public static void ChildFirst() {
        Scanner sc = new Scanner(System.in);
        int favorability = 0;

        System.out.println("인형을 가지고 있는 아이 (호감도  " + favorability + ") :");
        System.out.println("히히 길에서 우연히 인형을 주웠다~~ 이제 내거야");
        System.out.println("-------------------------------------------");
        System.out.println("1. 그 인형을 주지 않으면 가만두지 않겠어.");
        System.out.println("2. 가지고 있는 인형은 제거에요.");
        System.out.println("3. 우와 인형 예쁘다~");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                favorability += 4;
                System.out.println("인형을 가지고 있는 아이 (호감도  " + favorability + ") :");
                System.out.println("뭐지… 나한테 저렇게 말한 사람은 처음인걸….. (두근)");
                System.out.println("-------------------------------------------");
                System.out.println("1. 꼬마. 당장 그 인형을 내놔. ");
                System.out.println("2. (너무 심하게 말했나..) 꼬마야 그 인형을 줄 수 있니?");
                System.out.println("3. 너는 그 인형을 가질 자격이 없어. ");

                int FFchoice = sc.nextInt();

                switch (FFchoice) {
                    case 1:
                        favorability += 5;
                        System.out.println("인형을 가지고 있는 아이 (호감도  " + favorability + ") :");
                        System.out.println("넵…!! 드리겠습니다…… (두근….)");
                        System.out.println("-------------------------------------------");
                        System.out.println(" <인형 획득 성공> ");
                        DollCollection.addDoll("문어", 5);
                        break;
                    case 2:
                        favorability -= 5;
                        System.out.println("인형을 가지고 있는 아이 (호감도  " + favorability + ") :");
                        System.out.println("엥?ㅋ 뭐야 흥이 깨졌네 이 인형을 그냥 가져가야지. (무시하고 가려고 한다.)");
                        System.out.println("-------------------------------------------");
                        System.out.println("1. 꼬마야. 인형을 내놔.");
                        System.out.println("2. 그냥 보내준다.");

                        int FFSchoice = sc.nextInt();

                        switch (FFSchoice) {
                            case 1:
                                favorability -= 5;
                                System.out.println("인형을 가지고 있는 아이 (호감도  " + favorability + ") :");
                                System.out.println("으아아아아앙 으아아ㅏ아ㅏ앙 ( 짜증나는군. 울어서 해치워야겠다.)");
                                System.out.println("-------------------------------------------");
                                System.out.println("< 주변 사람들이 날 쳐다보았고 나는 그대로 도망쳤다. 인형 획득 실패 >");
                                break;
                            case 2:
                                favorability += 10;
                                System.out.println("인형을 가지고 있는 아이 (호감도  " + favorability + ") :");
                                System.out.println("…. (흠.. 뭔가 불쌍하니까 그냥 놔두고 가야겠다.)");
                                System.out.println("-------------------------------------------");
                                System.out.println("<그렇게 꼬마를 떠나보내고 나는 집에 가다가 내 인형을 발견했다. 인형 획득 성공>");
                                DollCollection.addDoll("행운 강아지", 8);
                                break;
                            default:
                                System.out.println("잘못된 선택입니다.");
                        }
                        break;
                    case 3:
                        favorability -= 7;
                        System.out.println("인형을 가지고 있는 아이 (호감도  " + favorability + ") :");
                        System.out.println("뭐야… 자기가 뭔데 나한테 자격을 논하남… 귀찮으니까 도망가야겠다.");
                        System.out.println("-------------------------------------------");
                        System.out.println("< 인형 획득 실패 >");
                        break;
                    default:
                        System.out.println("잘못된 선택입니다.");
                }
                break;
            case 2:
                favorability -= 1;
                System.out.println("인형을 가지고 있는 아이 (호감도  " + favorability + ") :");
                System.out.println("이 인형은 내건데? 니가 뭔데");
                System.out.println("-------------------------------------------");
                System.out.println("1. 이런 싹바가지 없는 꼬맹이를 봤나");
                System.out.println("2. 그 인형은 사실 저주받은 인형이라서.. 너가 가지고 있으면 안되는 물건이야.. (구라)");

                int FSchoice = sc.nextInt();

                switch (FSchoice) {
                    case 1:
                        favorability -= 2;
                        System.out.println("인형을 가지고 있는 아이 (호감도  " + favorability + ") :");
                        System.out.println("에베베베 니가 더 싸가지 없음 수고~");
                        System.out.println("-------------------------------------------");
                        System.out.println("<그렇게 아이는 인형을 가져간 채로 도망을 갔다…. 인형 획득 실패>");
                        break;
                    case 2:
                        favorability += 10;
                        System.out.println("인형을 가지고 있는 아이 (호감도  " + favorability + ") :");
                        System.out.println("헉…!!!! 정말요??…. 이거 드릴게요… 알려주셔서 감사합니다..!!!");
                        System.out.println("-------------------------------------------");
                        System.out.println("<인형 획득 성공>");
                        DollCollection.addDoll("여우", 5);
                        break;
                    default:
                        System.out.println("잘못된 선택입니다.");
                }
                break;
            case 3:
                favorability += 3;
                System.out.println("인형을 가지고 있는 아이 (호감도  " + favorability + ") :");
                System.out.println("그치? 이 인형 내거야. 특별히 구경하게 해줄게. ");
                System.out.println("-------------------------------------------");
                System.out.println("1. 우와 고마워! (인형을 가지고 도망친다)");
                System.out.println("2. 근데 이 인형이 왜 너꺼야?");

                int FTchoice = sc.nextInt();

                switch (FTchoice) {
                    case 1:
                        favorability -= 8;
                        System.out.println("인형을 가지고 있는 아이 (호감도  " + favorability + ") :");
                        System.out.println("감히 내 인형을 가져가? (육상선수였던 아이가 쫓아와 인형을 가져간다.)");
                        System.out.println("-------------------------------------------");
                        System.out.println("<인형 획득 실패>");
                        break;
                    case 2:
                        favorability += 0;
                        System.out.println("인형을 가지고 있는 아이 (호감도  " + favorability + ") :");
                        System.out.println("내가 주웠으니까? 그건 왜?");
                        System.out.println("-------------------------------------------");
                        System.out.println("1. 주웠다고 멋대로 가져가면 점유이탈물횡령죄로 잡혀갈 수도 있어… 너가 감옥에 안갇히길 바래서 말해주는거야");
                        System.out.println("2. 주웠다고 너가 가져도 되는거야? 너네 부모님이 그렇게 가르치셨어?");

                        int FTSchoice = sc.nextInt();

                        switch (FTSchoice) {
                            case 1:
                                favorability += 10;
                                System.out.println("인형을 가지고 있는 아이 (호감도  " + favorability + ") :");
                                System.out.println("지…진짜?? 나는 그냥 주웠을 뿐이야…. 나 감옥 안갈래….. 여기….");
                                System.out.println("-------------------------------------------");
                                System.out.println("<아이는 인형을 주고선 울면서 돌아갔다. 인형 획득 성공>");
                                DollCollection.addDoll("오리", 5);
                                break;
                            case 2:
                                favorability -= 3;
                                System.out.println("인형을 가지고 있는 아이 (호감도  " + favorability + ") :");
                                System.out.println("어. 우리 부모님이 이렇게 가르치셨는데? 어쩔티비~~ 수고티비 ㅋ");
                                System.out.println("-------------------------------------------");
                                System.out.println("<그렇게 아이는 실컷 놀리고선 도망갔다. 인형 획득 실패>");
                                break;

                            default:
                                System.out.println("잘못된 선택입니다.");
                        }

                        break;

                    default:
                        System.out.println("잘못된 선택입니다.");

                }
        }
    }

}
