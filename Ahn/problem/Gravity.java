package problem;

import java.util.Scanner;

public class Gravity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�Է¹ޱ�
		int row = sc.nextInt();
		int[] arr = new int[row];
		int max = 0;
		
		//row�� ��ŭ �Է¹ޱ�
		for(int i = 0; i < row; i ++) arr[i] = sc.nextInt();
		
		//row�� ��
		for(int i = 0; i < arr.length; i++) {
			//�ִ� ����
			int cnt = arr.length - 1 - i;
			for(int j = 1 + i; j < row; j++) {
				if(arr[i] <= arr[j]) cnt--;
			}
			if(max < cnt) max = cnt;
		}
		System.out.println(max);
	}
}
