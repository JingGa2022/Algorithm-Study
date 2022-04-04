package problem;

import java.util.Scanner;

public class ��ȣ�ǹ�Ʋ�ʵ�_1873 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int y = 0;// ��ũ�� ����ġ
			int x = 0;// ��ũ�� ����ġ
			int focus = -1;// ��ũ�� �⺻���� U:0 L:1 D:2 R:3
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
			int N = sc.nextInt(); // ����� �Է�
			String input = sc.next();
			///// ������� �Էºκ�/////////////

			///// ��ư ������//////
			char[] push = new char[input.length()];
			push = input.toCharArray();

			///// ��ũ �����ϱ�/////
			int[] dr = { -1, 0, +1, 0 };
			int[] dc = { 0, -1, 0, +1 };
			for (int i = 0; i < push.length; i++) {
				switch (push[i]) {
				case 'U':
					if (y + dr[0] >= 0 || x + dc[0] >= 0 || y + dr[0] < W || x + dc[0] < H
							|| map[y + dr[0]][x + dc[0]] != '*' || map[y + dr[0]][x + dc[0]] != '#'
							|| map[y + dr[0]][x + dc[0]] != '-') { // ��ũ�� ������ ����ų� ���� �ְų� ���� ������ ����
						y += dr[0];
						x += dc[0];
						if (y >= 0 || x >= 0 || y < W || x < H || map[y][x] != '*' || map[y][x] != '#'
								|| map[y][x] != '-') {
							map[y - dr[0]][x - dc[0]] = '.';
							map[y][x] = '^';
						}
					}
					break;
				case 'D':
					if (y + dr[2] >= 0 || x + dc[2] >= 0 || y + dr[2] < W || x + dc[2] < H
							|| map[y + dr[2]][x + dc[2]] != '*' || map[y + dr[2]][x + dc[2]] != '#'
							|| map[y + dr[2]][x + dc[2]] != '-') {
						y += dr[2];
						x += dc[2];
						if (y >= 0 || x >= 0 || y < W || x < H || map[y][x] != '*' || map[y][x] != '#'
								|| map[y][x] != '-') {
							map[y - dr[2]][x - dc[2]] = '.';
							map[y][x] = 'v';
						}
					}
					break;
				case 'L':
					if (y + dr[1] >= 0 || x + dc[1] >= 0 || y + dr[1] < W || x + dc[1] < H
							|| map[y + dr[1]][x + dc[1]] != '*' || map[y + dr[1]][x + dc[1]] != '#'
							|| map[y + dr[1]][x + dc[1]] != '-') {
						y += dr[1];
						x += dc[1];
						if (y >= 0 || x >= 0 || y < W || x < H || map[y][x] != '*' || map[y][x] != '#'
								|| map[y][x] != '-') {
							map[y - dr[1]][x - dc[1]] = '.';
							map[y][x] = '<';
						}
					}
					break;
				case 'R':
					if (y + dr[3] >= 0 || x + dc[3] >= 0 || y + dr[3] < W || x + dc[3] < H
							|| map[y + dr[3]][x + dc[3]] != '*' || map[y + dr[3]][x + dc[3]] != '#'
							|| map[y + dr[3]][x + dc[3]] != '-') {
						y += dr[3];
						x += dc[3];
						if (y >= 0 || x >= 0 || y < W || x < H || map[y][x] != '*' || map[y][x] != '#'
								|| map[y][x] != '-') {
							map[y - dr[3]][x - dc[3]] = '.';
							map[y][x] = '>';
						}
					}
					break;
				///// �� �߻�//////
				default:
					switch (map[y][x]) {
					case '^':// ���⿡ ���缭 ���� ���
						for (int j = x; j >= 0; j--) {
							if (map[j][x] == '*')
								map[j][x] = '.';
							else if (map[j][x] == '#')
								break;
						}
						break;
					case 'v':
						for (int j = x; j < H; j++) {
							if (map[j][y] == '*')
								map[j][y] = '.';
							else if (map[j][x] == '#')
								break;
						}
						break;
					case '<':
						for (int j = y; j >= 0; j--) {
							if (map[x][j] == '*')
								map[x][j] = '.';
							else if (map[x][j] == '#')
								break;
						}
						break;
					case '>':
						for (int j = y; j < W; j++) {
							if (map[x][j] == '*')
								map[x][j] = '.';
							else if (map[x][j] == '#')
								break;
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
			System.out.println();
		} // TestCase
	}// main
}
