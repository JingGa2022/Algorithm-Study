package problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ��ȣ��1_1228 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();//���� ��ȣ���� ����
			List<Integer> code = new ArrayList<>();//���� ��ȣ��
			for(int i = 0; i<N; i++) code.add(sc.nextInt());
			int M = sc.nextInt(); //��ɾ��� ����
			for(int i =0; i<M; i++) {
				String start = sc.next(); // ��ɹ��� ����
				int x = sc.nextInt();//x�� ��ġ
				int y = sc.nextInt();//y���� ����
				for(int j = 0; j<y; j++) code.add(x+j, sc.nextInt());
			}
			System.out.printf("#%d ",tc);
			for(int i = 0; i<10; i++) {
				System.out.print(code.get(i)+" ");
			}
			System.out.println();
		}
	}
}
