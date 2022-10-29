package B5月30周六;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName: LabyrinthProblem迷宫问题
 * @Description: 广度优先搜索：https://blog.csdn.net/raphealguo/article/details/7523411
 *               https://blog.csdn.net/u011815404/article/details/79582206
 * @author: colou
 */
public class B5迷宫 {
	/*
	 * 深度优先可以这样想，一个人迷路，遇到很多分叉路口，他只有一个人，并且想走出去，所以只能一个个尝试，
	 * 一条道路走到黑，发现到头了，然后再拐回去走刚才这条路的其他分叉路口，最后发现这条路的所有分叉路口走完了
	 * ，选择另外一条路继续以上操作，直到所有的路都走过了。
	 * 广度优先并不是这样，一个人迷路，但是他有技能（分身术）它遇到分叉路口，不是选一个走，而是分身多个人都试试，
	 * 比如有A、B、C三个分叉路口，它A路走一步，紧接着B路也走一步，然后C路也赶紧走一步，步伐整齐统一，直到所有的路走过了。
	 */ public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			String s = "01010101001011001001010110010110100100001000101010"
					+ "00001000100000101010010000100000001001100110100101"
					+ "01111011010010001000001101001011100011000000010000"
					+ "01000000001010100011010000101000001010101011001011"
					+ "00011111000000101000010010100010100000101100000000"
					+ "11001000110101000010101100011010011010101011110111"
					+ "00011011010101001001001010000001000101001110000000"
					+ "10100000101000100110101010111110011000010000111010"
					+ "00111000001010100001100010000001000101001100001001"
					+ "11000110100001110010001001010101010101010001101000"
					+ "00010000100100000101001010101110100010101010000101"
					+ "11100100101001001000010000010101010100100100010100"
					+ "00000010000000101011001111010001100000101010100011"
					+ "10101010011100001000011000010110011110110100001000"
					+ "10101010100001101010100101000010100000111011101001"
					+ "10000000101100010000101100101101001011100000000100"
					+ "10101001000000010100100001000100000100011110101001"
					+ "00101001010101101001010100011010101101110000110101"
					+ "11001010000100001100000010100101000001000111000010"
					+ "00001000110000110101101000000100101001001000011101"
					+ "10100101000101000000001110110010110101101010100001"
					+ "00101000010000110101010000100010001001000100010101"
					+ "10100001000110010001000010101001010101011111010010"
					+ "00000100101000000110010100101001000001000000000010"
					+ "11010000001001110111001001000011101001011011101000"
					+ "00000110100010001000100000001000011101000000110011"
					+ "10101000101000100010001111100010101001010000001000"
					+ "10000010100101001010110000000100101010001011101000"
					+ "00111100001000010000000110111000000001000000001011"
					+ "10000001100111010111010001000110111010101101111000";
			int[][] labyrinth = new int[30][50];
			for (int i = 0; i < 30; i++) {
				for (int j = 0; j < 50; j++) {
					labyrinth[i][j] = s.charAt(50 * i + j) - '0';
				}
			}
			System.out.println(BFS(labyrinth, 30, 50));
		} catch (Exception e) {
			input.close();
		}
	}

	public static String BFS(int[][] labyrinth, int row, int column) {
		int[][] stepArr = { { -1, 0 }, { 0, 1 }, { 0, -1 }, { 1, 0 } };
		String[] direction = { "U", "R", "L","D"}; 
		int[][] visit = new int[row][column];// 标记是否已经访问过
		StringBuilder sb = new StringBuilder();
		Node node = new Node(0, 0, -1, -1, 0, null);
		Queue<Node> queue = new LinkedList<Node>();
		Stack<Node> stack = new Stack<Node>();
		queue.offer(node);
		while (!queue.isEmpty()) {
			Node head = queue.poll();
			stack.push(head); // 用于回溯路径
			visit[head.x][head.y] = 1;
			for (int i = 0; i < 4; i++) {
				int x = head.x + stepArr[i][0];
				int y = head.y + stepArr[i][1];
				String d = direction[i];
				// exit
				if (x == row - 1 && y == column - 1 && labyrinth[x][y] == 0 && visit[x][y] == 0) {
					// 打印路径
					Node top = stack.pop();
					sb.append(d);
					sb.append(top.direction);
					int preX = top.preX;
					int preY = top.preY;
					while (!stack.isEmpty()) {
						top = stack.pop();
						if (preX == top.x && preY == top.y) {
							if (top.direction != null)
								sb.append(top.direction);
							preX = top.preX;
							preY = top.preY;
						}

					}
					return sb.reverse().toString();
				}
				// bfs
				if (x >= 0 && x < row && y >= 0 && y < column && labyrinth[x][y] == 0 && visit[x][y] == 0) {
					Node newNode = new Node(x, y, head.x, head.y, head.step + 1, d);
					queue.offer(newNode);
				}
			}
		}
		return null;
	}
}

class Node {
	int x, y;
	int step;
	int preX, preY;
	String direction;

	Node(int x, int y, int preX, int preY, int step, String direction) {
		this.x = x;
		this.y = y;
		this.preX = preX;
		this.preY = preY;
		this.step = step;
		this.direction = direction;
	}
}
