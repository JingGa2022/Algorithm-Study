package problem.����;

import java.util.Scanner;

public class ����ũ����Ʈ_18111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //����
		int M = sc.nextInt(); // ����
		int B = sc.nextInt();//����� ���� ��
		int[][] map = new int[N][N];
		int ans = 0;
		
		int maxV = 0; //�ִ� ����
		int minV = 10000; // �ּ� ����
		int sum = 0;
		for(int i =0; i<N; i++) {
			for(int j =0; j<N; j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] > maxV) maxV = map[i][j];
				else if(map[i][j] < minV) minV = map[i][j];
				sum += map[i][j];
			}
		}
		int mean = (sum + N)/N;
		for(int i =0; i<N; i++) {
			for(int j =0; j<N; j++) {
				if(mean > map[i][j] ) ans++;
				else if(map[i][j] > mean) ans+=2;
			}
		}
		System.out.printf("%d %d",ans, mean);
	}
}
