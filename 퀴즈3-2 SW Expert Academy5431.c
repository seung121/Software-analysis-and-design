#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    int TC, total, submit, temp;
    scanf("%d", &TC);

    for (int i = 0; i < TC; i++)
    {
        scanf("%d %d", &total, &submit);

        int *arr = (int *)malloc(sizeof(int) * total);
        for (int j = 0; j < total; j++)
            arr[j] = 0;

        for (int j = 0; j < submit; j++)
        {
            scanf("%d", &temp);
            arr[temp - 1] = 1;
        }

        printf("#%d ", i + 1);

        for (int j = 0; j < total; j++)
        {
            if (arr[j] == 0)
            {
                printf("%d ", j + 1);
            }
        }
        printf("\n");
    }
}