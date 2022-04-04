package problem;

import java.util.Scanner;

public class �κм�������_2817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�׽�Ʈ ���̽�
		int t = sc.nextInt();
		for(int tc = 1; tc <= t; tc++) {
		//������ ũ�� 
		int N = sc.nextInt();
		//�� ������
		int A = sc.nextInt();
		//�׽�Ʈ ���̽���ŭ ������
		int[] box = new int[N];
		//A�� ���հ���
		int[] cnt = new int[1];
		//����ũ�⸸ŭ�� boolean �迭�� ���ڰ� ��  box �迭
		boolean[] sel = new boolean[N];
		//box�� ���ڳֱ�
		for(int i = 0; i < N; i++) box[i] = sc.nextInt();
		powerset(0, sel, box, A, cnt);
		System.out.printf("#%d %d\n",tc, cnt[0]);
		}
	}
	
	public static void powerset(int idx, boolean[] sel, int[] box, int A, int[] cnt) {
		//�� 
		int sum = 0;
		if(idx == sel.length) {
			for(int i = 0; i < sel.length; i++) {
				if(sel[i])
				sum += box[i];
			}
			//A�� �κ������� ���� ������
			if(sum == A)
			cnt[0]++;
			return;
		}
		
		sel[idx] = true;
		powerset(idx + 1, sel, box, A, cnt);
		sel[idx] = false;
		powerset(idx + 1, sel, box, A, cnt);
		if(idx == 0) return;
	}
}
