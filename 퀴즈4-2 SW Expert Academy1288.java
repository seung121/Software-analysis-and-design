import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();  // 0 ~ n-1까지의 n개
        int TC_Count[] = new int[TC];   // 0 ~ n-1까지의 n개 [0]에 #1값 들어감
 
        for(int i = 0; i < TC; i++)
        {
            int status[] = new int[10];     // 0~9까지가 나왔는지에 대한 배열 (초기값은 원래 0)
            int val = sc.nextInt();
            int N = 1;
            while(true)
            {
                int VALUE = val*N;
                 
                String VAL = Integer.toString(VALUE);   // val를 문자열로 만드러
                String VAL_str[] = new String[VAL.length()];    
                // 문자열 길이만큼 배열 생성해
                VAL_str = VAL.split("");    // VAL_str에 쪼개 담아
                for(int j = 0; j < VAL_str.length; j++)
                {
                    int X = Integer.parseInt(VAL_str[j]);
                    for(int k = 0; k < 10; k++)
                    {
                        if(X == k)
                        {
                            //System.out.print(k);
                            if(status[k]!=1)
                            {   
                                status[k] = 1;
                            }
                        }
                    }
                }
                if(status[0]==1 && status[1]==1 && status[2]==1 &&
                    status[3]==1 && status[4]==1 && status[5]==1 && 
                    status[6]==1 && status[7]==1 && status[8]==1 && status[9]==1)
                {
                    TC_Count[i] = VALUE;
                    break;
                }
                N++;
            }   
        }
        for(int i = 0; i < TC; i++)
        {
            System.out.println("#"+(i+1)+" "+ TC_Count[i]);
        }
    }
 
}