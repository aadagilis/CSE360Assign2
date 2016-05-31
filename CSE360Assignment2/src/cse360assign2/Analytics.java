package cse360assign2;

public class Analytics extends OrderedIntList {

	public double mean(){
		if(size == 0)
		{
			return -1;
		}

		int sum = 0;
		for(int pos = 0; pos < size; pos++)
		{
			sum = sum + array[pos];
		}

		double mean = sum / size;
		return mean;
	}

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

	public int numInts(){
		return size;
	}
}
