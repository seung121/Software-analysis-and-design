#include <stdio.h>
#include <stdlib.h>

void change(int money, int** arr, int n) {
	int i = 0;
	int list[8] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
	while (i < 8) {
		while (money >= list[i]) {
			arr[n][i] = money / list[i];
			money %= list[i];
		}
		i++;
	}
}

int main(void) {
	int n;
	scanf("%d", &n);

	// 2차원 배열을 동적할당 하여 입력받을 개수 n만큼 n * 8의 2차원 배열을 만든다
	int **arr = NULL;
	arr = (int**)malloc(sizeof(int*) * n);

	for (int i = 0; i < n; i++) {
		arr[i] = (int*)malloc(sizeof(int) * 8);
	}

	// 돈을 넣어둘 배열도 따로 만듦 n * 9 크기의 배열을 사용해도 되나, 보기 편하도록
	int *money = (int*)malloc(sizeof(int) * n);

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < 8; j++) {
			arr[i][j] = 0;
		}
	}
	for (int i = 0; i < n; i++) {
		scanf("%d", &money[i]);
		change(money[i], arr, i);
			//void change(int money, int** arr, int n)
	}
	for (int i = 0; i < n; i++) {
		printf("#%d\n", i + 1);
		for (int j = 0; j < 8; j++) {
			printf("%d ", arr[i][j]);
		}
		printf("\n");
	}
}