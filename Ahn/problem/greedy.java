package problem;

public class greedy {
	public static void main(String[] args) {
		int[] cards = { 4, 3, 6};
		
		int[] cnt = new int[12];
		for(int i = 0; i<cards.length; i++) {
			cnt[cards[i]]++;
		}
		//�ش� i��° ī�� �˻�
		int i = 0;
		while(i < 10) {
			if(cnt[i] >= 3) {
				cnt[i] -= 3;
				System.out.println("triplet�̶��");
			}
			if(cnt[i]>=1 && cnt[i+1] >=1 && cnt[i+2] >= 1) {
				cnt[i]--;
				cnt[i+1]--;
				cnt[i+2]--;
				System.out.println("Run �̶��");
			}
			i++;
		}
		
	}
}
