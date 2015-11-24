package conway;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	@Test
	public void testUnderPopulationDeath() {
		Game game = new Game();
		game.grid.cells[2][3] = true;
		game.play();
		assertFalse(game.grid.cells[2][3]);
	}
	
	@Test
	public void testOverPopulationDeath() {
		Game game = new Game();
		game.grid.cells[2][3] = true;
		game.grid.cells[1][2] = true;
		game.grid.cells[1][3] = true;
		game.grid.cells[2][2] = true;
		game.grid.cells[3][2] = true;
		game.play();
		assertFalse(game.grid.cells[2][3]);
	}
	
	@Test
	public void testLivesOn() {
		Game game = new Game();
		game.grid.cells[2][3] = true;
		game.grid.cells[1][2] = true;
		game.grid.cells[1][3] = true;

		game.play();
		assertTrue(game.grid.cells[2][3]);
	}
	
	@Test
	public void testComesToLife() {
		Game game = new Game();
		game.grid.cells[2][3] = false;
		game.grid.cells[1][2] = true;
		game.grid.cells[1][3] = true;
		game.grid.cells[2][2] = true;
		game.play();
		assertTrue(game.grid.cells[2][3]);
	}

}
