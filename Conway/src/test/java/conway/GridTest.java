package conway;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class GridTest {

	private Grid grid;

	@Before
	public void setUp() {
		grid = new Grid(5);
	}

	@Test
	public void testGrid() {
		assertNotNull(grid.cells[4][4]);
	}

	@Test
	public void testAlive() {
		grid.cells[0][0] = true;

		assertTrue(grid.cells[0][0]);
		assertFalse(grid.cells[4][4]);
	}

	@Test
	public void testNumberOfLiveNeighbors() {
		grid.cells[2][2] = true;
		grid.cells[3][2] = true;
		int liveNeighbors = grid.getNumberOfLiveNeighbors(2, 3);
		assertEquals(2, liveNeighbors);
	}

	@Test
	public void testLiveNeighborsWithLiveCell() {
		grid.cells[2][2] = true;
		grid.cells[3][2] = true;
		grid.cells[2][3] = true;
		int liveNeighbors = grid.getNumberOfLiveNeighbors(2, 3);
		assertEquals(2, liveNeighbors);
	}

	@Test
	public void testOutOfBounds() {
		grid.cells[0][1] = true;
		grid.cells[1][0] = true;
		int liveNeighbors = grid.getNumberOfLiveNeighbors(0, 0);
		assertEquals(2, liveNeighbors);
	}

	@Test
	public void testLiveNeighbors4() {
		grid.cells[2][3] = true;
		grid.cells[1][2] = true;
		grid.cells[1][3] = true;
		grid.cells[2][2] = true;
		grid.cells[3][2] = true;
		assertEquals(4, grid.getNumberOfLiveNeighbors(2, 3));
	}

	@Test
	public void testToString() {
		grid.cells[0][2] = true;
		grid.cells[0][3] = true;
		grid.cells[1][2] = true;
		grid.cells[1][3] = true;
		String gridString = "     \n     \n@@   \n@@   \n     \n";
		assertEquals(gridString, grid.toString());
	}

}
