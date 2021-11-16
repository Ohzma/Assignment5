/*
Program: Assignment 5 Design
 Instructor: Grigoriy Grinberg
 Summary of Description: Create a utility class that manipulates a two-dimensional ragged array of doubles. This utility class will be used to create a Sales Report for Retail District #5. It will accommodate positive and negative numbers. Follow the Javadoc provided. 
Create a utility class that will calculate holiday bonuses given a ragged array of doubles which represent the sales for each store in each category. It will also take in bonus amount for the store with the highest sales in a category, the bonus amount for the store with the lowest sales in a category and the bonus amount for all other stores.
These utility classes will be used with an existing GUI class to create a sales report and display holiday bonuses.
Testing of these utility classes will be done with the JUnit tests and the GUI class provided for you.
 Due Date: 15NOV2021
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Student: Daniel Cortes Gratacos
*/

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilitySTUDENT_Test {
	//STUDENT fill in dataSetSTUDENT with values, it must be a ragged array
	private double[][] dataSet1 = {{1.2,2.3,3.4},{4,5},{6.4,7.3,8.2}};
	private double[][] dataSet2 = {{-7,2,9,4},{-5},{8,-1,3},{11,6,-7,2}};
	private double[][] dataSet3 = {{-7.2,-2.5,-9.3},{-5.9},{-8.1,1.7,3.3},{11.6,6.9,7.3,2.7}};
	private double[][] dataSet4 = {{-2.5,-5.3,6.1},{-4.4,-8.2},{-2.3,-7.5},{-4.2,7.3,-5.9,2.6}};
	
	private File inputFile,outputFile;

	@Before
	public void setUp() throws Exception {
		outputFile = new File("TestOut.txt");
	}

	@After
	public void tearDown() throws Exception {
		dataSet1 = dataSet2 = dataSet3 = dataSet4 = null;
		inputFile = outputFile = null;
	}

	/**
	 * Student Test getTotal method
	 * Return the total of all the elements in the two dimensional array
	 */
	@Test
	public void testGetTotalSTUDENT() {
		assertEquals(37.8,TwoDimRaggedArrayUtility.getTotal(dataSet1),.001);
		assertEquals(25.0,TwoDimRaggedArrayUtility.getTotal(dataSet2),.001);
		assertEquals(0.5,TwoDimRaggedArrayUtility.getTotal(dataSet3),.001);
		assertEquals(-24.3,TwoDimRaggedArrayUtility.getTotal(dataSet4),.001);
	}

	/**
	 * Student Test getAverage method
	 * Return the average of all the elements in the two dimensional array
	 */
	@Test
	public void testGetAverageSTUDENT() {
		assertEquals(4.725,TwoDimRaggedArrayUtility.getAverage(dataSet1),.001);
		assertEquals(2.083,TwoDimRaggedArrayUtility.getAverage(dataSet2),.001);
		assertEquals(0.045,TwoDimRaggedArrayUtility.getAverage(dataSet3),.001);
		assertEquals(-2.209,TwoDimRaggedArrayUtility.getAverage(dataSet4),.001);
	}

	/**
	 * Student Test getRowTotal method
	 * Return the total of all the elements of the row.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotalSTUDENT() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,1),.001);
		assertEquals(-5.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet2,1),.001);
		assertEquals(8.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet2,0),.001);
		assertEquals(28.5,TwoDimRaggedArrayUtility.getRowTotal(dataSet3,3),.001);
		assertEquals(-5.9,TwoDimRaggedArrayUtility.getRowTotal(dataSet3,1),.001);
		assertEquals(-12.6,TwoDimRaggedArrayUtility.getRowTotal(dataSet4,1),.001);
		assertEquals(-0.2,TwoDimRaggedArrayUtility.getRowTotal(dataSet4,3),.001);
		}


	/**
	 * Student Test getColumnTotal method
	 * Return the total of all the elements in the column. If a row in the two dimensional array
	 * doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * Column 0 refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotalSTUDENT() {
		assertEquals(11.6,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1,0),.001);
		assertEquals(5,TwoDimRaggedArrayUtility.getColumnTotal(dataSet2,2),.001);
		assertEquals(6.1,TwoDimRaggedArrayUtility.getColumnTotal(dataSet3,1),.001);
		assertEquals(-13.4,TwoDimRaggedArrayUtility.getColumnTotal(dataSet4,0),.001);
		assertEquals(-13.7,TwoDimRaggedArrayUtility.getColumnTotal(dataSet4,1),.001);
	}


	/**
	 * Student Test getHighestInArray method
	 * Return the largest of all the elements in the two dimensional array.
	 */
	@Test
	public void testGetHighestInArraySTUDENT() {
		assertEquals(8.2,TwoDimRaggedArrayUtility.getHighestInArray(dataSet1),.001);
		assertEquals(11.0,TwoDimRaggedArrayUtility.getHighestInArray(dataSet2),.001);
		assertEquals(11.6,TwoDimRaggedArrayUtility.getHighestInArray(dataSet3),.001);
		assertEquals(7.3,TwoDimRaggedArrayUtility.getHighestInArray(dataSet4),.001);
	}
	

	

}
