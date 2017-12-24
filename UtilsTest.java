package model;

import org.junit.Assert;
import org.junit.Test;
import util.Utils;

public class UtilsTest {

	@Test
	public void initMatrixFromFile() throws Exception {
		String path = "test.case";
		CellMatrix cellMatrix = Utils.initMatrixFromFile(path);
		Assert.assertEquals(3, cellMatrix.getHeight());
		Assert.assertEquals(3, cellMatrix.getWidth());
		Assert.assertEquals(60, cellMatrix.getTransfromNum());
		Assert.assertEquals(200, cellMatrix.getDuration());
		int[][] expected = new int[][] { { 1, 0, 1 }, { 0, 1, 0 }, { 1, 1, 1 } };
		Assert.assertArrayEquals(expected, cellMatrix.getMatrix());

		Assert.assertEquals(null, Utils.initMatrixFromFile(""));
	}

}