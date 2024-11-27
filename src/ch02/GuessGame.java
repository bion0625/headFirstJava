package ch02;

public class GuessGame{
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guess1 = 0;
        int guess2 = 0;
        int guess3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("0 이상 10 이하의 숫자를 맞혀 보세요.");

        while(true) {
            System.out.println("맞혀야 할 숫자는 " + targetNumber + "입니다.");

            p1.guess();
            p2.guess();
            p3.guess();

            guess1 = p1.number;
            System.out.println("1번 선수가 추측한 숫자: " + guess1);

            guess2 = p2.number;
            System.out.println("2번 선수가 추측한 숫자: " + guess2);

            guess3 = p3.number;
            System.out.println("3번 선수가 추측한 숫자: " + guess3);

            if(guess1 == targetNumber) p1isRight = true;
            if(guess2 == targetNumber) p2isRight = true;
            if(guess3 == targetNumber) p3isRight = true;

            if(p1isRight | p2isRight | p3isRight) {
                System.out.println("맞힌 선수가 있습니다.");
                System.out.println("1번 선수: " + p1isRight);
                System.out.println("2번 선수: " + p2isRight);
                System.out.println("3번 선수: " + p3isRight);
                System.out.println("게임 끝.");
                break;
            } else {
                System.out.println("다시 시도해야 합니다.");
            }
        }
    }
}