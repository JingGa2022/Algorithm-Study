package problem;

import java.util.Scanner;
public class Sum_1209 {
	static int sum = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�׽�Ʈ���̽��� ��������
		for(int tc = 1; tc <= 10; tc++) {
			int T = sc.nextInt();
			//���ڸ� �Է¹޴´�
			int[][] box = new int[100][100];
			for(int i = 0; i < 100; i++) {
				for(int j = 0; j < 100; j++) {
					box[i][j] = sc.nextInt();
				}
			}
			int max = 0;
			//�� ���ϰ� �ִ밪
			for(int i = 0; i<100; i++) {
				sum = 0;
				for(int j = 0; j<100; j++) {
					sum += box[i][j+(99-2*j)*(i%2)];
				}
				if(sum > max) max = sum;
			}
			//�� ���ϰ� �ִ밪
			for(int i = 0; i<100; i++) {
				sum = 0;
				for(int j = 0; j<100; j++) {
					sum += box[j+(99-2*j)*(i%2)][i];
				}
				if(sum > max) max = sum;
			}
			//�밢�� ���ϰ� �ִ밪
			sum = 0;
			for(int i = 0; i<100; i++) {
				sum += box[i][i];
			} if(sum > max) max = sum;
			sum = 0;
			for(int i = 99; i >= 0; i--) {
				sum += box[i][i];
			} if(sum > max) max = sum;
			//�ִ밪 ���
			System.out.printf("#%d %d\n", tc, max);
		}
	}
}
