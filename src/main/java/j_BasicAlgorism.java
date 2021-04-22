import java.util.*;

public class j_BasicAlgorism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        char[] str = new char[input.length()];
        for (int i = 0; i < str.length; i++) { //배열에 넣음
            str[i] = input.charAt(i);
        }

        char[][] check = new char[str.length][str.length]; //반복되지않은 문자열
        int[] checkCnt = new int[str.length]; // 문자열 갯수


        int now = 0;
        for (int i = 0, k = 0; i < str.length; i++, k++) {
            for (int j = 0; j < str.length; j++) {
                if (check[now][j] == str[i]) { //겹치면
                    now++; //다음 배열에 저장
                    k = 0;
                }
            }
            check[now][k] = str[i];
            checkCnt[now]++;
        }

        int max = 0;
        int maxi = 0;
        for (int i = 0; i < str.length; i++) {

            if (max < checkCnt[i]) { //긴 문자열찾기
                max = checkCnt[i];
                maxi = i; //긴 문자열 위치
            }

        }

        for (int i = 0; i < max; i++) {
            System.out.print(check[maxi][i]);
        }
    }
}
