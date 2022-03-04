import java.util.Scanner;

public class Main { // 글자수만큼 순회하면 중단시키자
    static int count = 0; // 현재값이 T인지 확인하고 아니라면 인덱스값이 len-1이라면 카운팅하고 취소

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // num은 몇개의 숫자를 입력 받을지
        int len; // 입력받은 글자의 갯수 (EX. HELLO = 5)
        for (int i = 0; i <= num; i++) // 매번 str를 새로 선언해도 되는가?
        {
            // 단어를 입력받고 쪼개 놓은걸 배열에 넣는 과정
            String WORD = sc.nextLine();
            len = WORD.length();
            String[] WORDsp = new String[WORD.length()];
            WORDsp = WORD.split("");

            // 배열에 넣은것을 2차원 배열에 옮기는 과정
            // 이곳에서 F로 상태값 초기화 까지
            String[][] str = new String[len + 1][2];
            for (int j = 0; j < len; j++) {
                str[j][0] = WORDsp[j];
                str[j][1] = "F";
            }
            str[len][0] = "NULL";
            str[len][1] = "NULL";

            for (int c = 0; c < len; c++) {
                if (str[c][1] == "T")
                    break;
                if (c + 1 == len) {
                    count++;
                }
                if (str[c][0].equals(str[c + 1][0])) // 다음과 현재가 같다면 continue
                    continue;
                else // 다음과 현재가 다르다면
                {
                    str[c][1] = "T"; // 현재 상태값을 T로 바꾸고
                    for (int k = 0; k < len; k++) {
                        if (str[c][0].equals(str[k][0]))
                            str[k][1] = "T";
                    }
                }
            }
        }
        System.out.println(count);
    }

}