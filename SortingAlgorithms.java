import java.util.*;

public class SortingAlgorithms
{
	public static void bubbleSort(int inArray[], boolean needPrint)
	{
		int swaps = 0;
		int compares = 0;
		int listLen = inArray.length;
                
		for (int x = 0;x< listLen-1; x++)   
		{ 
			for (int y = 0;y< listLen-x-1; y++)
			{   
				compares++;
				if (inArray[y] > inArray[y+1])
				{
					swaps++;
					int temp = inArray[y];
					inArray[y] = inArray[y+1];
					inArray[y+1] = temp;
				}
			}
		}
		if (needPrint == true)
		{
			System.out.print(String.format("%d, %d, ", swaps, compares));
		}
	}
	
	public static void selectionSort(int inArray[], boolean needPrint)
	{
		int swaps = 0;
		int compares = 0;
		int listLen = inArray.length;
        
		for (int x = 0;x < listLen; x++) 
		{
			int lowestIndex = x;
			for (int y = x; y < listLen; y++)
			{
				compares++;
				if (inArray[x] < inArray[y]) 
				{
					swaps++;
					int temp = inArray[x];
					inArray[x] = inArray[lowestIndex];
					inArray[lowestIndex] = temp;
				}
			}
		}
		if (needPrint == true)
		{
			System.out.print(String.format("%d, %d, ", swaps, compares));
		}
	}
	
	public static void insertionSort(int[] inArray, boolean needPrint)
    {
        int swaps = 0;
        int compares = 0;
        int listLen = inArray.length;
        for(int x = 1; x < listLen;x++)
        {
            for(int y = 1; y < x;y++)
            {
                compares++;
                while(inArray[y] < inArray[y-1])
                {
                    int temp = inArray[y];
                    inArray[y] = inArray[y-1];
                    inArray[y-1] = temp;
                    swaps++;
                }
            }
        }
        if (needPrint == true)
		{
			System.out.print(String.format("%d, %d, ", swaps, compares));
		}
    }
	
	//quickSort Functions
	
	static int[] partition(int[] inArray, int low, int high)
	{
		int swaps = 0;
		int compares = 0;
		int pivot = inArray[low];
		int endOfList = low; 
		int mid = (low + high)/2;

		int temp = inArray[low];
		inArray[low] = inArray[mid];
		inArray[mid] = temp;
		
		pivot = inArray[low];double[] times = benchMark(getArray(size, size+1));
			
			int[] test1 = getArray(size, size+1);
			int[] test2 = getArray(size, size+1);
			int[] test3 = getArray(size, size+1);
			int[] test4 = getArray(size, size+1);
			
			bubbleSort(test1, true);
			System.out.println(times[0]);
			selectionSort(test2, true);
			System.out.println(times[1]);
			insertionSort(test3, true);
			System.out.println(times[2]);
			quickSort(test4, 0, test4.length-1, true);
			System.out.println(times[3]);
		
		for (int x = low + 1; x <= high; x++)
		{
		
			if (inArray[x] < pivot)
			{
				endOfList++;
				temp = inArray[endOfList];
				inArray[endOfList] = inArray[x];
				inArray[x] = temp;
		
				swaps++;
			 }
			 compares++;
		}
		
		temp = inArray[low];
		inArray[low] = inArray[endOfList];
		inArray[endOfList] = temp;
		
		int[] uTemp = {endOfList, swaps, compares};
		return uTemp;
	}
	
	static void quickSort(int[] inArray, int low, int high, boolean needPrint)
	{
		int swaps = 0;
		int compares = 0;
		int pivot;
		int[] temp; 
		
		if (low < high)
		{

			temp = partition(inArray, low, high);
			pivot = temp[0];double[] times = benchMark(getArray(size, sizedouble[] times = benchMark(getArray(size, size+1));
			
			int[] test1 = getArray(size, size+1);
			int[] test2 = getArray(size, size+1);
			int[] test3 = getArray(size, size+1);
			int[] test4 = getArray(size, size+1);
			
			bubbleSort(test1, true);
			System.out.println(times[0]);
			selectionSort(test2, true);
			System.out.println(times[1]);
			insertionSort(test3, true);
			System.out.println(times[2]);
			quickSort(test4, 0, test4.length-1, true);
			System.out.println(times[3]);double[] times = benchMark(getArray(size, size+1));
			
			int[] test1 = getArray(size, size+1);
			int[] test2 = getArray(size, size+1);
			int[] test3 = getArray(size, size+1);
			int[] test4 = getArray(size, size+1);
			
			bubbleSort(test1, true);
			System.out.println(times[0]);
			selectionSort(test2, true);
			System.out.println(times[1]);
			insertionSort(test3, true);
			System.out.println(times[2]);
			quickSort(test4, 0, test4.length-1, true);
			System.out.println(times[3]);double[] times = benchMark(getArray(size, size+1));
			
			int[] test1 = getArray(size, size+1);
			int[] test2 = getArray(size, size+1);
			int[] test3 = getArray(size, size+1);
			int[] test4 = getArray(size, size+1);
			
			bubbleSort(test1, true);
			System.out.println(times[0]);
			selectionSort(test2, true);
			System.out.println(times[1]);
			insertionSort(test3, true);
			System.out.println(times[2]);
			quickSort(test4, 0, test4.length-1, true);
			System.out.println(times[3]);double[] times = benchMark(getArray(size, size+1));
			
			int[] test1 = getArray(size, size+1);
			int[] test2 = getArray(size, size+1);
			int[] test3 = getArray(size, size+1);
			int[] test4 = getArray(size, size+1);
			
			bubbleSort(test1, true);
			System.out.println(times[0]);
			selectionSort(test2, true);
			System.out.println(times[1]);
			insertionSort(test3, true);
			System.out.println(times[2]);
			quickSort(test4, 0, test4.length-1, true);
			System.out.println(times[3]);double[] times = benchMark(getArray(size, size+1));
			
			int[] test1 = getArray(size, size+1);
			int[] test2 = getArray(size, size+1);
			int[] test3 = getArray(size, size+1);
			int[] test4 = getArray(size, size+1);
			
			bubbleSort(test1, true);
			System.out.println(times[0]);
			selectionSort(test2, true);
			System.out.println(times[1]);
			insertionSort(test3, true);
			System.out.println(times[2]);
			quickSort(test4, 0, test4.length-1, true);
			System.out.println(times[3]);double[] times = benchMark(getArray(size, size+1));
			
			int[] test1 = getArray(size, size+1);
			int[] test2 = getArray(size, size+1);
			int[] test3 = getArray(size, size+1);
			int[] test4 = getArray(size, size+1);
			
			bubbleSort(test1, true);
			System.out.println(times[0]);
			selectionSort(test2, true);
			System.out.println(times[1]);
			insertionSort(test3, true);
			System.out.println(times[2]);
			quickSort(test4, 0, test4.length-1, true);
			System.out.println(times[3]);double[] times = benchMark(getArray(size, size+1));
			
			int[] test1 = getArray(size, size+1);
			int[] test2 = getArray(size, size+1);
			int[] test3 = getArray(size, size+1);
			int[] test4 = getArray(size, size+1);
			
			bubbleSort(test1, true);
			System.out.println(times[0]);
			selectionSort(test2, true);
			System.out.println(times[1]);
			insertionSort(test3, true);
			System.out.println(times[2]);
			quickSort(test4, 0, test4.length-1, true);
			System.out.println(times[3]);+1));
			
			int[] test1 = getArray(size, size+1);
			int[] test2 = getArray(size, size+1);
			int[] test3 = getArray(size, size+1);
			int[] test4 = getArray(size, size+1);
			
			bubbleSort(test1, true);
			System.out.println(times[0]);
			selectionSort(test2, true);
			System.out.println(times[1]);
			insertionSort(test3, true);
			System.out.println(times[2]);
			quickSort(test4, 0, test4.length-1, true);
			System.out.println(times[3]);
			swaps+= temp[1];
			compares+= temp[2];
			double[] times = benchMark(getArray(size, size+1));double[] times = benchMark(getArray(size, size+1));
			
			int[] test1 = getArray(size, size+1);
			int[] test2 = getArray(size, size+1);
			int[] test3 = getArray(size, size+1);
			int[] test4 = getArray(size, size+1);
			
			bubbleSort(test1, true);
			System.out.println(times[0]);
			selectionSort(test2, true);
			System.out.println(times[1]);
			insertionSort(test3, true);
			System.out.println(times[2]);
			quickSort(test4, 0, test4.length-1, true);
			System.out.println(times[3]);
			
			int[] test1 = getArray(size, size+1);
			int[] test2 = getArray(size, size+1);
			int[] test3 = getArray(size, size+1);
			int[] test4 = getArray(size, size+1);
			
			bubbleSort(test1, true);
			System.out.println(times[0]);
			selectionSort(test2, true);
			System.out.println(times[1]);
			insertionSort(test3, true);
			System.out.println(times[2]);
			quickSort(test4, 0, test4.length-1, true);
			System.out.println(times[3]);
			quickSort(inArray, low, pivot-1, false);
			quickSort(inArray, pivot+1, high, false);
		}
		
		if (needPrint == true)
		{double[] times = benchMark(getArray(size, size+1));
			
			int[] test1 = getArray(size, size+1);
			int[] test2 = getArray(size, size+1);
			int[] test3 = getArray(size, size+1);
			int[] test4 = getArray(size, size+1);
			
			bubbleSort(test1, true);
			System.out.println(times[0]);
			selectionSort(test2, true);
			System.out.println(times[1]);
			insertionSort(test3, true);
			System.out.println(times[2]);
			quickSort(test4, 0, test4.length-1, true);
			System.out.println(times[3]);
			System.out.print(String.format("%d, %d, ", swaps, compares));
		}

	}
	
    public static void printArray(int inArray[])double[] times = benchMark(getArray(size, size+1));
			
			int[] test1 = getArray(size, size+1);
			int[] test2 = getArray(size, size+1);
			int[] test3 = getArray(size, size+1);double[] times = benchMark(getArray(size, size+1));
			
			int[] test1 = getArray(size, size+1);
			int[] test2 = getArray(size, size+1);
			int[] test3 = getArray(size, size+1);
			int[] test4 = getArray(size, size+1);
			
			bubbleSort(test1, true);
			System.out.println(times[0]);
			selectionSort(test2, true);
			System.out.println(times[1]);
			insertionSort(test3, true);
			System.out.println(times[2]);
			quickSort(test4, 0, test4.length-1, true);
			System.out.println(times[3]);
			int[] test4 = getArray(size, size+1);
			
			bubbleSort(test1, true);
			System.out.println(times[0]);
			selectionSort(test2, true);
			System.out.println(times[1]);
			insertionSort(test3, true);
			System.out.println(times[2]);
			quickSort(test4, 0, test4.length-1, true);
			System.out.println(times[3]);
    {
        for (int x = 0; x < inArray.length; x++)
        {
			System.out.print(inArray[x] + " ");
		}
        System.out.println();double[] times = benchMark(getArray(size, size+1));
			
			int[] test1 = getArray(size, size+1);
			int[] test2 = getArray(size, size+1);
			int[] test3 = getArray(size, size+1);
			int[] test4 = getArray(size, size+1);
			
			bubbleSort(test1, true);
			System.out.println(times[0]);
			selectionSort(test2, true);
			System.out.println(times[1]);
			insertionSort(test3, true);
			System.out.println(times[2]);
			quickSort(test4, 0, test4.length-1, true);
			System.out.println(times[3]);
    }
    
    public static int[] getArray(int length, int limit)
    {
		int[] output = new int[length];
		Random random = new Random();
		
		for (int x = 0; x < length; ++x)
		{
			int randInt = random.nextInt(limit);
			output[x] = randInt;
		}
		return output;
	}
	
	public static double[] benchMark(int[] sampleArray)
	{	
		double[] times = new double[4];
		int[] test1 = sampleArray;
		int[] test2 = sampleArray;
		int[] test3 = sampleArray;
		int[] test4 = sampleArray;
		
		long start = System.nanoTime();
		bubbleSort(test1, false);
		long end = System.nanoTime();
		times[0] = (end-start)/1e9;
		
		start = System.nanoTime();
		selectionSort(test2, false);
		end = System.nanoTime();
		times[1] = (end-start)/1e9;
		
		start = System.nanoTime();
		insertionSort(test3, false);
		end = System.nanoTime();
		times[2] = (end-start)/1e9;
		
		start = System.nanoTime();
		quickSort(test4, 0, test4.length-1, false);
		end = System.nanoTime();
		times[3] = (end-start)/1e9;
		return times;
	}

 
	public static void main(String args[])
	{
		int i=0;
        while(true)
        {
            int size=(int)Math.pow(2,i);
            i+=1;
            
			double[] times = benchMark(getArray(size, size+1));
			
			int[] test1 = getArray(size, size+1);
			int[] test2 = getArray(size, size+1);
			int[] test3 = getArray(size, size+1);
			int[] test4 = getArray(size, size+1);
			
			bubbleSort(test1, true);
			System.out.println(times[0]);
			selectionSort(test2, true);
			System.out.println(times[1]);
			insertionSort(test3, true);
			System.out.println(times[2]);
			quickSort(test4, 0, test4.length-1, true);
			System.out.println(times[3]);
		}
	}
}
