package problem.����ݹ���.����;

import java.util.Scanner;

public class ������_10163 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();// ������ ���
		int[][] box = new int[1001][1001];// ��üũ��
		//���� ����ֱ�
		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();// ��������ǥ
			int b = sc.nextInt();// ��������ǥ
			int row = sc.nextInt();// ������ ����
			int col = sc.nextInt();// ������ ����
			for (int i = a; i < a + row; i++) {
				for (int j = b; j < b + col; j++) {
					box[i][j] = tc;
				}
			}
		}
		//���̺� �巯���� �� ���ϱ�
		for (int tc = 1; tc <= T; tc++) {
			int ans = 0;
			for (int i = 0; i < 1001; i++) {
				for (int j = 0; j < 1001; j++) {
					if (box[i][j] == tc) 
						ans++;
				}
			} System.out.println(ans);
		}
	}//main
}
