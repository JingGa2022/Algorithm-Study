package problem;

import java.util.Arrays;
import java.util.Scanner;

public class �߰���հ����ϱ�_1984 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		//
		for(int tc = 1; tc <= t; tc++) {
			int[] box = new int[10];
			for(int i = 0; i < 10; i++) {
				box[i] = sc.nextInt();
			}
			Arrays.sort(box);
			//�迭�� ��
			double sum = 0;
			for(int i = 1; i < 9; i++) {
				sum += box[i];
			}
			System.out.printf("#%d %d\n",tc, Math.round(sum/8));
		}
	}
}
