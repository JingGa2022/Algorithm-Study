package problem;

import java.util.Scanner;

public class ���ӵ�_1��_����_��_�ִ밪_���ϱ�_13636 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// �׽�Ʈ ����
		int T = sc.nextInt();
		//
		for (int tc = 1; tc <= T; tc++) {
			// ������ �ִ� �迭
			int N = sc.nextInt();
			// ���ڸ� ���ڷ� �д�
			String num = sc.next();
			// �Ѱ��� �߶� �־���
			char[] box = num.toCharArray();
			int cnt = 0;
			int max = 0;
			// ���ӵ� 1�� ���� ���ϱ�
			for (int i = 0; i < box.length; i++) {
				if (Character.toString(box[i]).equals("1")) {
					cnt++;
					if (cnt > max)
						max = cnt;
				} else
					cnt = 0;
			}
			System.out.printf("#%d %d\n", tc, max);
		}
	}
}
