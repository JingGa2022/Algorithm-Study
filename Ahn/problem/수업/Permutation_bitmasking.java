package problem.수업;

import java.util.Arrays;

public class Permutation_bitmasking {
	static int[] nums;
	static int[] result;
	static int N;
	
	public static void main(String[] args) {
		N = 3;
		nums = new int[] {0,1,2};
		result = new int[N];
		
		perm(0,0);
	}
	private static void perm(int idx, int visited) {
		if(idx==N) {
			System.out.println(Arrays.toString(result));
			return;
		}
		
	
		for(int i =0; i<N; i++) {
		//현재 i번쨰 원소를 사용했는지
			if((visited & (1<<i)) !=0) {
				continue;
			}
			result[idx] = nums[i];
			perm(idx+1, visited | 1<<i);
	}
}
}
