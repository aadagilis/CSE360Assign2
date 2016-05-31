/**
 *Name: Aubree Dagilis
 *PIN: 16
 *Description: This class organizes an array into ascending order and stays in 
 *ascending order when a new integer is inserted.  It also grows the array if it
 *exceeds the array size and prints the current list. 
 */

package cse360assign2;

public class OrderedIntList {
	protected int[] array;  
	protected int size; 
	private boolean debug;

	/**
	 *Constructor
	 *This method initializes the array size.
	 */

	OrderedIntList()
	{
		array = new int[10];
		debug = true;
	}

	/**
	 * The insert method inserts a new integer into the array in ascending order.
	 * @param newInt: passes in an integer from the main method.
	 */

	public void insert(int newInt) 
	{
		if(size == array.length)
		{
			grow();
		}
		
		if(size == 0)
		{
			array[0] = newInt;
			size++;
			
			if(debug)
			{
				System.out.println("Debug - pos: " + array[0]);
				System.out.println("Debug - int: " + newInt);
			}
		}
		
		else 
		{
			int minimum = 0;
			
			for (int pos = 0; pos < size; pos++)
			{
				if(newInt < array[pos])
				{
					if(debug)
					{
						System.out.println("Debug - pos:  " + pos);
						System.out.println("Debug - int: " + newInt);
					}
					break;
				}
				minimum++;
			}
			
			for (int pos = size; pos > minimum; pos--)
			{
				array[pos] = array[pos-1];
				
				if(debug)
				{
					System.out.println("Debug - pos:  " + pos);
					System.out.println("Debug - int: " + newInt);
				}
			}
			
			array[minimum] = newInt; 
			if(debug)
			{
				System.out.println("Debug - pos:  " + array[minimum]);
				System.out.println("Debug - int: " + newInt);
			}
			size++;
		}
	}

	/**
	 * The grow method grows the array if the original array limit has been exceeded
	 */

	private void grow()
	{
		int [] newArray = new int[size * 2];
		
		for (int pos = 0; pos < size; pos++)
		{
			newArray[pos] = array[pos];
			
		}
		
		if(debug)
		{
			System.out.println("Array grows to: " + (size * 2));
		}
		
		array = newArray;
	}

	/**
	 * The print method prints the integers in the array.
	 */

	public void print () 
	{
		for (int index = 0; index < size; index++) 
		{
			if (index % 5 == 0)
			{
				System.out.println();
			}
			System.out.print(array[index] + "\t");	
		}
		System.out.println();
	}
}
