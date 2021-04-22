import java.util.Scanner;

public class b_BasicAlgorism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        sc.close();

        for (int i = n; i <= m; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
