package problem;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ���ڸ��������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		�Է¹޴°�
		int t = sc.nextInt();
		
//		t���� �׽�Ʈ ���̽�
		for(int k = 0; k < t; k++) {
			int n = sc.nextInt();
			int[][] arr = new int[t][n];
		
//		n�� ��ŭ�� �Է¹ޱ�
		for(int i = 0; i < n; i++) arr[k][i] = sc.nextInt();
		
		//������������ �����ϱ� ���������̿�
		for(int i = n-1; i > 0 ; i--) {
			for(int j = 1; j < n; j++)
				if(arr[k][j-1] > arr[k][j]) {
					int temp = arr[k][j];
					arr[k][j] = arr[k][j-1];
					arr[k][j-1] = temp;
				}
		}
		System.out.print("#" + (k + 1) + " ");
		for(int i = 0; i < n; i++)
			System.out.print(arr[k][i] + " ");
		System.out.println();
		}
	}
}
