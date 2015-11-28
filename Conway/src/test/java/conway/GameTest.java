package conway;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameTest {
	
	private Game game;
	
	@Before
	public void setUp() {
		game = new Game();
	}

	@Test
	public void testUnderPopulationDeath() {
		game.grid.cells[2][3] = true;
		game.next();
		assertFalse(game.grid.cells[2][3]);
	}
	
	@Test
	public void testOverPopulationDeath() {
		game.grid.cells[2][3] = true;
		game.grid.cells[1][2] = true;
		game.grid.cells[1][3] = true;
		game.grid.cells[2][2] = true;
		game.grid.cells[3][2] = true;
		game.next();
		assertFalse(game.grid.cells[2][3]);
	}
	
	@Test
	public void testLivesOn() {
		game.grid.cells[2][3] = true;
		game.grid.cells[1][2] = true;
		game.grid.cells[1][3] = true;

		game.next();
		assertTrue(game.grid.cells[2][3]);
	}
	
	@Test
	public void testComesToLife() {
		game.grid.cells[2][3] = false;
		game.grid.cells[1][2] = true;
		game.grid.cells[1][3] = true;
		game.grid.cells[2][2] = true;
		game.next();
		assertTrue(game.grid.cells[2][3]);
	}

}
