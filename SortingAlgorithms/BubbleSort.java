public class BubbleSort {

    public static void main(String [] args){
        int [] inputArray = {5,6,7,1,2,0,5,2,-3,10,100,14};
        System.out.print("Unsorted array ");
        printArray(inputArray);
        int [] inputArray2 = bubbleSort(inputArray);
        System.out.print("Sorted array ");
        printArray(inputArray2);
        
    }

    public static int [] bubbleSort(int [] array){
        Boolean swapped = true;
        int counter = array.length -1;
        while(swapped){
            swapped = false;
            for(int i = 0; i<counter; i++){
                if(array[i]>array[i+1]){
                    swapped = true;
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            counter--;
        }

        return array;
    }

    public static void printArray(int [] array){
		//simply prints the array
    	for(int i=0; i<array.length; i++){
    		System.out.print(array[i] + " ");
    	}
    	System.out.println();
    
    }
    
}
