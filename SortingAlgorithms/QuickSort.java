package SortingAlgorithms;

import java.util.*;

public class QuickSort{
    public static void main(String [] args){
        int [] array = {3,2,9,17,3,10,65,100,0,-1};
        quickSort(array, 0, array.length - 1);
        printArray(array);
    }
    
    public static void quickSort(int [] array, int lowIndex, int highIndex){
        //base case
        if(lowIndex >= highIndex)
            return;
    
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        //gets a random pivotIndex, then swaps that with the number at highIndex so that computation is easier
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        swap(array, pivotIndex, highIndex);
        int pivot = array[highIndex];
        
    
        //loop through entire subarray
        while(leftPointer < rightPointer){
            //gets the leftPointer to a number greater than pivot
            while(array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            //gets the rightPointer to a number less than the pivot
            while(array[rightPointer] > pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            
            //swaps those two numbers
            swap(array, leftPointer, rightPointer);
        }

        //places the pivot between the less than and greater than portion
        swap(array, highIndex, leftPointer);
        
        //recursive calls for left and right sub arrays
        quickSort(array, lowIndex, leftPointer-1);
        quickSort(array, leftPointer+1, highIndex);
    }
    
    public static void swap(int [] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void printArray(int [] array){
		//simply prints the array
    	for(int i=0; i<array.length; i++){
    		System.out.print(array[i] + " ");
    	}
    	System.out.println();
    
    }
}
    