package problem.����ݹ���;

import java.util.Scanner;

public class Magnetic_1220 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isRed = false; //���������ٱ� �Ķ������ٱ�..?
		for(int tc = 1; tc<=10; tc++) {
			int N = sc.nextInt();
			int ans = 0;
			int[][] table = new int[N][N];
			for(int i=0; i<N;i++) {
				for(int j=0; j<N;j++) table[i][j] = sc.nextInt();
			}//�Է�
			for(int i=0; i<N;i++) {
				isRed = false;//������ �ʱ�ȭ �����ٰ�
				for(int j=0; j<N;j++) {
					if(table[j][i] == 1) {
						isRed = true;//������
					}else if(table[j][i] == 2) {
						if(isRed) ans++;
						isRed = false;//�Ķ���
					}
				}
			}//����ã��
			System.out.printf("#%d %d\n",tc,ans);
		}
		
	}//main
}
