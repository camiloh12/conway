package conway;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FileReaderTest {
	
	private FileGridMapper mapper;
	
	@Before
	public void setUp() {
		mapper = new FileGridMapper();
	}
	
	@Test
	public void testReadFile() {
		Grid grid = mapper.fileToGrid("src/test/resources/blinker-input.txt");
		assertTrue(grid.cells[1][2]);
		assertTrue(grid.cells[2][2]);
		assertTrue(grid.cells[3][2]);
	}
	
	@Test
	public void testReadCellString() {
		int[] cell = mapper.getCell("4,5");
		
		assertEquals(4, cell[0]);
		assertEquals(5, cell[1]);
	}
	
	@Test
	public void testReadMultipleCells() {
		int[][] cells = mapper.getMultipleCells("1,3;4,5;10,15");
		
		assertEquals(1, cells[0][0]);
		assertEquals(3, cells[0][1]);
		assertEquals(4, cells[1][0]);
		assertEquals(15, cells[2][1]);
	}

}
