#include <stdio.h>
#include <stdlib.h>
 
int main(void) {
    int T, N;
    scanf("%d", &T);
 
    int TC[1000];
 
    for (int i = 0; i < T; i++) {
        scanf("%d", &N);
        for (int j = 0; j < 1000; j++)
            scanf("%d", &TC[j]);
 
        int count[101] = { 0 };
 
        int maxCount = 0;
        int maxNum = 0;
 
        for (int k = 0; k < 1000; k++) 
            count[TC[k]] += 1;
 
        for (int l = 0; l < 100; l++) {
            if (maxCount < count[l] || (maxCount == count[l]) && maxNum < l) {
                maxCount = count[l];
                maxNum = l;
            }
        }
        printf("#%d %d\n", N, maxNum);
    }
}