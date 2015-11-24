package conway;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		Game game = new Game();

		// initialize cells
		// {2,4},{3,3},{1,2},{2,2},{3,2}
		// game.grid.cells[2][4] = true;
		// game.grid.cells[3][3] = true;
		// game.grid.cells[1][2] = true;
		// game.grid.cells[2][2] = true;
		// game.grid.cells[3][2] = true;

		// blinker:
		// game.grid.cells[1][2] = true;
		// game.grid.cells[2][2] = true;
		// game.grid.cells[3][2] = true;

		// glider:
		// game.grid.cells[1][0] = true;
		// game.grid.cells[2][1] = true;
		// game.grid.cells[2][2] = true;
		// game.grid.cells[1][2] = true;
		// game.grid.cells[0][2] = true;

		// small explorer:
//		 game.grid.cells[5][6] = true;
//		 game.grid.cells[5][7] = true;
//		 game.grid.cells[6][5] = true;
//		 game.grid.cells[6][6] = true;
//		 game.grid.cells[6][8] = true;
//		 game.grid.cells[7][6] = true;
//		 game.grid.cells[7][7] = true;

		// Gosper glider gun:
		game.grid.cells[5][7] = true;
		game.grid.cells[5][8] = true;
		game.grid.cells[6][7] = true;
		game.grid.cells[6][8] = true;
		game.grid.cells[13][8] = true;
		game.grid.cells[13][9] = true;
		game.grid.cells[14][7] = true;
		game.grid.cells[14][9] = true;
		game.grid.cells[15][7] = true;
		game.grid.cells[15][8] = true;
		game.grid.cells[21][9] = true;
		game.grid.cells[21][10] = true;
		game.grid.cells[21][11] = true;
		game.grid.cells[22][9] = true;
		game.grid.cells[23][10] = true;
		game.grid.cells[27][6] = true;
		game.grid.cells[27][7] = true;
		game.grid.cells[28][5] = true;
		game.grid.cells[28][7] = true;
		game.grid.cells[29][5] = true;
		game.grid.cells[29][6] = true;
		game.grid.cells[29][17] = true;
		game.grid.cells[29][18] = true;
		game.grid.cells[30][17] = true;
		game.grid.cells[30][19] = true;
		game.grid.cells[31][17] = true;
		game.grid.cells[39][5] = true;
		game.grid.cells[39][6] = true;
		game.grid.cells[40][5] = true;
		game.grid.cells[40][6] = true;
		game.grid.cells[40][12] = true;
		game.grid.cells[40][13] = true;
		game.grid.cells[40][14] = true;
		game.grid.cells[41][12] = true;
		game.grid.cells[42][13] = true;

		while (true) {
			// clear the console
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println(game.grid.toString());
			game.play();
		}

	}
}
