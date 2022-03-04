import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int val = A * B * C;
        String VAL = Integer.toString(val);

        int VAL_C[] = new int[9];

        for (int i = 0; i < 9; i++) {
            VAL_C[i] = 0;
        }

        int len = VAL.length();

        for (int i = 1; i <= 9; i++) {
            char NUM = Character.forDigit(i, 10); // 10진수값 i
            for (int j = 0; j < len; j++) {
                if (VAL.charAt(j) == NUM) {
                    VAL_C[i - 1] = VAL_C[i - 1] + 1;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(VAL_C[i]);
        }
    }
}