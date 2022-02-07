package SortingAlgorithms;

public class MergeSort
{
    
    public static void main (String [] args){
	
		//array inputs for testing
		int [] array = { 3,2,9,17,3,10,65,100,0,-1};
		int [] orderedArray = {-1, 0, 2, 3, 3, 9, 10, 17, 65, 100};
		
		//the meat of the algorithm
		array = mergeSort(array);
		orderedArray = mergeSort(orderedArray);

		//to print result
		printArray(array);
		printArray(orderedArray);
}

    public static void printArray(int [] array){
		//simply prints the array
    	for(int i=0; i<array.length; i++){
    		System.out.print(array[i] + " ");
    	}
    	System.out.println();
    
    }
    
    public static int [] mergeSort(int [] array){
		//base case
    	if (array.length <=1)
    		return array;
    
		//finding midpoint to split the array
		//special calculation if array.length is odd
    	int midPoint = array.length/2;
    	int [] leftArray = new int [midPoint];
    	int [] rightArray;
    	if (array.length % 2 == 0) //if even length
    		rightArray = new int [midPoint];
    	else //if odd length
    		rightArray = new int [midPoint + 1];
    
		//populating the leftArray
		for(int i=0; i<midPoint; i++){
			leftArray[i] = array[i];
		}
		
		//populating the rightArray
		for(int j=0; j<rightArray.length; j++){
			rightArray[j] = array[midPoint + j];
		}
		
		//splitting left and right array until each aray has 1 element recursively
		leftArray = mergeSort(leftArray);
		rightArray = mergeSort(rightArray);
		
		//merging the left and right array in sorted order
		int [] result = new int [array.length];
		result = merge(leftArray, rightArray);
		return result;
    }
    
    public static int [] merge(int [] left, int [] right){
		int [] result = new int [left.length + right.length ];
		int leftPointer, rightPointer, resultPointer;
		leftPointer = rightPointer = resultPointer = 0;
		
		//loops until either left or right array has elements
		while(leftPointer < left.length || rightPointer < right.length){
			//when both right and left array has elements
			if(leftPointer <left.length && rightPointer < right.length){ 
				// if the current left array element smaller than right array element
				// we place the left array element in the result array and increment left and result pointers
				// flip the 'less than' to 'greater than' to sort in descending order
				if(left[leftPointer] < right[rightPointer]) 
					result[resultPointer++] = left[leftPointer++];

				//if it's the opposite
				// we increment right and the result pointer
				else{
					result[resultPointer++] = right[rightPointer++];
				}
			}
			//when only left has elements
			else if (leftPointer < left.length){ 
				result[resultPointer++] = left[leftPointer++];
			}
			//when only right has elements
			else{ 
				result[resultPointer++] = right[rightPointer++];
			}
		}
		
		return result;
    
    }

}


