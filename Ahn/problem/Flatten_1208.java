package problem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Flatten_1208 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//������ ���� �Է¼��� �����ʴ�
		for(int tc = 1; tc <= 10; tc++) {
			//������ ��
			int num = sc.nextInt();
			int[] box = new int[100];
			//���� �Է¹ޱ�
			for(int i = 0; i < 100; i++) box[i] = sc.nextInt();
			//�����ϴ� �ݺ���
			for(int k = 0; k < num; k++) {
				//�������� ��������
				sort(box);
				//���ν���
				if(box[99] - box[0] != 0) {
				box[0] += 1; box[99] -= 1;
				}else break;
			}
			//�������� ��������
			sort(box);
			System.out.printf("#%d %d\n", tc, (box[99] - box[0]));
			
		}
	}
	
	public static void sort(int[] box) {
		//���������ϴ� �ݺ��� �������Ĺ���̿�
		for(int i =0; i < 100; i++) {
			for(int j = i + 1; j < 100; j++) {
				if(box[i] > box[j]) {
					int tmp = box[i];
					box[i] = box[j];
					box[j] = tmp;
				}
			}
		}
	}
}
