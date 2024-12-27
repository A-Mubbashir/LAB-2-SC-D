////Name: Ramesha Javed, Roll no. : 2022f-BSE-194
package lab5hometask1.arraybinarysearch;
import java.util.Arrays;
public class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] arrayBinarySearch = new int[20];
        for (int i = 0; i <    arrayBinarySearch.length; i++){
            arrayBinarySearch[i] = i * 2;}
        int searchValue = 12;
        int resultIndex = binarySearch(arrayBinarySearch, searchValue);        
        System.out.println("Element "+ searchValue + " found at index " + resultIndex);}
    public static int binarySearch(int[] array, int value){
        int low = 0;
        int high = array.length - 1;
        while(low <= high){
            int mid = (low + high) /  2;
            if(array[mid] == value){
                return mid;
            }else if (array[mid] < value){
                low = mid + 1;
            }else{ 
                high = mid - 1;}}
        return -1;}}

