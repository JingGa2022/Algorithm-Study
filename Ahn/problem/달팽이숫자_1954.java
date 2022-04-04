package problem;

import java.util.Scanner;

public class �����̼���_1954 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		//t�� �ݺ�
		for(int tc = 1; tc <= t; tc++) {
			//�ڽ� ũ��
			int N = sc.nextInt();
			//�ڽ������
			int[][] box = new int[N][N];
			//�� �ε��� �� �ε���
			int row = 0;
			int col = 0;
			int cnt = 0;
			while(cnt < N*N) {
				while(col < N && box[row][col] == 0) {
					box[row][col] = ++cnt;
					col++;
				}
				col--;
				row++;
				while(row < N && box[row][col] == 0) {
					box[row][col] = ++cnt;
					row++;
				}
				col--;
				row--;
				while(col >=0 && box[row][col] == 0) {
					box[row][col] = ++cnt;
					col--;
				}
				col++;
				row--;
				while(row >= 0 && box[row][col] == 0) {
					box[row][col] = ++cnt;
					row--;
				}
				col++;
				row++;
			}
			
			System.out.printf("#%d\n",tc);
			for(int i =0; i<N; i++) {
				for(int j =0; j<N; j++) {
					System.out.print(box[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
//	if(idr == 4)
//		dir0;
//	dir=(dir+1)%4;
	//��Ÿ�� �̿��� ���
	
	//2. ��Ģ�� ã��
	//�����̵��� �����̵������� ��Ģ�� ã�� �� �ִ�.
	//����� ����    ����  ����    ���   ����   �న ����    ��� ����
}
