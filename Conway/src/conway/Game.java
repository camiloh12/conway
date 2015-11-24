package conway;

public class Game {
	private final static int GRID_SIZE = 50;

	public Grid grid;
	
	public Game() {
		grid = new Grid(GRID_SIZE);
	}

	public void play() {
		boolean[][] tempCells = new boolean[GRID_SIZE][GRID_SIZE];

		for (int i = 0; i <= grid.cells.length - 1; i++) {
			for (int j = 0; j <= grid.cells[i].length - 1; j++) {
				int liveNeighbors = grid.getNumberOfLiveNeighbors(i, j);
				if (grid.cells[i][j] && liveNeighbors == 2 || liveNeighbors == 3) {
					tempCells[i][j] = true;
				} 
			}
		}

		grid.cells = tempCells;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
