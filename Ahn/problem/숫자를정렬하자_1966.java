package problem;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ���ڸ���������_1966 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		�Է¹޴°�
		int t = sc.nextInt();
//		t���� �׽�Ʈ ���̽�
		for (int tc = 0; tc < t; tc++) {
//		n�� ��ŭ�� �Է¹ޱ�
			int n = sc.nextInt();
			int[] arr = new int[n];
			//�迭�� �� �ֱ�
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			// ������������ �����ϱ� ���������̿�
			for (int i = n - 1; i > 0; i--) {
				for (int j = 1; j < i; j++) {
					if (arr[j - 1] > arr[j]) {
						int temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
					}
				}
			}
			System.out.print("#" + (tc + 1) + " ");
			for (int i = 0; i < n; i++)
				System.out.print(arr[i] + " ");
		}

	}
}
