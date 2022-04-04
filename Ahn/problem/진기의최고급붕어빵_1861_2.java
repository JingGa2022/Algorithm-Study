package problem;

import java.util.Arrays;
import java.util.Scanner;

public class �������ְ�޺ؾ_1861_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int N = sc.nextInt();//������ �մ��� ��
			int M = sc.nextInt();//����µ� �ɸ��� �ð�
			int K = sc.nextInt();//�ѹ��� ���� �� �ִ� �׾��� ��
			int[] arrive = new int[N];//�մ� �����ð�
			int ans = 1;
			for(int i =0; i<N; i++) arrive[i] = sc.nextInt();
			Arrays.sort(arrive);
			for(int i =0; i<N; i++) {
				int bread = (arrive[i]/M) * K;
				if(bread < i+1) {
					ans = 0;
				break;
				}
			}
			if(ans == 1)
				System.out.printf("#%d %s\n",tc, "Possible");
			else
				System.out.printf("#%d %s\n",tc, "Impossible");
		}
	}
}