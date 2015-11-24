package conway;

public class Game {

	public Grid grid = new Grid();

	public void play() {
		boolean[][] tempCells = new boolean[10][10];

		for (int i = 0; i <= grid.cells.length - 1; i++) {
			for (int j = 0; j <= grid.cells[i].length - 1; j++) {
				int liveNeighbors = grid.getNumberOfLiveNeighbors(i, j);
				if (liveNeighbors >= 2 && liveNeighbors <= 3) {
					if (grid.cells[i][j] || liveNeighbors == 3) {
						tempCells[i][j] = true;
					}
				} else {
					tempCells[i][j] = false;
				}
			}
		}

		grid.cells = tempCells;
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
