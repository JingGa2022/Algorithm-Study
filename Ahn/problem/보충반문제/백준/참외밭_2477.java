package problem.����ݹ���.����;

import java.util.Scanner;

public class ���ܹ�_2477 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fruits = sc.nextInt();//������ ��
		int[][] farm = new int[6][2];
		for(int i = 0; i<6; i++) {
			for(int j =0; j<2; j++) farm[i][j] = sc.nextInt();
		}//��ü �ݺ��� ����
		int areaB = farm[0][1] * farm[1][1];// ù���� �ι����� ū �簢���� ����
		int areaS = farm[3][1] * farm[4][1];// �׹��� �ټ������� ���� �簢���� ����
		int area = areaB - areaS; //������ ����
		System.out.println(area*fruits);
	}//main
}
