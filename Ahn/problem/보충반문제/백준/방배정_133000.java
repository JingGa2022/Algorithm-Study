package problem.����ݹ���.����;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class �����_133000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();// �л���
		int K = sc.nextInt();// ��� �ִ��ο�
		int[][] stu = new int[N][2];// �л��� ����
		int[][] cnt = new int[7][2];//�л��� ī����
		int ans = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++)
				stu[i][j] = sc.nextInt();
		}

		//�г⺰�л�������
			for(int j = 0; j<N ; j++) {
				if(stu[j][0]==0) 
					cnt[stu[j][1]][0]++;
			else if(stu[j][0]==1)
				cnt[stu[j][1]][1]++;
		}
		
			// �г⺰ �л����� �� ���ϱ�
		for (int i = 1; i < 7; i++) {
			for (int j = 0; j < 2; j++)
				if(cnt[i][j]<= K && cnt[i][j]>0) { //0����ũ�� K�Ʒ��ϋ�
					ans++;
				}else if(cnt[i][j]>K) { //k���� �г���� ������
					while(cnt[i][j]>0) {
						cnt[i][j] -=K;
						ans++;
					}
				}
		}
		System.out.println(ans);
		
	}// main
}
