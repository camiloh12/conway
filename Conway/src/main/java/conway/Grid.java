package conway;

public class Grid {

	private int size;
	public boolean[][] cells;;

	public Grid(int size) {
		this.size = size;
		cells = new boolean[size][size];
	}

	public int getNumberOfLiveNeighbors(int x, int y) {
		int count = 0;
		for (int i = x - 1; i <= x + 1; i++) {
			for (int j = y - 1; j <= y + 1; j++) {
				if (!isOutOfBounds(i, j) && !isSameCell(x, y, i, j) && cells[i][j]) {
					count++;
				}
			}
		}
		return count;
	}

	public String toString() {
		StringBuilder gridString = new StringBuilder();
		for (int y = 0; y <= size - 1; y++) {
			for (int x = 0; x <= size - 1; x++) {
				gridString.append(cells[x][y] ? "@" : " ");
			}
			gridString.append("\n");
		}

		return gridString.toString();
	}

	private boolean isOutOfBounds(int x, int y) {
		if (x < 0 || x >= size || y < 0 || y >= size) {
			return true;
		}
		return false;
	}

	private boolean isSameCell(int cellX, int cellY, int neighborX, int neighborY) {
		return neighborX == cellX && neighborY == cellY;
	}
}
