/**
 *Name: Aubree Dagilis
 *PIN: 16
 *Description: Analytics inherits the variables from OrderedIntList.java and uses them 
 *to find the mean, median, high, low, and number of integers in the array.
 */

package cse360assign2;

public class Analytics extends OrderedIntList {

	/**
	 * Mean finds the average of the array and returns it.
	 * @return mean of the array, or -1 if array is empty.
	 */
	
	public double mean(){
		if(size == 0)
		{
			return -1;
		}

		double sum = 0.0;
		for(int pos = 0; pos < size; pos++)
		{
			sum = sum + array[pos];
		}

		double mean = sum / size;
		return mean;
	}

	/**
	 * Median finds the middle number of the sorted array and returns it.
	 * @return median of array, or -1 if array is empty
	 */
	
	public int median(){
		if(size == 0)
		{
			return -1;
		}
		int median;

		if(size % 2 == 0)
		{
			median = (array[size / 2] + array[(size /2) - 1])/2;
		}
		else
		{
			median = (array[size / 2]);
		}

		return median;
	}

	/**
	 * High finds the largest number in the array and returns it. 
	 * @return the highest number in array, or -1 if list is empty. 
	 */
	
	public int high(){
		if(size == 0)
		{
			return -1;
		}

		int high = array[0];

		for(int pos = 0; pos < size; pos++)
		{
			if(array[pos] > high)
			{
				high = array[pos];
			}
		}
		return high;
	}

	/**
	 * Low finds the smallest number in array and returns it.
	 * @return the lowest number in array, or -1 if list is empty. 
	 */
	
	public int low(){
		if(size == 0)
		{
			return -1;
		}

		int low = array[0];

		for(int pos = 0; pos < size; pos++)
		{
			if(array[pos] < low)
			{
				low = array[pos];
			}
		}
		return low;
	}

	/**
	 * Finds how many integers are in the array and returns the number.
	 * @return the number of integers in the array. 
	 */
	public int numInts(){
		return size;
	}
}
