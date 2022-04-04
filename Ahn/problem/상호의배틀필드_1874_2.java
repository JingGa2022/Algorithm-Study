package problem;

import java.util.Scanner;

public class ��ȣ�ǹ�Ʋ�ʵ�_1874_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int y = 0;// ��ũ�� ����ġ
			int x = 0;// ��ũ�� ����ġ
			char[][] map = new char[H][W];
			for (int i = 0; i < H; i++) {
				String tmp = sc.next();
				map[i] = tmp.toCharArray();
				for (int j = 0; j < W; j++) {
					if (map[i][j] == '^' || map[i][j] == 'v' || map[i][j] == '<' || map[i][j] == '>') {
						y = i;
						x = j;// ��ũ�� ��ġ ����
					} // if
				}
			}
			int N = sc.nextInt(); // ����� �Է��� ����
			String input = sc.next();
			///// ������� �Էºκ�/////////////

			///// ��ư ������//////
			char[] push = new char[N];
			push = input.toCharArray();

			///// ��ũ �����ϱ�/////
			for (int i = 0; i < N; i++) {
				int[] dr = { -1, 0, +1, 0 };
				int[] dc = { 0, -1, 0, +1 };
				switch (push[i]) {
				case 'U':
					map[y][x] = '^';
					if(y+ dr[0]>=0 && map[y+ dr[0]][x] == '.') { 
						y += dr[0];
						map[y][x] = '^';
						map[y-dr[0]][x] = '.';
					}
					break;
				case 'D':
					map[y][x] = 'v';
					if(y+ dr[2]<H && map[y+ dr[2]][x] == '.') {
						y += dr[2];
						map[y][x] = 'v';
						map[y-dr[2]][x] = '.';
					}
					break;
				case 'L':
					map[y][x] = '<';
					if(x + dc[1]>=0 && map[y][x + dc[1]] == '.') {
						x += dc[1];
						map[y][x] = '<';
						map[y][x-dc[1]] = '.';
					}
					break;
				case 'R':
					map[y][x] = '>';
					if(x + dc[3]<W && map[y][x + dc[3]] == '.') {
						x += dc[3];
						map[y][x] = '>';
						map[y][x-dc[3]] = '.';
					}
					break;
				///// �� �߻�//////
				default:
					switch (map[y][x]) {
					case '^':// ���⿡ ���缭 ���� ���
						while(y+dr[0] >=0) {
							if(map[y+dr[0]][x] == '*') {
								map[y+dr[0]][x] = '.';
								break;
							}else if(map[y+dr[0]][x] == '#') break;
							dr[0]--;
						}
						break;
					case 'v':
						while(y+dr[2] < H) {
							if(map[y+dr[2]][x] == '*') {
								map[y+dr[2]][x] = '.';
								break;
							}else if(map[y+dr[2]][x] == '#') break;
							dr[2]++;
						}
						break;
					case '<':
						while(x+dc[1] >=0) {
							if(map[y][x + dc[1]] == '*') {
								map[y][x + dc[1]] = '.';
								break;
							}else if(map[y][x + dc[1]] == '#') break;
							dc[1]--;
						}
						break;
					case '>':
						while(x+dc[3] < W) {
							if(map[y][x+dc[3]] == '*') {
								map[y][x+dc[3]] = '.';
								break;
							}else if(map[y][x+dc[3]] == '#') break;
							dc[3]++;
						}
						break;
					} // switch
				}
			}
			System.out.printf("#%d ", tc);
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			} // ��� ��ȯ ����
		} // TestCase
	}// main
}
