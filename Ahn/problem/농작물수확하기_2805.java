package problem;

import java.util.Arrays;
import java.util.Scanner;

public class ���۹���Ȯ�ϱ�_2805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int N = sc.nextInt();
			//���� �Է�
			int[][] num = new int[N][N];
			for(int i = 0; i<N; i++) {
				String tmp = sc.next(); 
				for(int j = 0; j<N; j++) {
					num[i][j] = tmp.charAt(j)-'0'; //-48�� �E ���� �ִ�.
				}
			}
			// .split() => ���ڿ�(String)���� .tocharArray() => char�迭
			//���ڷιޱ�
			
//			//���ں���
//			int[][] box = new int[N][N];
//			int cnt = 1;
//			while(cnt != 0) {
//				int tmp = 0;
//				for(int i = 0; i<N; i++) {
//					for(int j = N-1; j>=0; j--) {
//				tmp = num[i]%10;
//				num[i]/=10;
//					box[i][j] = tmp;}
//				if(num[i] == 0) cnt --;		
//			}}
//			System.out.println(Arrays.deepToString(box));
			
			int sum = 0;
			//�����
			for(int i = 0; i < N; i++) sum+=num[N/2][i];
			int k = 0;
			for(int i = N/2 -1; i >= 0; i--) {
				k++;
				for(int j = 1; j<N - k; j++) {
					sum += num[i][j];
				}
			}
			k = 0;
			for(int i = N/2 + 1; i < N; i++) {
				k++;
				for(int j = 1; j<N - k; j++) {
					sum += num[i][j];
				}
			}
			System.out.printf("#%d %d\n", tc, sum);
		}
	}
}
