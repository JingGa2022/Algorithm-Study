package problem;

import java.util.Scanner;

public class �ܹ��Ŵ��̾�Ʈ_5215 {
	public static int N, L;
	public static int[] score, calorie;
	public static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			N = sc.nextInt();
			L = sc.nextInt();
			ans=0;
			score = new int[N];
			calorie = new int[N];
			
			for(int i  =0; i<N; i++) {
				score[i] = sc.nextInt();
				calorie[i] = sc.nextInt();
			}
			
			//��Ʈ���� �̿� 
			for(int i =0; i<(1<<N); i++) {
				int sumScore = 0;
				int sumCal = 0;
				//i���� �ܹ��� ����
				for(int j =0; j<N; j++) {
					if((i & (1 << j)) > 0) {
						sumScore += score[j];
						sumCal += calorie[i];
					}
				}
				if(sumCal <= L) {
					ans = Math.max(ans, sumScore);
				}
			}
			System.out.println("#"+tc+""+ans);
		}
	}//main�Լ�
	
	public static void cook() {
		//�⺻
		//���
	}
}
