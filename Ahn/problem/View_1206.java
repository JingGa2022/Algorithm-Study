package problem;

import java.util.Scanner;

public class View_1206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//  
		int max = 0;
		int sum = 0;
		int T = 1;
		//10�� �ݺ�
		while(T <= 10) {
			//���� �����Է� �ǹ��迭 �Է�
			int row = sc.nextInt();
			int[] build = new int[row];
		//�ǹ� ���� �Է�
		for(int i = 0; i < row; i++) build[i] = sc.nextInt();
		// ���� �ֺ� �¿�2���� 4�� �� ���� ū ���� �̰�
		for(int n = 2; n < row - 2; n++) {
			int lmax = 0;
			int rmax = 0;
			if(build[n-2] > build[n-1]) lmax = build[n-2];
			else lmax = build[n-1];
			if(build[n+2] > build[n+1]) rmax = build[n+2];
			else rmax = build[n+1];
			if(lmax > rmax) max = lmax;
			else max = rmax;
			// ���ΰ� ���� ū���� ���� 0�̻��̸� ���ϰ� �ƴϸ� �������
			if(build[n] - max > 0) sum += (build[n] - max);
			else continue;
		} 
		System.out.printf("#%d " + sum + "\n", T);
		sum = 0;
		T++;
		}
		
	}
}
