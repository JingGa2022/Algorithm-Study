package problem;

import java.util.Scanner;

public class ������_369_����_1926 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String input = "";
//		���� �Է¹ޱ�
		for(int i = 1; i<=N; i++) {
			int cnt = 0;
			//����
			String num = Integer.toString(i);
			for(int j = 0; j<num.length(); j++) {
				if(num.charAt(j) == '3' || num.charAt(j) == '6' || num.charAt(j) == '9') {
					cnt++;		
				}
			}
			if(cnt == 1) input += "- ";
			else if(cnt == 2) input +="-- ";
			else if(cnt == 3) input +="--- ";
			if(!num.contains("3") && !num.contains("6") && !num.contains("9")) 
			input += (num + " ");}
		//���
		System.out.println(input);
	}
}
