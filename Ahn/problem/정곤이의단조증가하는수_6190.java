package problem;

import java.util.Arrays;
import java.util.Scanner;

public class �������Ǵ��������ϴ¼�_6190 {
	static boolean flag;// ���� �������� Ȯ��

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();// ������ ����
			int[] A = new int[N];
			for (int i = 0; i < N; i++)
				A[i] = sc.nextInt();
			int times = 0;// ��
			String num = new String();// ���� ���� ���ڿ� �����
			int max = 0;
			if (N > 1) {
				for (int i = 0; i < N; i++) {
					for (int j = i + 1; j < N; j++) {
						times = A[i] * A[j];
						if (times > 10) {
							num = Integer.toString(times);
							char[] mono = num.toCharArray(); // �����ڸ���
							flag = true;
							for (int k = 0; k < mono.length - 1; k++) {// ������������ �˻�
								if (mono[k] > mono[k + 1])
									flag = false;
							}
						}
						if (flag) {
							if (times > max)
								max = times;// ����ū ���������� ã��
						}
					}
				}
			} // N�� 1���� Ŭ��
			else {
				times = A[0];
				if (times > 10) {
					num = Integer.toString(times);
					char[] mono = num.toCharArray(); // �����ڸ���
					flag = true;
					for (int k = 0; k < mono.length - 1; k++) {// ������������ �˻�
						if (mono[k] > mono[k + 1])
							flag = false;
					}
				}
				if (flag) {
					if (times > max)
						max = times;// ����ū ���������� ã��
				}
			} // N�� 1�϶�
			if(max==0) max = -1;//
			System.out.printf("#%d %d\n", tc, max);
		}
	}
}
