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
		for (int i = 0; i <= size - 1; i++) {
			for (int j = 0; j <= size - 1; j++) {
				gridString.append(cells[j][i] ? "O" : " ");
			}
			gridString.append("\n");
		}
		
		return gridString.toString();
	}
}
