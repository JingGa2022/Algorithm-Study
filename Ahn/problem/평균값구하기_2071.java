package problem;

import java.util.Scanner;

public class ��հ����ϱ�_2071 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// �׽�ƮȽ��
		int T = sc.nextInt();
		// �Է³ѹ�
		double[] sum = new double[T];

		// sum���� �� �־ ������ ����� ������
		for (int i = 0; i < T; i++) {
			for(int j = 0; j < 10; j++) {
				sum[i] += sc.nextInt();
			}
		}
		for(int i = 1; i <= T; i++)
			System.out.printf("#%d %d\n",i,Math.round(sum[i-1]/10));
	}
}
