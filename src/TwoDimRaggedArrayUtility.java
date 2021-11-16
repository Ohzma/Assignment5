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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility
{
	
  /*
   * Returns the total of the selected column in the two dimensional array
   */
  public static double getColumnTotal(double[][] data, int col) 
  {
    double colTotal = 0;
    for (int i = 0; data.length > i; i++) 
    {
      if (data[i].length <= col) 	  
      {
        continue;
        
      }
        colTotal += data[i][col];
      
    }
    return colTotal;
  }

  /*
   * Returns the largest element in the two dimensional array
   */
  public static double getHighestInArray(double[][] data) 
  {
    double high = -999999;
    for (int i = 0; data.length > i; i++)
    { 
      for (int j = 0; data[i].length > j; j++)
      {
        if (high < data[i][j])
        {
          high = data[i][j];
          
        }
        
      }
      
    }
    return high;
    
  }

  /*
   * Returns the largest element of the selected column in the two dimensional array
   */
  public static double getHighestInColumn(double[][] data, int col)
  {
    double high = -999999;
    for (int i = 0; data.length > i; i++) 
    {
      if (data[i].length <= col) 
      {
        continue;
      
      }
      if (high < data[i][col]) 
      {
        high = data[i][col];
      
      }
    
    }
    return high;
  
  }

  /*
   * Returns index of the largest element of the selected column in the two dimensional array
   */
  public static int getHighestInColumnIndex(double[][] data, int col)
  {
    double high = -999999;
    int index = -1;
    for (int i = 0; data.length > i;i++)
    {
      if (col >= data[i].length) 
      {
        continue;
        
      }
      if (high < data[i][col]) 
      {
        high = data[i][col];
        index = i;
     
      }
    
    }
    return index;
 
  }

  /*
   * Returns the largest element of the selected row in the two dimensional array
   */
  public static double getHighestInRow(double[][] data, int row)
  {
    double high = -999999;
    for (int i = 0; data[row].length > i; i++) 
    {
      if (high < data[row][i]) 
      {
        high = data[row][i];
      
      }
    
    }
    return high;
  
  }

  /*
   * Returns the largest element of the selected row in the two dimensional array
   */
  public static int getHighestInRowIndex(double[][] data, int row) 
  {
    double high = -999999;
    int index = -1;
    for (int i = 0;data[row].length > i; i++)
    {
      if (high < data[row][i])
      {
        high = data[row][i];
        index = i;
      
      }
    
    }
    return index;
  
  }

  /*
   * Returns the smallest element in the two dimensional array
   */
  public static double getLowestInArray(double[][] data) 
  {
    double low = 999999;
    for (int i = 0; data.length > i; i++)
    { 
      for (int j = 0;data[i].length > j; j++)
      {
        if (low > data[i][j]) 
        {
          low = data[i][j];
       
        }
     
      }
   
    }
    return low;
 
  }

  /*
   * Returns the smallest element of the selected column in the two dimensional array
   */
  public static double getLowestInColumn(double[][] data, int col) 
  {
    double low = 999999;
    for (int i = 0; data.length > i; i++)
    {
      if (data[i].length <= col)
      {
        continue;
    
      }
      if (low > data[i][col])
      {
        low = data[i][col];
    
      }
   
    }
    return low;
 
  }
  
  /*
   * Returns the smallest element of the selected row in the two dimensional array index 0 refers to
   * the first row.
   */
  public static double getLowestInRow(double[][] data, int row) 
  {
    double low = 999999;
    for (int i = 0; data[row].length > i;i++) 
    {
      if (low > data[row][i])
      {
        low = data[row][i];
     
      }
   
    }
    return low;
 
  }

  /*
   * Returns the index of the smallest element of the selected column in the two dimensional array
   */
  public static int getLowestInColumnIndex(double[][] data, int col)
  {
    double low = 999999;
    int index = -1;
    for (int i = 0; data.length > i; i++)
    {
      if (data[i].length <= col)
      {
        continue;
    
      }
      if (low > data[i][col]) 
      {
        low = data[i][col];
        index = i;
    
      }
   
    }
    return index;
 
  }

  /*
   * Returns the index of the smallest element of the selected row in the two dimensional array
   */
  public static int getLowestInRowIndex(double[][] data, int row)
  {
    double low = 999999;
    int index = -1;
    for (int i = 0; data[row].length > i; i++) 
    {
      if (low > data[row][i])
      {
        low = data[row][i];
        index = i;
     
      }
 
    }
    return index;

  }

  /*
   * Returns the total of the selected row in the two dimensional array index 0 refers to the first
   * row
   */
  public static double getRowTotal(double[][] data, int row) 
  {
    double sum = 0;
    for (int i = 0; data[row].length > i; i++)
    {
        sum += data[row][i];
   
    }
    return sum;

  }

  /*
   * Returns the total of all the elements of the two dimensional array
   */
  public static double getTotal(double[][] data) 
  {
    double sum = 0;
    for (int i = 0; data.length > i; i++) 
    { 
      for (int j = 0; data[i].length > j; j++) 
      {
        sum += data[i][j];
     
      }
   
    }
    
    return sum;
 
  }
  
  public static double getAverage(double[][] data) 
	{
	    
		int elements = 0;
	    double sum = 0;
	    for (int i = 0; data.length > i;i++) 
	    {
	      elements += data[i].length; 
	      for (int j = 0;j < data[i].length;j++) 
	      {
	        sum += data[i][j];
	        
	      }
	      
	    }
	    
	    return sum / elements;
	  }


  /*
   * Reads from a file and returns a ragged array of doubles The maximum rows is 10 and the maximum
   * columns for each row is 10 Each row in the file is separated by a new line Each element in the
   * row is separated by a space
   */
  public static double[][] readFile(File file) throws FileNotFoundException 
  {
    Scanner sc = new Scanner(file);
    int indexRow = 0;
    String[][] temp = new String[10][]; 
    
    // read file and pass numbers to temp array as Strings
    while (sc.hasNextLine()) 
    {
     String[] row = sc.nextLine().split(" ");
     temp[indexRow] = new String[row.length];
     for (int i = 0; row.length > i; i++) 
     {
       temp[indexRow][i]=row[i];   
   
     }
     indexRow++;
   
    }
   // Create double data array and parse numbers as doubles
    double[][]data = new double[indexRow][];
    for (int i = 0; indexRow > i;i++)
    {
      data[i]= new double[temp[i].length];
      for (int j = 0; temp[i].length > j;j++)
      {
          System.out.print(temp[i][j] + " ");
          data[i][j] = Double.parseDouble(temp[i][j]);
    
      }
      System.out.println();
    
    }
    
    sc.close();
    return data;

  }

  /**
   * Writes the ragged array of doubles into the file. Each row is on a separate line within the
   * file and each double is separated by a space.
   */
  public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException 
  {
    PrintWriter output = new PrintWriter(outputFile);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; data.length > i; i++) 
    {
      for (int j = 0; data[i].length > j; j++)
      {
        sb.append(data[i][j]+ " ");
     
      }
      sb.append("\n");
   
    }
    output.print(sb.toString());
    output.close();

  }

}