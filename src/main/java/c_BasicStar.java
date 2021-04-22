import java.util.Scanner;

public class c_BasicStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[][] array = new char[num][num];

        int blank = num / 2;
        int star = 1;
        int j;

        for (int i = 0; i < array.length; i++) {

            for (j = 0; j < blank; j++) { //왼쪽 빈공간
                array[i][j] = ' ';
            }

            for (int k = 0; k < star; k++, j++) { //별
                array[i][j] = '*';
            }

            for (; j < num; j++) { //오른쪽 빈공간
                array[i][j] = ' ';
            }

            if (i < array.length / 2) {
                blank--; 
                star += 2; 
            } else {
                blank++;
                star -= 2;
            }
        }


        for (char[] chars : array) { //출력
            for (j = 0; j < array.length; j++) {
                System.out.print(chars[j]);
            }
            System.out.println();
        }
    }
}
