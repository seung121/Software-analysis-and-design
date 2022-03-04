import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ary1 = new int[3];
        int[] ary2 = new int[3];

        int int1 = sc.nextInt();
        int int2 = sc.nextInt();

        ary1[2] = int1 / 100;
        ary1[1] = int1 / 10 - ary1[2] * 10;
        ary1[0] = int1 - (ary1[2] * 100) - (ary1[1] * 10);

        ary2[2] = int2 / 100;
        ary2[1] = int2 / 10 - ary2[2] * 10;
        ary2[0] = int2 - (ary2[2] * 100) - (ary2[1] * 10);

        int sum1 = ary1[0] * 100 + ary1[1] * 10 + ary1[2];
        int sum2 = ary2[0] * 100 + ary2[1] * 10 + ary2[2];

        if (sum1 > sum2)
            System.out.println(sum1);
        else
            System.out.println(sum2);
    }
}
