import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("눈을 떠보니 슬라임이 되있었다");
        System.out.println("1. 주변을 둘러본다 2. 돌을 먹는다 ");
        int num = sc.nextInt();

        switch (num){
            case 1:break;
            case 2:
                System.out.println("우걱우걱 단단해지기를 배웠다.");
        }

        System.out.println("주변은 동굴이다.");
        System.out.println("1. 안쪽으로 들어간다 2. 밖으로 나간다 ");
        num = sc.nextInt();

        switch (num){
            case 1:
                System.out.println("봉인된 용을 발견했다 ");
            case 2:
                System.out.println("밖에나가니 광활한 숲과 햇살이 있다 ");
        }

        sc.close();
    }
}
