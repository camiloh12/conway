package conway;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileGridMapper {

	public Grid fileToGrid(String fileName) {
		Grid grid = new Grid(50);
		
		String line;
		int[][] cells = new int[50][2];
		BufferedReader buffReader = null;
		try {
			buffReader = new BufferedReader(new FileReader(fileName));
			
			while((line = buffReader.readLine()) != null) {
				cells = getMultipleCells(line);
			}
		} catch (IOException io) {
			io.printStackTrace();
		}finally {
			try {
				if (buffReader != null) {
					buffReader.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		for (int i = 0; i < cells.length; i++) {
			grid.cells[cells[i][0]][cells[i][1]] = true;
		}
		
		return grid;
	}

	public int[] getCell(String string) {
		String[] cellString = string.split(",");
		int[] cell = new int[2];
		cell[0] = Integer.parseInt(cellString[0]);
		cell[1] = Integer.parseInt(cellString[1]);
		return cell;
	}

	public int[][] getMultipleCells(String string) {
		String[] cellStrings = string.split(";");
		int[][] cells = new int[cellStrings.length][2];
		for (int i = 0; i < cellStrings.length; i++) {
			cells[i] = getCell(cellStrings[i]);
		}
		return cells;
	}

}
