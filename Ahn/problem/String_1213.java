package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class String_1213 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = 1;
		//10���� �׽�Ʈ
		while(tc<=10) {
			tc++;
			int t = sc.nextInt();
			//���� �Է�
			char[] p = sc.next().toCharArray();
			char[] test = sc.next().toCharArray();
			int N = p.length; //������ ����
			int M = test.length; // test�� ����
			int idx = 0; //��ġ�� Ƚ��
			//Brute Force�̿�
			for(int i = 0; i<=M-N; i++) {
				boolean flag = true;
				//���������ϰ� test�� ��
				for(int j = 0; j<N; j++) {
					if(p[j] != test[i+j]) {
						flag = false;
						break;
					}
				}
				if(flag) ++idx;
			}
			//���
			System.out.printf("#%d %d\n",t,idx);
		}
	}
}
