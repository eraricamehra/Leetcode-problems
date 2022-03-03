package bfsdfs;

public class NumberOfProvinces {
	// using DFS
//	public int findCircleNum(int[][] isConnected) {
//		boolean[] visited = new boolean[isConnected.length];
//		int count = 0;
//		for (int i = 0; i < isConnected.length; i++) {
//			if (!visited[i]) {
//				dfs(isConnected, visited, i);
//				count++;
//			}
//		}
//		return count;
//	}
//
//	public void dfs(int[][] isConnected, boolean[] visited, int i) {
//	        for(int j =0; j<isConnected.length; j++) {
//	            if(isConnected[i][j]==1 && !visited[j]) {
//	                visited[j] = true;
//	                dfs(isConnected, visited, j);
//	            }
//	        }
//	}

	public int findCircleNum(int[][] isConnected) {
		int rows = isConnected.length;
		int cols = isConnected[0].length;
		boolean[][] visited = new boolean[rows][cols];
		int count = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < isConnected[i].length; j++) {
				{
					if (isConnected[i][j] == 1) {
						count+=1;
						dfs(i, j, isConnected, visited);
						
					}

				}
			}

		}
		return count;
	}

	public void dfs(int i, int j, int[][] M, boolean[][] visited) {

		if (i < 0 || i >= M.length || j < 0 || j >= M[i].length || M[i][j] != 1 || visited[i][j])
			return;

		visited[i][j] = true;
		dfs(i + 1, j, M, visited) ;
		dfs(i - 1, j, M, visited) ;
		dfs(i, j + 1, M, visited) ;
		dfs(i, j - 1, M, visited) ;
			

		//visited[i][j] = false;

		//
	}

}
