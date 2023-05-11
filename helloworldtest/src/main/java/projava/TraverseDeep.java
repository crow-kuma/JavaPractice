package projava;

import java.util.ArrayDeque;
import java.util.Queue;

public class TraverseDeep {
	public static void main(String[] args) {
		int[][] map = {
			{1, 1, 1, 1, 1, 1, 1},
			{1, 0, 1, 0, 0, 0, 1},
			{1, 0, 0, 0, 1, 0, 1},
			{1, 0, 1, 0, 0, 2, 1},
			{1, 1, 1, 1, 1, 1, 1}
		};
		traverse(map, 1, 1);
		char[] ch = {' ', '*', 'G', 'o' };
		for (int[] row : map) {
			for (int cell : row) {
				System.out.print(ch[cell]);
			}
			System.out.println();
		}
	}
	static boolean traverse(int[][] map, int curX, int curY) {
		record Position(int x, int y) {}

		Queue<Position> queue = new ArrayDeque<>();
		queue.offer(new Position(curX, curY));

		for (Position p; (p = queue.poll()) != null;) {
			switch (map[p.y()][p.x()]) {
				case 0: break; // Path. Next step.
				case 2: return true; //Goal
				default: continue; // Cannot go. To the another direction.
			}
			map [p.y()][p.x()] = 3; // Visited.
			queue.offer(new Position(p.x() + 1, p.y()));
			queue.offer(new Position(p.x() - 1, p.y()));
			queue.offer(new Position(p.x(), p.y() + 1));
			queue.offer(new Position(p.x(), p.y() - 1));
		}
		return false;

		// 再起表現を使う場合
		// switch (map[curY][curX]) {
		// 	case 0: break; // Path. Next step.
		// 	case 2: return true; //Goal
		// 	default: return false; // Wall or Visited.
		// }
		// map [curY][curX] = 3; // Visited.
		// if (traverse(map, curX + 1, curY) ||
		// 	traverse(map, curX - 1, curY) ||
		// 	traverse(map, curX, curY + 1) ||
		// 	traverse(map, curX, curY - 1)) {
		// 	return true;
		// }
		// map[curY][curX] = 0;
		// return false;
	}
}
