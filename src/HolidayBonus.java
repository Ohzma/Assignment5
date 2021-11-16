/*
 Program: Assignment 5 Design
 Class: CMSC 203, CRN 22297
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

public class HolidayBonus 
{

	
	
	/*
	 * Calculates the holiday bonus for each store
	 */

	public static double[] calculateHolidayBonus(double[][] data, double high, double low,
	double other) 
	{
		double[] bonuses = new double[data.length];
    
		//find max # of categories
		int maxCol = 0;
		for (int i = 0; data.length > i; i++) 
		{
			if (data[i].length > maxCol) 
			{
				maxCol = data[i].length;
     
			}
   
		}
    
		for (int j = 0; maxCol > j; j++) 
		{
			// add bonus for high or low in each category
			int lowBonusIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, j);
			int highBonusIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, j);
      
			// sales must be positive to get high bonus
			if (0 < TwoDimRaggedArrayUtility.getHighestInColumn(data, j)) 
			{  
				bonuses[highBonusIndex] += high;
        
			}
			
			// sales must be positive and different from high to get low bonus
			if (lowBonusIndex != highBonusIndex && 0 < TwoDimRaggedArrayUtility.getLowestInColumn(data, j)) 
			{
				bonuses[lowBonusIndex] += low;
			        
			}
			// add OTHER bonus to the other stores unless not category available if sales are positive 
			
			for (int i = 0; data.length > i; i++) 
			{
				if (data[i].length <= j || i==highBonusIndex  || i==lowBonusIndex || 0 >=data[i][j]) 
				{
					continue;
          
				} 
       
				else 
				{
					bonuses[i] += other;
          
				} 
        
				System.out.println();
				
			}			
			
		} 
    
		return bonuses;
		
		
	}
	
	/*
	 * Calculates the total holiday bonuses
	 */
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low,
	double other) 
	{
    
		double total = 0;
		double[] bonusArray = calculateHolidayBonus(data, high, low, other);
		for (double bonus:bonusArray)
		{
			total+=bonus;
      
		}
    
		return total;
    
	}
  
}