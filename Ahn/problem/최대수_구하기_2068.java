package problem;

import java.util.Scanner;

public class �ִ��_���ϱ�_2068 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// �׽�Ʈ Ƚ���� �޴´�
		int T = sc.nextInt();
		int[] tc = new int[10];
		// �ִ밪�� ���� �迭�� �����.
		int[] max_num = new int[T];

		// ������ �˰����� �̿��� �ִ밪�� ã�ƺ���.
		// T���� �׽�Ʈ�� �����Ѵ�.
		for (int i = 0; i < T; i++) {
			// 10���� ���ڰ� �ֱ⶧���� 10�� �����Ѵ�.
			for (int j = 0; j < 10; j++)
				// ���� 10�� �ޱ�
				tc[j] = sc.nextInt();
			for (int j = 0; j < 10; j++) {
				// �ִ밪�� �ε���
				int max = j;
				for (int k = j + 1; k < 10; k++) {
					if (tc[k] >= tc[max])
						max = k;
				}
				int tmp = tc[j];
				tc[j] = tc[max];
				tc[max] = tmp;
			}
			max_num[i] = tc[0];
		}
		for (int i = 0; i < T; i++)
			System.out.printf("#%d %d\n", i + 1, max_num[i]);
	}
}
