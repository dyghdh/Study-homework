import java.util.Scanner;

public class a_BasicAlgorism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        sc.close();

        for (int i = 1; i <= num; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
