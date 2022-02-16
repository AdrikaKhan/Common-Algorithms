/**
 * Lessons: 
 * You only need to initialize either the end or the start of each iteration. 
 * The other bound cshould stay the same.
 * Don't forget to recalculate mid each time
 */
public class BinarySearch{
    public static void main (String [] args){
        int [] array = new int [] {1,2,3,4,5,6,7,8,9,10,11};

        //tests for each number in the array including a number not in the array
        for(int i=0; i<=11; i++){
            int num = i;
            recursiveBinarySearch(array, num, 0, array.length-1);
            iterativeBinarySearch(array, num);
        }
    }
    
    
    public static void recursiveBinarySearch(int [] array, int num, int start, int end){
        if (start>end){
            System.out.println(-1);
            return;
        }
        int mid = (end - start /2) + start;
        if(array[mid]==num){
            System.out.println(mid);
            return;
        }
        else{
        if(array[mid]>num)
            recursiveBinarySearch(array, num, start, mid-1);
        else{
            recursiveBinarySearch(array, num, mid+1, end);
            }
        }       
    }

    public static void iterativeBinarySearch(int [] array, int num){
        int start =0, end = array.length -1;
        int mid = ((end - start)/2) + start;
        while(start <= end){
            //System.out.println("start: " + start+ " mid: "+ mid + " end: " + end + " array[mid]: " + array[mid]);
            if(array[mid] == num){
                System.out.println(mid);
                return;
            }
            else{
                if(array[mid]>num){
                    end = mid - 1;
                    mid = ((end - start)/2) + start;
                }
                else{
                    start = mid +1;
                    mid = ((end - start)/2) + start;
                }
                
            }
        }
        System.out.println(-1);
    }
}
    