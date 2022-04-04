package problem;

import java.util.Scanner;

public class ȸ��2_1216 {
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
			int maxL = 0;
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					if (100 - Math.min(i, j) <= maxL)
						continue;
					maxL = Math.max(maxL, maxPal(box, i, j));
				}
			}
			System.out.printf("#%d %d\n", t, maxL);
		}
	}

	// ȸ���� �ְ���̸� Ȯ���ϴ� �޼���
	public static int maxPal(char[][] box, int y, int x) {
		int max = 0;
		int p1 = x;
		int p2 = 99;
		while (p1 <= p2) {
			if (box[y][p1] != box[y][p2]) {
				p2--;
				continue;
			}
			int tmp = p2;
			boolean flag = true;
			while (p1 <= p2) {
				if (box[y][p1] != box[y][p2]) {
					flag = false;
					break;
				}
				p1++;
				p2--;
			}
			p1 = x;
			p2 = tmp - 1;
		}
		p1 = y;
		p2 = 99;
		while (p1 <= p2) {
			if (box[p1][x] != box[p2][x]) {
				p2--;
				continue;
			}
			int tmp = p2;
			boolean flag = true;
			while (p1 <= p2) {
				if (box[p1][x] != box[p2][x]) {
					flag = false;
					break;
				}
				p1++;
				p2--;
			}
			if (flag) {
				max = Math.max(max, tmp - y + 1);
				break;
			}
			p1 = y;
			p2 = tmp - 1;
		}
		return max;

	}

}