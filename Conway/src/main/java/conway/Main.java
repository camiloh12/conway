package conway;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		Game game = new Game();

		FileGridMapper mapper = new FileGridMapper();
		game.grid = mapper.fileToGrid("/apps/conway/conway.txt");
		
		while (true) {
			// clear the console
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println(game.grid.toString());
			game.next();
			Thread.sleep(100);
		}

	}
}
