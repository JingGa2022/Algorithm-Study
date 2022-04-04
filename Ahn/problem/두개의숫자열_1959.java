package problem;

import java.util.Scanner;

public class �ΰ��Ǽ��ڿ�_1959 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�׽�Ʈ ���̽� ��
		int t = sc.nextInt();
		//�׽�Ʈ ����
		for(int tc = 1; tc <= t; tc++) {
			//��������
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] A = new int[n];
		int[] B = new int[m];
		for(int i = 0; i < n; i++) A[i] = sc.nextInt();
		for(int i = 0; i < m; i++) B[i] = sc.nextInt();
		int maxV = 0;
		//n>m�϶�
		if(n > m) {
			for(int i = 0; i<=n-m; i++) {
				int sum = 0;
				for(int j = 0; j<m; j++) {
					sum += A[j + i] * B[j];
				}
				if(sum > maxV) maxV = sum;
			}
		}else {
			for(int i = 0; i<=m-n; i++) {
				int sum = 0;
				for(int j = 0; j<n; j++) {
					sum += A[j] * B[j + i];
				}
				if(sum > maxV) maxV = sum;
			}
		}
		System.out.printf("#%d %d\n", tc, maxV);
		}
	}
}
