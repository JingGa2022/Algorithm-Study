package problem.����ݹ���;

import java.util.Arrays;
import java.util.Scanner;

public class �������ǹ����ѱ��̱��ϱ�_7236 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			char[][] puddle = new char[N][N];
			int max = 1;//�ִ밪
			int cnt = 0;//
			for(int i = 0; i<N; i++) {
				for(int j =0; j<N; j++)
					puddle[i][j] = sc.next().charAt(0);
				}
			int[] dr = {-1, -1, 0, +1, +1, +1, 0, -1};//��Ÿ�� 8���� Ž���� ���� �̵����� 12�ú��� �ð�ݴ����
			int[] dc = {0, -1, -1, -1, 0, +1, +1, +1}; 
			for(int i = 0; i<N; i++) {
				for(int j =0; j<N; j++) {
					cnt = 0;
					if(puddle[i][j]=='W') {
					for(int k = 0; k<8; k++) {
							if(i+dr[k]<0 || i+dr[k]>=N || j+dc[k]<0 || j+dc[k]>=N ) {}
							else if(puddle[i+dr[k]][j+dc[k]]=='W') cnt++;
						}
					}//8���� Ž��
					if(cnt>max) max = cnt;
					}//j�� ����
				}//i�� ����
			//�Է��� �޾Ƽ� 1,1���� N-2,N-2���� Ȯ���ϸ� W�ϰ�� �ֺ��θ� Ȯ���Ͽ� ���̸� ���ϰ�, �� ���� �ִ�ġ�� ����
			System.out.printf("#%d %d\n",tc,max);
		}
		
	}
}
