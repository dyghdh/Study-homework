import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 기초 알고리즘 2. 기초 별찍기 3. 별찍기 응용 - 1 4. 별찍기 응용 - 2 5. 별찍기 응용 - 3 6. 스도쿠 출력 7. 초급 알고리즘");

        loop:
        while (true) {

            int num = sc.nextInt();

            switch (num) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;

                default:break loop;
            }
        }
        sc.close();
    }
}
