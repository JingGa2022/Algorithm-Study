package problem.����ݹ���;

import java.util.Arrays;
import java.util.Scanner;

public class ������ {
	static int[] dr = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dc = {0, -1, -1 , -1 ,0, 1, 1, 1};
	static int[][] othello;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T; tc++) {
			int N = sc.nextInt(); //������ ���� 4 6 8
			int M = sc.nextInt();//���� ���� Ƚ��
			
			int[][] othello = new int[N+1][N+1];
			
			int S = N/2;
			
			othello[S][S] = othello[S+1][S+1] = 2;
			othello[S][S+1] = othello[S+1][S] = 1;
			
			for(int i =0; i<M; i++) {
				int c =sc.nextInt();
				int r =sc.nextInt();
				int color = sc.nextInt();
				
				othello[r][c] = color;
				//���� ���� �θ鼭 �ٲ��� �� ���� ����
				for(int d=0; d<8; d++) {
					
					int nr = r;
					int nc = c;
					//�ش� d�پ餷���� �� ������鼭 ���� ���� ���� ó�� ���������� �̵�
					while(true) {
						nr += dr[d];
						nc += dc[d];
						if(nr <= 0 || nc <=0 || nr>N || nc>N || othello[nr][nc]==0) break;
						//�������� ������
						if(othello[nr][nc]== color) {
							while(!(nr == r && nc == c)) {
								nr -= dr[d];
								nc -= dc[d];
								othello[nr][nc] = color;
							}
							break;
						}
					}
				}
			}//������ ������
			
			int bCnt = 0;
			int wCnt = 0;
			
			int[] ans = new int[3];
			for(int i =1; i<=N; i++) {
				for(int j =1; j <=N; j++) {
					if(othello[i][j]==1) {
						bCnt++;
					}else if(othello[i][j] == 2) {
						wCnt++;
					}
				}
			}
			System.out.println(());
		}
	}//main
	
	public static void printo() {
		for(int i =0; i<othello.length; i++) {
			System.out.println(Arrays.toString(othello[i]));
		}
	}
}
