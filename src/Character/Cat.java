package Character;

import Doll.DollCollection;

import java.util.Scanner;

public class Cat extends TookDool {
    public static void CatFirst() {
        Scanner sc = new Scanner(System.in);
        int favorability = 0;

        System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
        System.out.println("냥냥먕냥 냥냐냐 (이걸 대장에게 바쳐야겠다~)");
        System.out.println("-------------------------------------------");
        System.out.println("1. 야옹아 이리온~ (츄르를 들고 고양이를 부른다)");
        System.out.println("2. 고양아 가지마!!!");
        System.out.println("3. 냥냥냐냐냐냐 (그 인형은 내거야)");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                System.out.println("먀아아옹? 먕먕냥냐냐옹 (저 인간은 뭐지? 날 부르는건가?)");
                System.out.println("-------------------------------------------");
                System.out.println("1. 야옹아 이리온~ (츄르를 들고 고양이를 부른다)");
                System.out.println("2. 고양아 그 인형은 내거야.");

                int FFchoice = sc.nextInt();

                switch (FFchoice) {
                    case 1:
                        favorability += 5;
                        System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                        System.out.println("먀먀먁 먀마옹~ (대장한테 이걸 전해줘야 하니까 그냥 가야겠다.)");
                        System.out.println("-------------------------------------------");
                        System.out.println("1. 야옹아 제발 이리와…… (츄르를 들고 고양이를 부른다)");

                        int FFFchoice = sc.nextInt();

                        switch (FFFchoice) {
                            case 1:
                                favorability -= 5;
                                System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                                System.out.println("먀먀…먀야아아옹 먀옹 (흠…. 불쌍한데 한번 가줄까….)");
                                System.out.println("-------------------------------------------");
                                System.out.println("1. (츄르를 주며 고양이를 쓰다듬는다)");
                                System.out.println("2. 내놔!! (츄르를 주지 않고 인형을 뺏으려 한다.)");

                                int FFFFchoice = sc.nextInt();

                                switch (FFFFchoice) {
                                    case 1:
                                        favorability -= 5;
                                        System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                                        System.out.println("먀먀ㅑ먀아옹~ (츄르를 먹고 만족스럽다는 듯이 인형을 놔두고 떠난다)");
                                        System.out.println("-------------------------------------------");
                                        System.out.println("<인형 획득 성공>");
                                        DollCollection.addDoll("하치와레", 10);
                                    case 2:
                                        favorability -= 5;
                                        System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                                        System.out.println("먀아아ㅏ아악!!!! 먀옥ㄷ!!! (손을 할퀸뒤 짜증난다는 듯이 사라진다.)");
                                        System.out.println("-------------------------------------------");
                                        System.out.println("<인형 획득 실패>");
                                        break;
                                }
                            case 2:
                                System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                                System.out.println("먀먀마옹? 먀옹~ (뭐라는거지? 그냥 가야겠다~)");
                                System.out.println("-------------------------------------------");
                                System.out.println("<그렇게 고양이는 떠났다. 인형 획득 실패>");
                        }
                    case 2:
                        System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                        System.out.println("야옹? 먀아옹? (뭐야 저 인간은 갑자기 왜 소리를 지르는거야)");
                        System.out.println("-------------------------------------------");
                        System.out.println("1. (고양이가 멈칫한 순간 슬금슬금 다가간다)");
                        System.out.println("2. 먀-아! (sns에서 본 고양이가 오도록 하는 울음소리를 따라한다.)");

                        int FSchoice = sc.nextInt();

                        switch (FSchoice) {
                            case 1:
                                favorability -= 5;
                                System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                                System.out.println("…. (슬금슬금 다가오는걸 보고 뒤도 돌아보지 않고 떠난다.)");
                                System.out.println("-------------------------------------------");
                                System.out.println("<인형 획득 실패>");
                            case 2:
                                favorability -= 5;
                                System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                                System.out.println("먀아옹? (인간이 나를 왜 부르는거지? 일단 가볼까…)");
                                System.out.println("-------------------------------------------");
                                System.out.println("1. 헐 뭐야 진짜로 오네?????");
                                System.out.println("2. 먀아옹…. 먀옹 (울음소리를 따라하며 고양이를 애처롭게 부른다.) ");

                                int FSSchoice = sc.nextInt();

                                switch (FSSchoice) {
                                    case 1:
                                        favorability -= 5;
                                        System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                                        System.out.println("먀아옹? (인간이 나를 왜 부르는거지? 일단 가볼까…)");
                                        System.out.println("-------------------------------------------");
                                        System.out.println("1. 품속에 있던 고등어 인형을 보여준다.");
                                        System.out.println("2. 은신술을 사용하여 인형을 빼았는다.");

                                        int FSSFchoice = sc.nextInt();

                                        switch (FSSFchoice) {
                                            case 1:
                                                favorability -= 5;
                                                System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                                                System.out.println("냐아앆!!!! (고등어 인형을 보고선 고등어 인형을 빼앗으려 한다.)");
                                                System.out.println("-------------------------------------------");
                                                System.out.println("1. 얏!! (물고있던 인형을 떨어트리는 것을 보고선 인형을 주우려 한다.)");

                                                int FSSFFchoice = sc.nextInt();

                                                switch (FSSFFchoice) {
                                                    case 1:
                                                        favorability -= 5;
                                                        System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                                                        System.out.println("먀? 캬아아옹!! (냄새로 고등어가 아닌걸 알아차리고선 손등을 할퀴고 인형을 챙겨 떠난다.)");
                                                        System.out.println("-------------------------------------------");
                                                        System.out.println("<고양이는 바보가 아니다. 인형 획득 실패>");
                                                }
                                        }
                                    case 2:
                                        favorability -= 5;
                                        System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                                        System.out.println("먁 ㅋ (이상하게 움직이는 인간을 한심하게 보며 떠난다.)");
                                        System.out.println("-------------------------------------------");
                                        System.out.println("<당연히 은신술 같은건 없었다. 인형 획득 실패>");
                                        break;
                                }
                        }
                    case 3:
                        favorability -= 5;
                        System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                        System.out.println("먀ㅑ먀아ㅏ아아악 먀옹!!! ( 저 인간은 어떻게 우리말을 아는거지???? )");
                        System.out.println("-------------------------------------------");
                        System.out.println("1. 냐옹ㅇ냐냐냥냐옹 ( 나는 고양이들의 신이다.)");
                        System.out.println("2. 먀먀마옥 냐냐ㅑ냐냐 ( 그건 알 필요 없고 인형을 내놔) ");
                        System.out.println("3. 냥냥냐냐냐냐 (그 인형은 내거야)");

                        int FTchoice = sc.nextInt();

                        switch (FTchoice) {
                            case 1:
                                favorability -= 5;
                                System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                                System.out.println("먀먀먀먀먁….. 먀옹ㅁ냐ㅑ냐옹 (확실히 엄청나게 큰 고양이야… 이 인형을 바쳐야겠다.)");
                                System.out.println("-------------------------------------------");
                                System.out.println("<인형 획득 성공>");
                                DollCollection.addDoll("문어", 5);
                            case 2:
                                favorability -= 5;
                                System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                                System.out.println("먀옹?ㅋ 먀먀마냐옹 (뭐야… 재수 없으니 그냥 가야겠다~ )");
                                System.out.println("-------------------------------------------");
                                System.out.println("<인형 획득 실패>");
                            case 3:
                                favorability -= 5;
                                System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                                System.out.println("먀옹? 먀먀먀옹~ (뭐? 그런게 어딨어 ㅋ)");
                                System.out.println("-------------------------------------------");
                                System.out.println("1. 먀옹먀나냐ㅑ농 (만약 인형을 준다면 고등어를 줄게)");
                                System.out.println("2. 먀아아옥 냐냐나농 (그 인형은… 상대진영 고양이를 해치우기 위한 인형이다.)");
                                int FTTchoice = sc.nextInt();

                                switch (FTTchoice) {
                                    case 1:
                                        favorability -= 5;
                                        System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                                        System.out.println("냐옹 ㅋ 냐냐ㅑ나~ (거짓말 ㅋ 이걸 대장에게 가져가서 고등어 받는게 더 안정적이야)");
                                        System.out.println("-------------------------------------------");
                                        System.out.println("<그렇게 고양이는 떠났다. 인형 획득 실패>");
                                    case 2:
                                        favorability -= 5;
                                        System.out.println("인형을 물고가던 길고양이 (호감도  " + favorability + ") :");
                                        System.out.println("먀??? 먀옹…. 먀. 먀먀나냐냐옹 (뭐? 그런 중대한 임무를 수행중이였다니.. 돌려주겠다.)");
                                        System.out.println("-------------------------------------------");
                                        System.out.println("<고양이는 비장한 표정으로 인형을 돌려주었다. 인형 획득 성공>");
                                        DollCollection.addDoll("여우", 5);
                                }
                                break;
                            default:
                                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                        }
                }
        }
    }
}
