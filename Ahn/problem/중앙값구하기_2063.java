package problem;

import java.util.Scanner;

public class �߾Ӱ����ϱ�_2063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//������ ���� n
		int n = sc.nextInt();
		//�������� �迭
		int[] nBox = new int[n];
		//���� �Է¹ޱ�
		for(int i = 0; i < n; i++) nBox[i] = sc.nextInt();
		//�ּҰ����� �������� ����
		for(int i = 0; i < n; i++) {
			//�ּҰ��� �ε���
			int minV = i;
			//�ּҰ� ������� ���ϴ� �ݺ���
			for(int j = i + 1; j < n; j++) {
				if(nBox[minV] > nBox[j]) minV = j;
			}
			int tmp = nBox[i];
			nBox[i] = nBox[minV];
			nBox[minV] = tmp;
		}
		sc.close();
		//�߰��� ���
		System.out.println(nBox[n / 2]);
	}
}
