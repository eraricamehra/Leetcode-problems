package bfsdfs;

public class WordSearch {

	boolean[][] visited;

	public boolean exist(char[][] board, String word) {
		// int count =0;
		int rows = board.length;
		int cols = board[0].length;
		visited = new boolean[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (board[i][j] == word.charAt(0) && dfs(i, j, 0, board, word))
					return true;
			}
		}
		return false;
	}

	public boolean dfs(int i, int j, int count, char[][] board, String word) {

		if (count == word.length()) {
			return true;
		}

		if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count)
				|| visited[i][j])
			return false;

		// if(visited[i][j]) return false;

		visited[i][j] = true;
		if (dfs(i + 1, j, count + 1, board, word) || dfs(i - 1, j, count + 1, board, word)
				|| dfs(i, j + 1, count + 1, board, word) || dfs(i, j - 1, count + 1, board, word)) {
			return true;
		}

		visited[i][j] = false;
		return false;

	}

}
