package conway;

public class Grid {
	
	public final static int GRID_SIZE = 10;

	public boolean[][] cells = new boolean[GRID_SIZE][GRID_SIZE];

	public int getNumberOfLiveNeighbors(int x, int y) {
		int count = 0;
		for (int i = x - 1; i <= x + 1; i++) {
			for (int j = y - 1; j <= y + 1; j++) {
				try {
					if (cells[i][j] && !(i == x && j == y)) {
						count++;
					}
				} catch (IndexOutOfBoundsException iob) {
					// do nothing
				}
			}
		}
		return count;
	}
	
	public String toString() {
		StringBuilder gridString = new StringBuilder();
		for (int i = 0; i <= cells.length - 1; i++) {
			for (int j = 0; j <= cells[i].length - 1; j++) {
				gridString.append(cells[i][j] ? "X" : " ");
			}
			gridString.append("\n");
		}
		
		return gridString.toString();
	}
}
