package problem;

import java.util.Scanner;

public class �ݹ��Ŵ��̾�Ʈ_5215_��� {
	public static int N, L;
	public static int[] score, calorie;
	public static int ans;
	public static boolean[] sel;
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
			cook(0, sumScore, sumCal);
			System.out.println("#"+tc+""+ans);
		}
	}//main�Լ�
	//�Ű����� ��� �߰������� �� �־��� ���
	//�� ��Ḧ �˼��� ����.
	public static void cook(int idx, int sumScore, int sumCal) {
		//�⺻
		//�ϴ� �ܹ��� ������ ���
		if(sumCal > L) return; //��Ʈ��ŷ :�ʿ���°� ó����
		if(idx>=N) {
			//��Ǵ��� �ʿ��Ѱ�?
			if(sumCal<=L)
				ans = Math.max(ans, sumScore);
			return;
		}
		
		//���
		//�̰���
		cook(idx+1, sumScore+score[idx], sumCal+calorie[idx]);
		//�Ȼ̰���
		cook(idx+1, sumScore, sumCal);
	}
	
	
	
//	public static void cook(int idx) {
//		//�⺻
//		//�ܹ��� ��� ��� �� ������ϰ� �Ǵܸ� ����
//		if(idx >= N) {
//			int sumScore = 0;
//			int sumCal = 0;
//			//��� �˻�
//			for(int i =0; i<N; i++) {
//				if(sel[i]) {
//					sumScore += score[i];
//					sumCal += calorie[i];
//				}
//			}
//			if(sumCal <= L) {
//				ans = Math.max(ans,  sumScore);
//			}
//			return;
//		}
//		
//		//���
//		//�ش� idx���� ��� ���
//		sel[idx] = true;
//		cook(idx+1);
//		sel[idx] = false;
//		cook(idx +1);
//	}
}