package problem;

import java.util.Arrays;
import java.util.Scanner;

public class �������ְ�޺ؾ_1860 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int N = sc.nextInt();//������ �մ��� ��
			int M = sc.nextInt();//����µ� �ɸ��� �ð�
			int K = sc.nextInt();//�ѹ��� ���� �� �ִ� �׾��� ��
			int[] arrive = new int[N];//�մ� �����ð�
			int ans = 1;
			int[] sell = new int[11112]; //�ε����� �� ����� ������ �ð�
			//�ش� �ð��� �� ����� ý
			for(int i =0; i<N; i++) {
				int time = sc.nextInt();
				sell[time]++;
			}
			int bread = 0;
			for(int i =0; i<sell.length; i++) {
				if(i>0 && i%M==0)//�������
					bread += K;
				bread -= sell[i]; //1�ʿ� �� ����� ��ŭ ���� �Ȱڴ�.
				if(bread<0) {
					ans = 0;
					break;
				}
			}
			//1��Ǯ��
//			//���մ��� �ö� �ؾ�� �֤�����
//			for(int i = 0; i<N; i++) arrive[i]=sc.nextInt();
//			Arrays.sort(arrive);//����
//			for(int i =0; i<N; i++) {
//				int bread = (arrive[i]/M) *K;//�ش�ð��� ������ִ� ���� �ѷ��� ������ �մ� ������ ���ٸ� �ȵ�
//				if(bread < i+1) {
//					ans = 0;
//					break;
//				}
//			}
			
			if(ans == 1)
				System.out.printf("#%d %s\n",tc, "Possible");
			else
				System.out.printf("#%d %s\n",tc, "Impossible");
		}
	}
}
//
//for(int i = 0; i<N; i++) arrive[i]=sc.nextInt();
//Arrays.sort(arrive);//����
//if(arrive[0]>M) ans = 0;//
//for(int i =1; i<N; i++) {
//	int gap = Math.abs(arrive[i] - arrive[i-1]);//�մ԰� �ð���
//	int overlap = 0;
//	for(int j : arrive) {//�մ��� �ð��� ��ĥ��
//		if(arrive[0] == arrive[i]) overlap++;
//		if(j == arrive[i]) overlap++;
//	}
//	if(M/K > gap) ans = 0; //�ð����� 1�� ����ӵ����� ������	
//	if(overlap > 0 && overlap/arrive[i] > M/K) ans = 0; //�ʴ� �մ��� �ʴ� ���귮���� Ŭ���
//}