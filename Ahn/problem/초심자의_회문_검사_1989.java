package problem;

import java.util.Scanner;

//���ڿ��� �ڿ��� ���� ����
public class �ʽ�����_ȸ��_�˻�_1989 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//����
		int T = sc.nextInt();
		//�ݺ������� ���� �ٲٱ�
		for(int tc = 1; tc <= T; tc++) {
			//������ ���ڿ�
			String letter = sc.next();
			String reverse = "";
			for(int i = letter.length()-1; i >= 0; i--) {
				reverse += letter.charAt(i);
			}
			System.out.printf("#%d %d\n", tc ,isEqual(letter, reverse));
		}
	}
	//���ڰ� ������ �˷��ִ� �޼���
	public static int isEqual(String letter, String reverse) {
	if(reverse.equals(letter)) {
		return 1;
	}else return 0;}
}
