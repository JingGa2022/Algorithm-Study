package problem;

import java.util.Arrays;
import java.util.Scanner;

public class �ĸ���ġ_2001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		// �׽�Ʈ���̽�
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			// �ĸ��� �� �迭
			int[][] fly = new int[N][N];
			// �ĸ� ä���
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++)
					fly[i][j] = sc.nextInt();
			}
			
			int maxF = 0;
			for (int i = 0; i <= N -M; i++) {
				// �������� 0���� N-M����
				for (int j = 0; j <= N-M; j++) {
					// �ĸ�ä�� ���̸�ŭ
					int sum = 0;
					for (int l = i; l < i+M; l++) {
						for (int k = j; k < j+M; k++) {
							sum += fly[l][k];
							}
					}
					if (sum > maxF)
						maxF = sum;
				}
			}
			System.out.printf("#%d %d\n", tc, maxF);
		}
	}
}
