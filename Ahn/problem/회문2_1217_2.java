package problem;

import java.util.Scanner;

public class ȸ��2_1217_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] box = new char[100][100];
		// �׽�Ʈ���̽���ŭ ����
		for (int tc = 1; tc <= 10; tc++) {
			int t = sc.nextInt();
			// 100ĭ�� ���� ����ֱ�
			for (int i = 0; i < 100; i++) {
				// ���ڿ� �־��ֱ�
				box[i] = sc.next().toCharArray();
			}

		}
	}
}