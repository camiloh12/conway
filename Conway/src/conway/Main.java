package conway;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		Game game = new Game();
		
		//initialize cells
		//{2,4},{3,3},{1,2},{2,2},{3,2}
//		game.grid.cells[2][4] = true;
//		game.grid.cells[3][3] = true;
//		game.grid.cells[1][2] = true;
//		game.grid.cells[2][2] = true;
//		game.grid.cells[3][2] = true;

		//blinker:
//		game.grid.cells[1][2] = true;
//		game.grid.cells[2][2] = true;
//		game.grid.cells[3][2] = true;
		
		//glider:
//		game.grid.cells[1][0] = true;
//		game.grid.cells[2][1] = true;
//		game.grid.cells[2][2] = true;
//		game.grid.cells[1][2] = true;
//		game.grid.cells[0][2] = true;
		
		//small explorer:
		game.grid.cells[0][1] = true;
		game.grid.cells[0][2] = true;
		game.grid.cells[1][0] = true;
		game.grid.cells[1][1] = true;
		game.grid.cells[1][3] = true;
		game.grid.cells[2][1] = true;
		game.grid.cells[2][2] = true;
		
		
		while(true) {
			//clear the console
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println(game.grid.toString());
			game.play();
		}
		
	}
}
